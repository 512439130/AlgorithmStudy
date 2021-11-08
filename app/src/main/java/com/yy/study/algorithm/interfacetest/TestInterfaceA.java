package com.yy.study.algorithm.interfacetest;

public interface TestInterfaceA {
    //接口中定义常量（会自动添加 public static final）
    int testA = 5;

    //定义接口
    void add(int i);

    //接口中的静态方法
    static void delete(int i){
        System.out.println("test-delete: "+i);
    }
    //接口的默认实现方法
    default void print(int i){
        System.out.println("test-print2:" + (testA + i));
    }

    static void main(String[] args) {
        TestInterfaceA testInterfaceA = new TestInterfaceA() {
            @Override
            public void add(int i) {
                System.out.println("test-add-TestInterface.testA:" + TestInterfaceA.testA);
                System.out.println("test-add-i:" + (TestInterfaceA.testA + i));
            }
        };
        testInterfaceA.add(10);
        TestInterfaceA.delete(666);
        testInterfaceA.print(555);
    }
}
