package com.yy.study.algorithm.structure;

public class BigCalculation {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        System.out.println("Hello World!");

        int[] array1 = {1,2,5,5};
        int[] array2 = {1,1,7};

        ListNode node1 = ListNode.createListNode(array1);
        ListNode node2 = ListNode.createListNode(array2);
        ListNode.print(node1);
        ListNode.print(node2);
        ListNode result = minus(node1,node2);
        ListNode.print(result);

    }

    public static ListNode minus(ListNode node1, ListNode node2){
        //求链表长度
        //判断两个字符数字哪个更大，并且调整num1始终作为被减数，num2作为减数
        //如果num1<num2: 转化为-(num2-num1)，保证任何情况可以借位
        int length1 = 0;
        int length2 = 0;
        ListNode lengthNode1 = node1;
        ListNode lengthNode2 = node2;
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        while(lengthNode1 != null){
            length1++;
            builder1.append(lengthNode1.val);
            lengthNode1 = lengthNode1.next;
        }
        while(lengthNode2 != null){
            length2++;
            builder2.append(lengthNode2.val);
            lengthNode2 = lengthNode2.next;
        }

        if (length1 != length2) {
            //数字长度不相同，长的更大
            if (length1 < length2) {
                ListNode temp = node1;
                node1 = node2;
                node2 = temp;
            }
        } else {
            //长度相同，则通过compareTo 比较ASCII顺序: (compareTo() > 0 : num1 > num2)
            if (builder1.toString().compareTo(builder2.toString()) < 0) {
                ListNode temp = node1;
                node1 = node2;
                node2 = temp;
            }
        }


        //借位
        int carry = 0;
        ListNode n1 = reverse(node1);
        ListNode n2 = reverse(node2);
        ListNode.print(n1);
        ListNode.print(n2);

        ListNode node = new ListNode(-1);
        ListNode pre = node;
        int a;
        int b;
        while(n1 != null || n2 != null){
            if(n1 != null) {
                a = n1.val;
            } else {
                a = 0;
            }

            if(n2 != null) {
                b = n2.val;
            } else {
                b = 0;
            }

            int value = a - b - carry;

            if(value < 0){
                carry = 1;
                value += 10;
            } else {
                carry = 0;
            }
            if(value != 0){
                pre.next = new ListNode((value % 10));
                pre = pre.next;
            }

            if(n1 != null){
                n1 = n1.next;
            }
            if(n2 != null){
                n2 = n2.next;
            }
        }
        node = node.next;

        node = reverse(node);

        return node;
    }

    public static ListNode reverse(ListNode node){
        ListNode pre = null;
        ListNode cur = node;

        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }


}

class ListNode{
    int val;
    ListNode next;
    ListNode(){

    }
    ListNode(int val){
        this.val = val;
    }

    public static ListNode createListNode(int[] array){
        int length = array.length;
        ListNode root = new ListNode(-1);
        ListNode pre = root;
        for(int i = 0; i < length; i++){
            pre.next = new ListNode(array[i]);
            pre = pre.next;
        }
        return root.next;
    }

    public static void print(ListNode node){

        while(node != null){
            System.out.print(node.val);
            node = node.next;
            if(node != null){
                System.out.print("->");
            }
        }
        System.out.println();
    }

}
