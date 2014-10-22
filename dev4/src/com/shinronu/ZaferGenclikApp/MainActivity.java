package com.shinronu.ZaferGenclikApp;
import com.example.dev4.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {
	private final int SPLASH_DISPLAY_LENGHT = 1000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zgt_splash);
	        new Handler().postDelayed(new Runnable(){
	            @Override
	            public void run() {
	                Intent intent1 = new Intent(MainActivity.this, _Menu.class);
	                MainActivity.this.startActivity(intent1);
	                MainActivity.this.finish();
	            }
	        }, SPLASH_DISPLAY_LENGHT);
	    }
}
