package com.yy.study.algorithm.interfacetest;

public interface TestInterfaceB extends TestInterfaceA{
    
    @Override
    void add(int i);

    @Override
    default void print(int i) {

    }

    //接口中创建类
    class InterfaceInnerClass{
        private String name;
        private InterfaceInnerClass(){

        }
    }
}
