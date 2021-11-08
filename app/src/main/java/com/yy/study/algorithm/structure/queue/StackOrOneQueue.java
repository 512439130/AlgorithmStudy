package com.yy.study.algorithm.structure.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 单队列实现栈
 */
public class StackOrOneQueue {
    Queue<Integer> queue;

    public StackOrOneQueue(){
        queue = new LinkedList<>();
    }

    public void push(int x){
        int size = queue.size();
        queue.offer(x);
        //插入新元素保证放在队列的队头
        for (int i = 0; i < size; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop(){
        if(queue.isEmpty()) return -1;
        return queue.poll();
    }

    public int top(){
        if(queue.isEmpty()) return -1;
        return queue.element();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
