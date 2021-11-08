package com.yy.study.single;

/**
 * 懒汉单例模式
 */
public class SingletonLazy {

    private static SingletonLazy mInstance = null;
    //构造函数私有，防止非法new
    private SingletonLazy(){

    }
    //通过 synchronized 保证多线程下单例对象唯一性
    //问题: 多余的同步消耗资源
    public static synchronized SingletonLazy getInstance(){
        if(mInstance == null){
            mInstance = new SingletonLazy();
        }
        return mInstance;
    }

    public void test(){
        System.out.println(getClass().getSimpleName()+".test()" + "hashcode:" + hashCode());
    }
}
