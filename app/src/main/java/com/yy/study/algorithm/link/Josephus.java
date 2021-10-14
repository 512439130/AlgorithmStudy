package com.yy.study.algorithm.link;

import java.util.List;

/**
 * 约瑟夫环问题
 */
public class Josephus {

    public static void main(String[] args) {
        int size = 41;
        int gap = 3;
        System.out.println(size + "," + gap + " -> " + josephus2(size, gap));
    }

    /**
     * 计算约瑟夫环的位置
     * 环形链表法
     * @param size 总共有m个人
     * @param gap n个人之后删除一次
     * @return
     */
    public static int josephus(int size, int gap){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        //数组构造链表
        ListNode node = ListNode.arrayToListNode(array);
        //将链表整个变成环
        ListNode.toCircle(node,0);

        //将每个人视作链表中的一个结点，当报数到gap的时候，删除结点，直到剩下最后一个结点
        int count = 1;
        while(true){
            //当找到报数(gap - 1)的结点时，node.next = node.next.next
            if(count == gap - 1){
                System.out.println("删除结点: " + node.next.val);
                node.next = node.next.next;
                count = 0;
            }
            node = node.next;
            count++;
            //当环形链表只剩下最后一个结点时，node.next = node
            if(node.next == node) return node.val;
        }
    }

    /**
     * 计算约瑟夫环的位置
     * 数组解法
     * @param size 总共有m个人
     * @param gap n个人之后删除一次
     * @return
     */
    public static int josephus2(int size, int gap){
        int[] people = new int[size];
        //记录报数 1,2,...gap
        int count = 0;
        //遍历索引
        int index = -1;
        //剩余人数
        int remain = size;
        while (remain > 0){
            index++;
            //到达数组末端，从头重新遍历
            if(index >= size){
                index = 0;
            }
            //如果此人已经删除，则跳过，继续报数
            if(people[index] == -1) continue;

            //当报数到gap的时候，删除该位置的人（将index对应数组的元素置为-1）
            if(count == gap){
                people[index] = -1;
                count = 0;
                remain--;
            }
            count++;
        }
        return index;
    }
}
