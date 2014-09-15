package com.example.dev4;

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
	@Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.zgt_faaliyetler);   
        MaakTekst();
    }   
    
	public void MaakTekst(){
		TextView tv1 = (TextView)findViewById(R.id.TextView1);
		tv1.setText("Faaliyetler Faaliyetler");		
	}
}
