package com.yy.study.algorithm.sort;

/**
 * 选择排序1（选择最小值和起始位置交换）
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(1)
 * 稳定性：不稳定
 */
public class SelectionSort1<E extends Comparable<E>> extends BaseSort<E> {
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
        //通过选择排序找出最大值或最小值，然后和数组的第i位进行交换
        //选择排序中最左边是已经排好序的位置
        //记录最小值下标
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            //从左往右比较，最小的在最左边
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[minIndex].compareTo(array[j]) > 0){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                swap(i, minIndex);
            }
        }
    }
}
