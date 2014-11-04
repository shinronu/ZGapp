package com.shinronu.ZaferGenclikApp;
import java.util.Calendar;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
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
		Calendar calendar = Calendar.getInstance();
		Intent i = new Intent();
		PendingIntent pending = PendingIntent.getService(this, 0, intent, 0);
		AlarmManager alarm = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
		alarm.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 30*1000, pending);
		this.stopSelf();
	}
	public void onDestroy(){
		Log.d(TAG, "onDestroy code reached");
		super.onDestroy();
		Toast.makeText(this, "ZaferGenclikService has stopped", Timer).show();
	}
}
