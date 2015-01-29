package com.shinronu.ZaferGenclikApp;
import java.util.HashMap;
import java.util.List;

import com.example.dev4.R;
import com.shinronu.ZaferGenclikApp.Database.*;
import com.shinronu.ZaferGenclikApp.Login_Register.LoginActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

@SuppressWarnings("unused")
public class _Menu extends Activity {
   	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zgt_menu);   
        MaakImages();
        MaakTekst();
        MaakKnoppen();
        //startService(new Intent(_Menu.this, ZaferGenclikService.class));
    }   
    
    public void MaakTekst(){
    	TextView tv1 = (TextView)findViewById(R.id.textView1);
		tv1.setText("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui.");
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
			}});
    }
  // deze moeten nog naar onclicklisteners verwerkt worden in de MaakKnoppen()
    public void OpenFotoalbum(View v){
    	setContentView(R.layout.zgt_splash);
	}
    public void OpenAyarlar(View v){
    	Intent i = new Intent(this, LoginActivity.class);
    	this.startActivity(i);
    	//startService(new Intent(_Menu.this, ZaferGenclikService.class));
	}
}
