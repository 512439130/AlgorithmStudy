package com.yy.study.algorithm.sort;

/**
 * 堆排序
 * 时间复杂度 O(NLogN)
 * 空间复杂度 O(1)
 * 稳定性：不稳定
 */
public class HeapSort<E extends Comparable<E>> extends BaseSort<E>{
    @Override
    public boolean isStable() {
        return false;
    }

    /**
     * 对树结点i堆化操作
     * @param tree 堆的树形结构（数组）
     * @param n 树的结点数：数组的总长度
     * @param i 堆中树形结构的第i个结点
     */
    private void heapify(E[] tree,int n, int i){
        if(i >= n){
            return;
        }
        //求堆的最大值 parent（父结点）
        int parent = i;
        //当前i结点的左右结点
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left < n && (tree[left].compareTo(tree[parent]) > 0)){
            parent = left;
        }
        if(right < n && (tree[right].compareTo(tree[parent]) > 0)){
            parent = right;
        }
        if(parent != i){
            //parent != i的时，（parent,left,right）中parent不是最大值，则parent 和 i的数组下标值进行交换 (parent保证是最大值)
            swap(parent,i);
            heapify(tree,n,parent);
        }
    }

    /**
     * 生成最大堆
     * @param tree 数组
     * @param n 数组长度
     */
    private void buildMaxHeap(E[] tree, int n){
        //根据堆属性，通过最后一个叶子结点求最后一个叶子结点的父结点
        //parent(i) = floor((i - 1) / 2)  floor 向下取整
        int last = n - 1;
        int parent = (last - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(tree,n,i);
        }
    }

    @Override
    protected void sort() {
        int length = array.length;
        int treeParent = 0;
        //生成最大堆，第0个数值为最大值
        buildMaxHeap(array,length);
//        System.out.println("buildHeap:"+Arrays.toString(array));
        for (int i = length - 1; i >= 0; i--) {
            //数组的最大值array[0] 和数组最后位置交换
            swap(i,treeParent);
//          System.out.println("交换元素后：" + Arrays.toString(array) +" i:"+i + " treeParent:"+treeParent);
            //对parent结点进行堆化
            heapify(array,i,treeParent);
//            System.out.println("堆化后：" + Arrays.toString(array));
        }
    }
    //heapify i的含义：每次堆化后，最后一个结点（数组末尾）需要删减，所以数组长度跟随i变化
    //heapify treeParent的含义：数组交换后，此时array[0]是替换后的原本数组末尾的数值，进行下一次堆化
}
