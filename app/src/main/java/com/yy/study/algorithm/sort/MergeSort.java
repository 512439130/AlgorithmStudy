package com.yy.study.algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序
 * 时间复杂度 O(NLogN)
 * 空间复杂度 O(N)
 * 稳定性：不稳定
 */
public class MergeSort<E extends Comparable<E>> extends BaseSort<E> {
    @Override
    protected boolean isPrintArray() {
        return true;
    }

    @Override
    public boolean isStable() {
        return true;
    }

    @Override
    protected void sort() {
        mergeSort(array,0,array.length - 1);
    }

    private void mergeSort(E[] array, int left, int right){
        if(left == right) return;
        int middle = right + ((left - right) >> 1);  // right + ((left - right) >> 1) : (left + right) / 2
        //分离
        mergeSort(array, left, middle); //left
        mergeSort(array, middle + 1, right); //right
        //合并
        merge(array, left, middle + 1, right); //merge
    }

    /**
     * 合并操作
     * @param array 待排序数组
     * @param left 数组左边界下标
     * @param middle 数组中间下标
     * @param right 数组右边界下标
     */
    private void merge(E[] array, int left, int middle, int right){
        System.out.println("left:" + left + " right:" + right + " middle:" + middle + " array:" + Arrays.toString(array));
        int leftArraySize = middle - left;
        int rightArraySize = right - middle + 1;
        Integer[] leftArray = new Integer[leftArraySize];
        Integer[] rightArray = new Integer[rightArraySize];

        //左右指针，合并时通过左右指针指向数组的值比较，按顺序插入新数组
        int leftPointer = 0;
        int rightPointer = 0;

        //合并数组下标
        int mergeIndex = left;

        for (int i = left; i < middle; i++) {
            leftArray[i - left] = (Integer)array[i];
        }

        for (int i = middle; i <= right; i++) {
            rightArray[i - middle] = (Integer)array[i];
        }

        while (leftPointer < leftArraySize && rightPointer < rightArraySize) {
            if(leftArray[leftPointer] < rightArray[rightPointer]){
                array[mergeIndex++] = (E) leftArray[leftPointer++];
            } else {
                array[mergeIndex++] = (E)rightArray[rightPointer++];
            }
        }

        while (leftPointer < leftArraySize) {
            array[mergeIndex++] = (E)leftArray[leftPointer++];
        }

        while (rightPointer < rightArraySize) {
            array[mergeIndex++] = (E)rightArray[rightPointer++];
        }
    }
}
