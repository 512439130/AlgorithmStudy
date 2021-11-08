package com.yy.study.single;

public enum SingletonEnum {
    INSTANCE;
    public void test(){
        System.out.println(getClass().getSimpleName()+".test()" + "hashcode:" + hashCode());
    }
}
