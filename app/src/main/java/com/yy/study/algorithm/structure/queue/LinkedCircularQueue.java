package com.yy.study.algorithm.structure.queue;

import com.yy.study.algorithm.structure.link.ListNode;

import java.util.List;

/**
 * 循环队列(链表实现)
 */
public class LinkedCircularQueue {
    //头结点
    ListNode head;
    //尾结点
    ListNode tail;
    //队列最大容量
    int capacity;
    //当前队列的实际容量（边界检查）
    int count;


    /** 构造器，设置队列长度为length **/
    public LinkedCircularQueue(int length) {
        this.capacity = length;
        count = 0;
    }

    /** 向循环队列插入一个元素。如果成功插入则返回true **/
    public boolean enQueue(int value) {
        if(isFull()) return false;
        System.out.println("入队操作 元素 ==>> " + value);
        if(count == 0){
            //初始化头结点尾结点
            head = new ListNode(value);
            tail = new ListNode(value);
        } else {
            ListNode node =  new ListNode(value);
            //建立头结点的链接关系
            if(count == 1){
                head.next = node;
            }
            //更新尾结点的next指向
            tail.next = node;
            //尾结点指向当前入队元素（后移）
            tail = tail.next;
        }
        count++;
        return true;
    }
    /** 从循环队列中删除一个元素。如果成功删除则返回true **/
    public boolean deQueue() {
        if(isEmpty()) return false;
        System.out.println("出队操作 元素 ==>> " + head.val);
        head = head.next;
        count--;
        return true;
    }

    /** 获取队首元素。如果队列为空，返回-1 **/
    public int Front() {
        if(isEmpty()) return -1;
        return head.val;
    }

    /** 获取队尾元素。如果队列为空，返回 -1 **/
    public int Rear() {
        if(isEmpty()) return -1;
        return tail.val;
    }

    /** 检查循环队列是否为空 **/
    public boolean isEmpty() {
        return count == 0;
    }

    /** 检查循环队列是否已满 **/
    public boolean isFull() {
        return count == capacity;
    }

    public void print(){
        print(head);
    }

    public void print(ListNode node) {
        System.out.print("LinkedCircularQueue ==>> ");
        while (node != null) {
            System.out.print(node.val);
            if(node.next != null){
                System.out.print("->");
            }
            node = node.next;
        }
        System.out.println();
    }
}

