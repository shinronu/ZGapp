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
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;

@SuppressWarnings("unused")
public class Faaliyetler extends Activity{
	 TextView txt_help_gest;
	 public static final int duration = 1000;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zgt_faaliyetler);   
        MaakTekst();
        txt_help_gest = (TextView) findViewById(R.id.txt_help_gest);
        createAnimation();
        //txt_help_gest.setVisibility(View.GONE);
    }   
    
	public void MaakTekst(){
		TextView tv1 = (TextView)findViewById(R.id.TextView1);
		tv1.setText("Faaliyetler");		
	}

//	 public static void runTranslateAnimation(Activity act, int viewId) {
//	        Animation translateanim  = AnimationUtils.loadAnimation(act, R.anim.translate);
//	        if(translateanim == null){
//	        	return;
//	        }
//	        translateanim.reset();
//	        View v = act.findViewById(viewId);
//	        if (v != null){
//	        	v.clearAnimation();
//	        	v.startAnimation(translateanim);
//	        }
//	    }
//	 
//	 public static void runAlphaAnimation(Activity act, int viewId) {
//	        Animation alphaanim  = AnimationUtils.loadAnimation(act, R.anim.translate);
//	        if(alphaanim == null){
//	        	return;
//	        }
//	        alphaanim.reset();
//	        View v = act.findViewById(viewId);
//	        if (v != null){
//	        	v.clearAnimation();
//	        	v.startAnimation(alphaanim);
//	        }
//	    }
//	
	 private Animation createAnimation(){
		 Animation fadein = new AlphaAnimation(0, 1);
		 fadein.setDuration(duration);
		 fadein.setFillAfter(true);
		 Animation slide = new TranslateAnimation(0, 0, -100, 100);
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
		createAnimation();
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
