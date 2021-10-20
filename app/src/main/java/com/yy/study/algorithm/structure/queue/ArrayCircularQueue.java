package com.yy.study.algorithm.structure.queue;

import java.util.Arrays;

/**
 * 循环队列(数组实现)
 */
public class ArrayCircularQueue {
    //存储元素的数组
    int[] queue;
    //最大容量
    int capacity;
    //头指针（取操作时，从左向右移动）
    int head;
    //实际队列长度
    int count;

    /** 构造器，设置队列长度为k **/
    public ArrayCircularQueue(int length) {
        this.capacity = length;
        queue = new int[length];
        head = 0;
        count = 0;
    }

    /** 向循环队列插入一个元素。如果成功插入则返回true **/
    public boolean enQueue(int value) {
        if(isFull()) return false;
        //求新插入位置，求余（取模）是为了防止数组溢出，循环存储
        System.out.println("入队操作 元素 ==>> " + value);
        int index = (head + count) % capacity;
        queue[index] = value;
        count++;
        return true;
    }
    /** 从循环队列中删除一个元素。如果成功删除则返回true **/
    public boolean deQueue() {
        if(isEmpty()) return false;
        //求余（取模）是为了防止数组溢出，循环存储
        System.out.println("出队操作 元素 ==>> " + queue[head]);
        head = (head + 1) % capacity;
        count--;
        return true;
    }

    /** 获取队首元素。如果队列为空，返回-1 **/
    public int Front() {
        if(isEmpty()) return -1;
        return queue[head];
    }

    /** 获取队尾元素。如果队列为空，返回 -1 **/
    public int Rear() {
        if(isEmpty()) return -1;
        //求尾指针位置，求余（取模）是为了防止数组溢出，循环存储
        int tail = (head + count - 1) % capacity;
        return queue[tail];
    }

    /** 检查循环队列是否为空 **/
    public boolean isEmpty() {
        return count == 0;
    }

    /** 检查循环队列是否已满 **/
    public boolean isFull() {
        return count == capacity;
    }

    public void print() {
        System.out.print("ArrayCircularQueue ==>> [");
        for (int i = head; i < (head + count); i++) {
            System.out.print(queue[i % capacity]);
            if (i != (head + count) - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
