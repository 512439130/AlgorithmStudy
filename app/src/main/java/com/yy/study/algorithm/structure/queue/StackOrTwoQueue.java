package com.yy.study.algorithm.structure.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 双队列实现栈
 */
public class StackOrTwoQueue {
    //数据队列
    Queue<Integer> dataQueue;
    //辅助队列
    Queue<Integer> assistQueue;

    public StackOrTwoQueue(){
        dataQueue = new LinkedList<>();
        assistQueue = new LinkedList<>();
    }

    public void push(int x){
        //插入新元素保证放在队列的队头
        assistQueue.offer(x);
        while (dataQueue.isEmpty()){
            assistQueue.offer(dataQueue.poll());
        }
        Queue<Integer> temp = assistQueue;
        assistQueue = dataQueue;
        dataQueue = temp;
    }

    public int pop(){
        if(dataQueue.isEmpty()) return -1;
        return dataQueue.poll();
    }

    public int top(){
        if(dataQueue.isEmpty()) return -1;
        return dataQueue.element();
    }

    public boolean isEmpty(){
        return dataQueue.isEmpty();
    }
}
