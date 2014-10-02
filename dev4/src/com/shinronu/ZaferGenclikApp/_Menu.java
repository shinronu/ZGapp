package com.shinronu.ZaferGenclikApp;
import com.example.dev4.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

@SuppressWarnings("unused")
public class _Menu extends Activity {
   	@Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.zgt_menu);   
        MaakImages();
        MaakTekst();
        MaakKnoppen();
    }   
    
    public void MaakTekst(){
    	TextView tv1 = (TextView)findViewById(R.id.textView1);
		tv1.setText("test auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msgtest auto msg");
    }
    public void MaakImages(){
    	//making the facebook hyperlink out of an image
		ImageView Facebook_logo = (ImageView)findViewById(R.id.facebook_logo);
		Facebook_logo.setClickable(true);
		Facebook_logo.setOnClickListener(new OnClickListener(){
			@Override
		    public void onClick(View v) {
				Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ZaferGenclik"));
		        startActivity(i);
		    }
		});
		// making the youtube hyperlink out of an image
		ImageView Youtube_logo = (ImageView)findViewById(R.id.youtube_logo);
		Youtube_logo.setClickable(true);
		Youtube_logo.setOnClickListener(new OnClickListener(){
		    @Override
		    public void onClick(View v) {
		        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/ZaferGenclikMG"));
		        startActivity(i);
		    }
		});
    }
    
    public void MaakKnoppen(){
    	Button button_faaliyet = (Button)findViewById(R.id.faaliyetler);
    	button_faaliyet.setClickable(true);
    	button_faaliyet.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(_Menu.this, Faaliyetler.class);
				_Menu.this.startActivity(intent1);
				_Menu.this.finish();

				//setContentView(R.layout.zgt_faaliyetler);	
			}});
    }
  // deze moeten nog naar onclicklisteners verwerkt worden in d MaakKnoppen()
    public void OpenFotoalbum(View v){
    	setContentView(R.layout.zgt_splash);
	}
    public void OpenAyarlar(View v){
    	setContentView(R.layout.zgt_splash);
	}
}
