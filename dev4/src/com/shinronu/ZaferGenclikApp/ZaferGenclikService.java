package com.shinronu.ZaferGenclikApp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class ZaferGenclikService extends Service {
	public final int Timer = 1000;
	public String TAG = "test service log";
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
	
	public void onStart(Intent intent, int startId){
		Log.d(TAG, "onStart code reached");
		Toast.makeText(this, "ZaferGenclikService has started", Timer).show();
		this.stopSelf();
	}
	public void onDestroy(){
		Log.d(TAG, "onDestroy code reached");
		super.onDestroy();
		Toast.makeText(this, "ZaferGenclikService has stopped", Timer).show();
	}
}
