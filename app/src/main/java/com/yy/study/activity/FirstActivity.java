package com.yy.study.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.yy.study.R;

public class FirstActivity extends AppCompatActivity {
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
        Log.d(TAG,"onNewIntent: 通过\"singleTop\"在栈顶的第二次打开、\"singleTask\"或\"singleInstance\"-不在栈顶第二次打开触发--------1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart: \"Home键后再次回到APP触发\" 、\"singleTask\"或\"singleInstance\"-不在栈顶第二次打开触发------2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart :Activity已经可见，但还未出现在前台，无法和用户交互");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume: Activity已经可见，出现在前台，开始和用户交互");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause: Activity正在停止中..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop: Activity已经不可见，停止和用户交互");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy: Activity开始销毁");
    }

    @Override
    public void finish() {
        super.finish();
        Log.d(TAG,"finish");
    }

}