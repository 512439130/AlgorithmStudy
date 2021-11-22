package com.yy.study.task;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.yy.study.R;

public class SecondActivity extends Activity {
    private String TAG = "TEST-SecondActivity";

    private Button btnJumpMe;
    private Button btnJumpFirst;
    private Button btnJumpSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TAG = TAG +"-taskId: "+ getTaskId();
        Log.d(TAG,"onCreate");
        init();
    }

    private void testError() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String test = null;
                System.out.println(test.trim());
            }
        }).start();
    }

    private void init() {
        btnJumpMe = findViewById(R.id.btn_jump_me);
        btnJumpFirst = findViewById(R.id.btn_jump_first);
        btnJumpSecond = findViewById(R.id.btn_jump_third);
        btnJumpMe.setOnClickListener(view -> {
            Intent intent = new Intent(this,SecondActivity.class);
            startActivity(intent);
        });
        btnJumpFirst.setOnClickListener(view -> {
            Intent intent = new Intent(this, FirstActivity.class);
            startActivity(intent);
        });
        btnJumpSecond.setOnClickListener(view ->{
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