package com.yy.study.single;

/**
 * 静态内部类实现单例模式
 */
public class SingletonStaticInner {
    //构造函数私有，防止非法new
    private SingletonStaticInner(){

    }
    private static class SingletonStaticInnerHolder{
        private static final SingletonStaticInner mInstance = new SingletonStaticInner();
    }
    //缺点: 无法传递参数

    //外部类被加载时，不会加载内部类，当第一次调用外部类getInstance时，内部类加载，则内部类的static成员mInstance在类加载时初始化完成
    // 1.保证单例对象的唯一性、保障线程安全、延迟单例实例化
    //因为JVM虚拟机会保证一个类在多线程环境下是被加锁，保证同步的:
    // 1.如果多个线程同时初始化一个类，那么只有一个线程独立去执行初始化的操作，其他线程需要阻塞等待，类初始化成功后，其他线程不会再去执行初始化操作，
    // 2.同一个加载器下，一个类只能被加载1次
    public static SingletonStaticInner getInstance(){
        return SingletonStaticInnerHolder.mInstance;
    }

    public void test(){
        System.out.println(getClass().getSimpleName()+".test()" + "hashcode:" + hashCode());
    }
}
