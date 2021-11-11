package com.yy.study.single;

public enum SingletonEnum implements Cloneable{
    INSTANCE{
        @Override
        SingletonEnum getInstance() {
            return this;
        }
    };
    public void test(){
        System.out.println(getClass().getSimpleName()+".test()" + "hashcode:" + hashCode());
    }

    abstract SingletonEnum getInstance();
}
