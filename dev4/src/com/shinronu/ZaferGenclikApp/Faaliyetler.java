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
import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

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
        //runAlphaAnimation(this, a_checkbox.getId());
        //runAlphaAnimation(this, a_button.getId());

    }   
    
	public void MaakTekst(){
		TextView tv1 = (TextView)findViewById(R.id.TextView1);
		tv1.setText("Faaliyetler Faaliyetler");		
	}

	 public static void runTranslateAnimation(Activity act, int viewId) {
	        Animation animation  = AnimationUtils.loadAnimation(act, R.anim.translate);
	        if(animation == null){
	        	return;
	        }
	        animation.reset();
	        View v = act.findViewById(viewId);
	        if (v != null){
	        	v.clearAnimation();
	        	v.startAnimation(animation);
	        }
	    }
	/**
	* onClick handler
	*/
	public void toggle_contents(View v){
		runTranslateAnimation(this, txt_help_gest.getId());
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
