package com.example.dev4;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.widget.Toast;

@SuppressWarnings("unused")
public class MainActivity extends ActionBarActivity {
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
