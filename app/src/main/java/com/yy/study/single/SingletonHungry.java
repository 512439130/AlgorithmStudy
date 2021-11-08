package com.yy.study.single;

/**
 * 饿汉单例模式
 */
public class SingletonHungry {
    //问题:生命静态对象常量时，已经创建了对象实例，有资源浪费
    // final: 保证对象全局的唯一性，避免反射的方式创建对象，还可以使用volatile来保证线程中对象的可见性
    // static: 类静态变量只会创建1次，保证对象可以在不同线程中访问，但无法保证不同线程中访问时是否为最新的值（不保证可见性），
    // static变量: 类首次加载后分配内存空间（方法区），被所有实例共享，static同步类的生命周期
    private static final SingletonHungry mInstance = new SingletonHungry();
    //构造函数私有，防止非法new
    private SingletonHungry(){

    }
    public static SingletonHungry getInstance(){
        return mInstance;
    }

    public void test(){
        System.out.println(getClass().getSimpleName()+".test()" + "hashcode:" + hashCode());
    }
}
