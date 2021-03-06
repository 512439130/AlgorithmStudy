package com.yy.study.task;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.yy.study.R;

import androidx.annotation.NonNull;

public class FirstActivity extends Activity {
    private String TAG = "TEST-FirstActivity";

    private Button btnJumpMe;
    private Button btnJumpSecond;
    private Button btnJumpThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TAG = TAG +"-taskId: "+ getTaskId();
        Log.d(TAG,"onCreate");
        init();
    }

    private void init() {
        btnJumpMe = findViewById(R.id.btn_jump_me);
        btnJumpSecond = findViewById(R.id.btn_jump_second);
        btnJumpThird = findViewById(R.id.btn_jump_third);
        btnJumpMe.setOnClickListener(view -> {
            Intent intent = new Intent(this, FirstActivity.class);
            startActivity(intent);
        });
        btnJumpSecond.setOnClickListener(view -> {
            Intent intent = new Intent(this,SecondActivity.class);
            startActivity(intent);
        });
        btnJumpThird.setOnClickListener(view ->{
            Intent intent = new Intent(this,ThirdActivity.class);
            startActivity(intent);
        });

        testError();
    }

    private void testError() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                double test = 1/0 ;
                System.out.println(test);
            }
        }).run();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG,"onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG,"onRestoreInstanceState");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG,"onNewIntent: ??????\"singleTop\"??????????????????????????????\"singleTask\"???\"singleInstance\"-?????????????????????????????????--------1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart: \"Home??????????????????APP??????\" ???\"singleTask\"???\"singleInstance\"-?????????????????????????????????------2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart :Activity???????????????????????????????????????????????????????????????");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume: Activity??????????????????????????????????????????????????????");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause: Activity???????????????..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop: Activity???????????????????????????????????????");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy: Activity????????????");
    }

    @Override
    public void finish() {
        super.finish();
        Log.d(TAG,"finish");
    }

}