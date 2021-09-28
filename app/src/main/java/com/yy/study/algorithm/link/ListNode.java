package com.yy.study.algorithm.link;

/**
 * 单链表
 */
public class ListNode {
    /**
     * 数据
     */
    public int val;
    /**
     * 下一个节点
     */
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val = '" + val + '\'' +
                ", \n\t->next = " + next +
                '}';
    }

    /**
     * 数组转链表
     * @param array
     * @return
     */
    public static ListNode listToListNode(int[] array){
        if(array == null || array.length == 0) return null;
        //生成链表的根节点(头结点) ==>> root.data = array[0]
        ListNode root = new ListNode(array[0]);

        //pre(前一个节点)为根节点(临时节点)
        ListNode pre = root;
        for (int i = 1; i < array.length; i++) {
            //创建当前节点
            ListNode node = new ListNode(array[i]);
            //创建链接关系: 将pre(前一个节点)的next设置为当前节点
            pre.next = node;
            //更新pre节点(前一个节点)为当前节点 下一个要处理的节点
            pre = node;

        }
        return root;
    }

    public static void main(String[] args) {
        int[] array = {1,3,2,5,4};
        ListNode listNode = listToListNode(array);
        System.out.println(listNode);
    }

    public static void print(ListNode head){
        while (head != null){
            System.out.print(head.val);
            if(head.next != null){
                System.out.print("->");
            }
            head = head.next;
        }
        System.out.println("\t");
    }



}
