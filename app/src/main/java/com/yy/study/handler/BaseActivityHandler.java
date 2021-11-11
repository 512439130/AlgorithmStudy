package com.yy.study.handler;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public abstract class BaseActivityHandler extends Handler {
    private WeakReference<Activity> weakReference;

    public BaseActivityHandler(Activity fragment) {
        this.weakReference = new WeakReference<>(fragment);
    }

    @Override
    public void handleMessage(@NonNull Message msg) {
        if (weakReference != null && weakReference.get() != null) {
            Activity activity = (Activity) weakReference.get();
            doHandler(activity, msg);
        }
    }

    abstract void doHandler(Activity fragment, Message message);
}
