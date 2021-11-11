package com.yy.study.handler.runnable;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import com.yy.study.handler.Constant;

import androidx.annotation.NonNull;

/**
 * 工作线程
 */
public class WorkRunnable implements Runnable{
    private static final String TAG = "WorkRunnable";

    public Handler mHandler;
    public Looper mLooper;
    @Override
    public void run() {
        Looper.prepare();
        mHandler = new Handler(Looper.myLooper()){
            @Override
            public void handleMessage(@NonNull Message msg) {
                if (msg.what == Constant.Handler.MAIN_TO_WORK) {
                    Log.d(TAG, "WorkToChild-handleMessage:" + Thread.currentThread().getId());
                }
            }
        };
        mLooper = Looper.myLooper();
        Looper.loop();
    }
}
