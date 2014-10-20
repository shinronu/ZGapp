package com.shinronu.ZaferGenclikApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.example.dev4.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;

@SuppressWarnings("unused")
public class Faaliyetler extends Activity{
	 TextView persembe_evsohbeti_content;
	 public static final int duration = 400;
	 public int state = 0;
	 
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zgt_faaliyetler);   
        MaakTekst();
        persembe_evsohbeti_content = (TextView) findViewById(R.id.persembe_evsohbeti_content);
        persembe_evsohbeti_content.setText("Yer: Huismanstraat 27B" + System.getProperty("line.separator") +"Saat: 19:30"+ System.getProperty("line.separator")+ "Konu: Mobile Development" );
        persembe_evsohbeti_content.setVisibility(View.GONE);
    }   
    
	public void MaakTekst(){
		TextView tv1 = (TextView)findViewById(R.id.TextView1);
		tv1.setText("Faaliyetler");		
	}
	
	 private Animation createAnimationIn(){
		 persembe_evsohbeti_content.setVisibility(View.VISIBLE);
		 Animation fadein = new AlphaAnimation(0, 1);
		 fadein.setDuration(duration);
		 fadein.setFillAfter(true);
		 Animation slide = new TranslateAnimation(150, 150, -100, 25);
		 slide.setDuration(duration);
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
		 fadein.setDuration(duration);
		 fadein.setFillAfter(true);
		 Animation slide = new TranslateAnimation(150, 150, 25, -100);
		 slide.setDuration(duration);
		 slide.setFillAfter(true);
		 AnimationSet animations = new AnimationSet(false);
		 animations.setFillAfter(true);
		 animations.addAnimation(fadein);
		 animations.addAnimation(slide);
		 return animations;
	 }
	 /**
	* onClick handler
	*/
	public void toggle_contents(View v){
		if (state == 0){
			persembe_evsohbeti_content.startAnimation(createAnimationIn());
			state++;
		} else {
			persembe_evsohbeti_content.startAnimation(createAnimationOut());
			state = 0;
		}
	}

	public void maakClickable() {
		TextView toggle_content = (TextView)findViewById(R.id.help_title_gest);
		toggle_content.setClickable(true);
		toggle_content.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				toggle_contents(v);
			}
		});
	}
	
	public void readtext (){
		try {
		    // Create a URL for the desired page
		    URL url = new URL("https://github.com/shinronu/ZGapp/thefile.txt");

		    // Read all the text returned by the server
		    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		    String str;
		    while ((str = in.readLine()) != null) {
		        // str is one line of text; readLine() strips the newline character(s)
		    }
		    in.close();
		} catch (MalformedURLException e) {
		} catch (IOException e) {
		}
	}
}
