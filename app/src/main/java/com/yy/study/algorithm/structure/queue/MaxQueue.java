package com.yy.study.algorithm.structure.queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 最大值队列
 */
public class MaxQueue {
    //队列新增数据时，比较当前最大值和新增的数据，更新最大值
    //队列删除数据时
    //  1.删除的元素如果不是最大值，则最大值不变
    //  2.删除的元素如果是最大值，最大值要更改为剩余元素的最大值
    //使用额外的队列，来记录最大值发生的变化
    //max队列，对头元素时当前的最大值，而其他元素是未来可能成为最大值的候选值
    //  1.新增元素 element > max 时 ，取队列中队尾元素比较，如果满足，进行覆盖并且循环比较直到把所有比它小的值都覆盖为止
    //  2.新增元素 element < max 时，将其存到max队列中去

    //数据队列（队列）
    Queue<Integer> queue;
    //最大值候选值队列(双端队列)
    Deque<Integer> maxQueue;

    public MaxQueue() {
        queue = new LinkedList<>();
        maxQueue = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "MaxQueue{" +
                "queue=" + queue +
                '}';
    }

    /**
     * 当前的最大值
     */
    public int max_value() {
        if (maxQueue.isEmpty()) return -1;
        return maxQueue.peekFirst();
    }

    /**
     * 队列尾部插入一个数据
     */
    public void push_back(int value) {
        queue.offer(value);
        //新增元素 element > max 时 ，队尾元素和插入元素进行比较:
        //队尾元素小于插入元素，则先取出队尾元素（循环操作），再新插入元素
        //队尾元素大于插入元素，则直接在max队列尾部插入元素，进行覆盖并且循环比较直到把所有比它小的值都覆盖为止
        while (!maxQueue.isEmpty() && maxQueue.peekLast() < value) {
            //max队列 删除队尾元素
            maxQueue.pollLast();
        }
        //max队列 新增队尾元素
        maxQueue.offerLast(value);
    }

    /**
     * 队列头部取一个数据
     */
    public int pop_front() {
        if (queue.isEmpty()) return -1;
        //删除的元素如果是最大值，最大值要更改为剩余元素的最大值（更新max队列）
        if (!maxQueue.isEmpty() && queue.peek().equals(maxQueue.peekFirst())) {
            maxQueue.pollFirst();
        }
//        System.out.println(Arrays.toString(maxQueue.toArray()));

        return queue.poll();
    }
}
