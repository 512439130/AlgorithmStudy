package com.yy.study.algorithm.structure.link;

/**
 * 单链表
 */
public class ListNode {
    /**
     * 数据
     */
    public int val;
    /**
     * 下一个结点
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

    public static void main(String[] args) {
        int[] array = {1,3,2,5,4};
        ListNode listNode = arrayToListNode(array);
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

    /**
     * 数组转链表
     * @param array
     * @return
     */
    public static ListNode arrayToListNode(int[] array){
        if(array == null || array.length == 0) return null;
        //生成链表的根结点(头结点) ==>> root.data = array[0]
        ListNode root = new ListNode(array[0]);

        //pre(前一个结点)为根结点(临时结点)
        ListNode pre = root;
        for (int i = 1; i < array.length; i++) {
            //创建当前结点
            ListNode node = new ListNode(array[i]);
            //创建链接关系: 将pre(前一个结点)的next设置为当前结点
            pre.next = node;
            //更新pre结点(前一个结点)为当前结点 下一个要处理的结点
            pre = node;

        }
        return root;
    }

    /**
     * 链表添加一个环
     * @param node node
     * @param pos pos代表尾结点指向链表中某个结点的的索引位置（环的入口）
     */
    public static void toCircle(ListNode node, int pos){
        //遍历 通过pos找到 入口对应的节点 记录下来
        //遍历到尾结点时，设置为其next引用

        //记录遍历的位置
        int dfsPosition = 0;
        ListNode circleNode = null;
        while (true){
            if(dfsPosition == pos){
                //根据pos记录环的入口结点
                circleNode = node;
            }
            if(node.next == null){
                //末尾结点next连接环的入口结点：成环
                node.next = circleNode;
                return;
            }
            node = node.next;
            dfsPosition++;
        }
    }



}
