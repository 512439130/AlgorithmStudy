package com.yy.study.handler.runnable;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.yy.study.handler.Constant;

public class MainRunnable implements Runnable{
    private static final String TAG = "MainRunnable";
    Handler handler;

    public MainRunnable(Handler handler){
        this.handler = handler;
    }

    @Override
    public void run() {
        Message message = handler.obtainMessage();
        message.what = Constant.Handler.WORK_TO_MAIN;
        handler.sendMessageDelayed(message,5000);
        Log.d(TAG,"Thread-Id-testChildToMain:" + Thread.currentThread().getId());

    }
}
