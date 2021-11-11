package com.yy.study.handler;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public abstract class BaseFragmentHandler extends Handler {
    private WeakReference<Fragment> weakReference;

    public BaseFragmentHandler(Fragment fragment) {
        this.weakReference = new WeakReference<>(fragment);
    }

    @Override
    public void handleMessage(@NonNull Message msg) {
        if (weakReference != null && weakReference.get() != null && !weakReference.get().isRemoving()) {
            Fragment fragment = (Fragment) weakReference.get();
            doHandler(fragment, msg);
        }
    }

    abstract void doHandler(Fragment fragment, Message message);
}
