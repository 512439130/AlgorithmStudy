package com.yy.study.handler.runnable;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import com.yy.study.handler.Constant;

import androidx.annotation.NonNull;

/**
 * 工作线程1
 */
public class WorkRunnable1 implements Runnable{
    private static final String TAG = "WorkRunnable";

    public Handler mHandler;
    public Looper mLooper;
    @Override
    public void run() {
        Looper.prepare();
        mHandler = new Handler(Looper.getMainLooper()){
            @Override
            public void handleMessage(@NonNull Message msg) {
                if (msg.what == Constant.Handler.WORK_TO_WORK) {
                    Log.d(TAG, "Work1-handleMessage:" + Thread.currentThread().getId());
                }
            }
        };
        mLooper = Looper.myLooper();
        Looper.loop();
    }
}
