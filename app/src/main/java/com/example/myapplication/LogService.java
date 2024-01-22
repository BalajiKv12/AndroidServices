package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class LogService extends Service {

        public int onStartCommand(Intent intent, int flags, int startId)
        {
            double r;
            for(int i=1;i<=100;i++)
            {
                r = Math.log10(i);
                Log.i("Log Value ","Printing log value of "+i+" = "+r);
            }

            return START_STICKY;
        }



    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


}