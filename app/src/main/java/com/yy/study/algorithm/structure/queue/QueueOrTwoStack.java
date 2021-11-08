package com.yy.study.algorithm.structure.queue;

import java.util.Stack;

/**
 * 双栈实现队列
 */
public class QueueOrTwoStack {
    //正向栈（管理入栈）
    Stack<Integer> positiveStack;
    //逆向栈（管理出栈）
    Stack<Integer> reverseStack;
    //用来保存正向栈底的值（队头）
    int head;

    public QueueOrTwoStack() {
        positiveStack = new Stack<>();
        reverseStack = new Stack<>();
    }
    //将元素 x 推到队列的末尾
    public void push(int x) {
        if(positiveStack.isEmpty()){
            head = x;
        }
        positiveStack.push(x);
    }

    //初始化逆向栈
    public void initReverseStack(){
        //逆向栈不为空时，正向栈管理入栈的新元素，逆向栈管理出栈元素
        //逆向栈为空时，正向数据反向入栈
        if(reverseStack.isEmpty()){
            while(!positiveStack.isEmpty()){
                reverseStack.push(positiveStack.pop());
            }
        }
    }

    //从队列的开头移除并返回元素
    public int pop() {
        initReverseStack();
        if(reverseStack.isEmpty()) return -1;
        return reverseStack.pop();
    }

    //返回队列开头的元素
    public int peek() {
        if(reverseStack.isEmpty()) return head;
        return reverseStack.peek();
    }

    //如果队列为空，返回 true ；否则，返回 false
    public boolean empty() {
        return positiveStack.isEmpty() && reverseStack.isEmpty();
    }
}
