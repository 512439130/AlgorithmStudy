package com.yy.study.handler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.yy.study.R;
import com.yy.study.handler.runnable.MainRunnable;
import com.yy.study.handler.runnable.WorkRunnable;
import com.yy.study.handler.runnable.WorkRunnable1;
import com.yy.study.handler.runnable.WorkRunnable2;

import androidx.annotation.NonNull;


public class HandlerActivity extends BaseActivity implements View.OnClickListener {
    private static final String TAG = "HandlerActivity";
    private Button mBtnChildToMain;
    private Button mBtnMainToChild;
    private Button mBtnChildToChild;

    BaseActivityHandler mainHandler = new BaseActivityHandler(this);

    @Override
    public void doHandler(Message msg) {
        if (msg.what == Constant.Handler.WORK_TO_MAIN) {
            Log.d(TAG, "Thread-Id-CHILD_TO_MAIN:" + Thread.currentThread().getId());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_handler;
    }

    @Override
    protected void init() {
        mBtnChildToMain = findViewById(R.id.btn_child_to_main);
        mBtnMainToChild = findViewById(R.id.btn_main_to_child);
        mBtnChildToChild = findViewById(R.id.btn_child_to_child);
        mBtnChildToMain.setOnClickListener(this);
        mBtnMainToChild.setOnClickListener(this);
        mBtnChildToChild.setOnClickListener(this);

        mBtnChildToMain.post(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    private void testWorkToMain() {
        //开启一个子UI线程，在子线程通过主线程的handler发送消息，主线程handler处理消息
        MainRunnable mainRunnable = new MainRunnable(mainHandler);
        new Thread(mainRunnable).start();

//        //2
//        Handler testHandler = new Handler(new Handler.Callback() {
//            @Override
//            public boolean handleMessage(@NonNull Message msg) {
//                Log.d(TAG,"MESSAGE-handleMessage-new Handler.Callback");
//                return true;
//            }
//        });
//        Message message2 = Message.obtain();
//        message2.what = 222;
//        testHandler.sendMessage(message2);
//
//        Handler test2Handler = new Handler(Looper.getMainLooper()){
//            @Override
//            public void handleMessage(@NonNull Message msg) {
//                Log.d(TAG,"MESSAGE-handleMessage");
//                if(msg.what == 888){
//                    Log.d(TAG,"MESSAGE-handleMessage-888");
//                }
//            }
//        };
////        //1
//        test2Handler.post(new Runnable() {
//            @Override
//            public void run() {
//                Log.d(TAG,"MESSAGE-POST-Runnable");
//            }
//        });

//        //1
//        Message message = Message.obtain(test2Handler, new Runnable() {
//            @Override
//            public void run() {
//                Log.d(TAG,"MESSAGE-Runnable");
//            }
//        });
//        message.what = 666;
//        test2Handler.sendMessage(message);
//
//        //3
//        Message message888 = Message.obtain();
//        message888.what = 888;
//        test2Handler.sendMessage(message888);
    }

    private void testMainToWork() {
        Log.d(TAG, "MainToChild-sendMessage:" + Thread.currentThread().getId());
        //工作线程
        WorkRunnable workRunnable = new WorkRunnable();
        //开启工作线程
        //在工作线程中实例化Handler，Looper
        new Thread(workRunnable).start();

        //Message包装
        Message message = mainHandler.obtainMessage();
        message.what = Constant.Handler.MAIN_TO_WORK;

        //线程异步任务，mHandler和mLooper可能为空
        while (true) {
            System.out.println("while......MainToChild");
            if (workRunnable.mHandler != null) {
                //在主线程通过子线程的handler发送消息，子线程处理消息
                workRunnable.mHandler.sendMessage(message);
                return;
            }
        }
    }


    private void testWorkToWork() {
        //工作线程1创建 Handler和 looper
        WorkRunnable1 workRunnable1 = new WorkRunnable1();
        new Thread(workRunnable1).start();

        while (true) {
            System.out.println("while......ChildToChild");
            if (workRunnable1.mLooper != null) {
                WorkRunnable2 workRunnable2 = new WorkRunnable2(workRunnable1.mHandler);
                new Thread(workRunnable2).start();
                return;
            }
        }
    }

    @Override
    protected void onDestroy() {
        //清除未发送的延迟消息
        if (mainHandler != null) {
            mainHandler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_child_to_main) {
            testWorkToMain();
        } else if (v.getId() == R.id.btn_main_to_child) {
            testMainToWork();
        } else if (v.getId() == R.id.btn_child_to_child) {
            testWorkToWork();
        }
    }
}