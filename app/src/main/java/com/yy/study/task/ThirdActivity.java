package com.yy.study.task;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.yy.study.R;
import com.yy.study.handler.HandlerActivity;

import androidx.annotation.NonNull;

public class ThirdActivity extends Activity {
    private String TAG = "TEST-ThirdActivity";

    private Button btnJumpMe;
    private Button btnJumpSecond;
    private Button btnJumpHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TAG = TAG +"-taskId: "+ getTaskId();
        Log.d(TAG,"onCreate");
        init();
    }

    private void init() {
        btnJumpMe = findViewById(R.id.btn_jump_me);
        btnJumpSecond = findViewById(R.id.btn_jump_second);
        btnJumpHandler = findViewById(R.id.btn_jump_handler);
        btnJumpMe.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        });
        btnJumpSecond.setOnClickListener(view -> {
            Intent intent = new Intent(this,SecondActivity.class);
            startActivity(intent);
        });
        btnJumpHandler.setOnClickListener(view -> {
            Intent intent = new Intent(this, HandlerActivity.class);
            startActivity(intent);
        });
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
        Log.d(TAG,"onNewIntent");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    public void finish() {
        super.finish();
        Log.d(TAG,"finish");
    }
}