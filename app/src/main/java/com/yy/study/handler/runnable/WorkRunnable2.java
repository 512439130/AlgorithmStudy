package com.yy.study.handler.runnable;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.yy.study.handler.Constant;

/**
 * 工作线程2
 */
public class WorkRunnable2 implements Runnable{
    private static final String TAG = "WorkRunnable";
    public Handler mHandler;
    public WorkRunnable2(Handler handler){
       this.mHandler = handler;
    }

    @Override
    public void run() {

        //工作线程2执行完任务，调用工作线程1的handler发送消息，子线程工作处理消息
        Message msg = mHandler.obtainMessage();
        msg.what =Constant.Handler.WORK_TO_WORK;
        mHandler.sendMessage(msg);
        Log.d(TAG, "Work2-sendMessage:" + Thread.currentThread().getId());
    }
}
