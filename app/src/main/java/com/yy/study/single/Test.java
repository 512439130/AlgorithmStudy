package com.yy.study.single;

import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();

        test.thread1();

        test.thread2();
    }

    public static void testSingle() {
        synchronized (Test.class){
            SingletonHungry.getInstance().test();
            SingletonLazy.getInstance().test();
            SingletonDCL.getInstance().test();
            SingletonStaticInner.getInstance().test();
            SingletonEnum.INSTANCE.getInstance().test();
        }

    }

    private void thread1(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1.run...");
                testSingle();
            }
        }).start();
    }

    private void thread2(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2.run...");
                testSingle();
            }
        }).start();
    }
}
