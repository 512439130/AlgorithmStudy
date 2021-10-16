package com.yy.study.algorithm.structure.queue;

import java.util.Arrays;

/**
 * 顺序队列
 */
public class ArrayQueue {
    /**
     * 最大容量
     */
    int maxCapacity;


    /**
     * 头指针
     */
    int head;
    /**
     * 尾指针
     */
    int tail;

    /**
     * 存储容器（数组）
     */
    int[] array;

    /**
     * 初始化队列
     * @param maxCapacity 最大容量
     */
    public ArrayQueue(int maxCapacity) {
        array = new int[maxCapacity];
        this.maxCapacity = maxCapacity;

        head = 0;
        tail = 0;
    }

    public int size() {
        return array.length;
    }

    /**
     * 队列是否满了
     *
     * @return
     */
    public boolean isFull() {
        return tail == maxCapacity;
    }

    /**
     * 队列是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return head == tail;
    }

    public boolean add(int value) {
        //先判断队列容量大小
        if (isFull()) return false;
        array[tail++] = value;
        return true;
    }

    public int get() {
        //先判断队列是否为空
        if (isEmpty()) return -1;
        return array[head++];
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        for (int i = 0; i < arrayQueue.size() + 1; i++) {
            System.out.println("入队" + arrayQueue.add(i));
            System.out.println("result:" + Arrays.toString(arrayQueue.array));
        }

        for (int i = arrayQueue.size() - 1; i >= 0; i--) {
            System.out.println("出队" + arrayQueue.get());
            System.out.println("result:" + Arrays.toString(arrayQueue.array));
        }
    }
}
