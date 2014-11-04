package com.shinronu.ZaferGenclikApp;

import java.io.IOException;
import java.net.MalformedURLException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.example.dev4.R;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

@SuppressWarnings("rawtypes")
public class Faaliyetler extends Activity{
	protected String ftp_url = "ftp://a3541642:52a21d87@0867502.herobo.com/public_html/persembe_sohbeti.txt";
	protected String URL = "https://github.com/shinronu/sohbetler/blob/master/persembe_sohbeti.txt";
	public TextView persembe_evsohbeti_content;
	public TextView persembe_evsohbeti_titel;
	public static final int animation_duration = 400;
	public static final int toastduration = 2000;
	public int animation_state = 0;	
	public String SYer;
	public String SSaat;
	public String SKonu;

	@SuppressWarnings("unchecked")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zgt_faaliyetler);   
		MaakTekst();
		persembe_evsohbeti_titel.setOnClickListener(onClickListener);
		(new Data_handler()).execute();
	}   

	public OnClickListener onClickListener = new OnClickListener(){
		public void onClick(View v){
			persembe_evsohbeti_content.setText(SYer + "\r\n" +  SSaat +  "\r\n"+ SKonu);
			toggle_contents(v);
		}
	};
	
	public void MaakTekst(){
		persembe_evsohbeti_content = (TextView) findViewById(R.id.persembe_evsohbeti_content);
		persembe_evsohbeti_content.setVisibility(View.GONE);
		persembe_evsohbeti_titel = (TextView) findViewById(R.id.persembe_evsohbeti_titel);
		
	}
	private Animation createAnimationIn(){
		persembe_evsohbeti_content.setVisibility(View.VISIBLE);
		Animation fadein = new AlphaAnimation(0, 1);
		fadein.setDuration(animation_duration);
		fadein.setFillAfter(true);
		Animation slide = new TranslateAnimation(150, 150, -100, 25);
		slide.setDuration(animation_duration);
		slide.setFillAfter(true);
		AnimationSet animations = new AnimationSet(false);
		animations.setFillAfter(true);
		animations.addAnimation(fadein);
		animations.addAnimation(slide);
		return animations;
	}
	private Animation createAnimationOut(){
		persembe_evsohbeti_content.setVisibility(View.VISIBLE);
		Animation fadein = new AlphaAnimation(1, 0);
		fadein.setDuration(animation_duration);
		fadein.setFillAfter(true);
		Animation slide = new TranslateAnimation(150, 150, 25, -100);
		slide.setDuration(animation_duration);
		slide.setFillAfter(true);
		AnimationSet animations = new AnimationSet(false);
		animations.setFillAfter(true);
		animations.addAnimation(fadein);
		animations.addAnimation(slide);
		return animations;
	}
	public void toggle_contents(View v){
		if (animation_state == 0){
			persembe_evsohbeti_content.startAnimation(createAnimationIn());
			animation_state++;
		} else {
			persembe_evsohbeti_content.startAnimation(createAnimationOut());
			animation_state = 0;
		}
	}
	
	@Override
	public void onBackPressed(){
		Intent i = new Intent(Faaliyetler.this, _Menu.class);
		this.startActivity(i);
	}
	
	private class Data_handler extends AsyncTask {		
		@Override
		protected Object doInBackground(Object... params) {
			try {
				Document doc = Jsoup.connect(URL).get();
				Elements Yer = doc.select("td#LC1");
				Elements Saat = doc.select("td#LC2");
				Elements Konu = doc.select("td#LC3");
				SYer = Yer.text(); 
				SSaat = Saat.text();
				SKonu = Konu.text();
			}	
			catch(MalformedURLException e){ 
			}	 
			catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
	}
}