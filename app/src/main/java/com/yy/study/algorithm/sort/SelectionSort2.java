package com.yy.study.algorithm.sort;

/**
 * 选择排序2（选择最大值和末尾位置交换）
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(1)
 * 稳定性：不稳定
 */
public class SelectionSort2<E extends Comparable<E>> extends BaseSort<E> {
    @Override
    public boolean isStable() {
        return false;
    }

    @Override
    protected boolean isPrintArray() {
        return true;
    }

    @Override
    protected void sort() {
        int maxIndex;
        for (int end = array.length - 1; end > 0; end--) {
            maxIndex = 0;
            for (int begin = 1; begin <= end; begin++) {
                if (array[maxIndex].compareTo(array[begin]) < 0) {
                    maxIndex = begin;
                }
            }
            if(maxIndex != end){
                //将找到的最大元素和数组最后一个元素交换
                swap(maxIndex,end);
            }
        }
    }
}
