package com.shinronu.ZaferGenclikApp;

import com.example.dev4.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

@SuppressWarnings("unused")
public class Faaliyetler extends Activity{
	 TextView txt_help_gest;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zgt_faaliyetler);   
        MaakTekst();
        txt_help_gest = (TextView) findViewById(R.id.txt_help_gest);
        txt_help_gest.setVisibility(View.GONE);
    }   
    
	public void MaakTekst(){
		TextView tv1 = (TextView)findViewById(R.id.TextView1);
		tv1.setText("Faaliyetler Faaliyetler");		
	}


	/**
	* onClick handler
	*/
	public void toggle_contents(View v){
	      txt_help_gest.setVisibility( txt_help_gest.isShown()
	                          ? View.GONE
	                          : View.VISIBLE );
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
}
