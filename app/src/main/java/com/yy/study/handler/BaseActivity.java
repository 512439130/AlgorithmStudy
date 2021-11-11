package com.yy.study.handler;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        init();
    }

    protected abstract int getLayoutId();

    protected abstract void init();

    public static class BaseActivityHandler extends Handler {
        private WeakReference<Activity> weakReference;

        public BaseActivityHandler(Activity fragment) {
            this.weakReference = new WeakReference<>(fragment);
        }

        @Override
        public void handleMessage(@NonNull Message msg) {
            if (weakReference != null && weakReference.get() != null) {
                BaseActivity activity = (BaseActivity) weakReference.get();
                activity.doHandler(msg);
            }
        }
    }

    public void doHandler(Message msg){

    }

}
