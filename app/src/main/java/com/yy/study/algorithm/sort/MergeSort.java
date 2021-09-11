package com.yy.study.algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序
 * 时间复杂度 O(NLogN)
 * 空间复杂度 O(N)
 * 稳定性：不稳定
 */
@SuppressWarnings("unchecked")
public class MergeSort<E extends Comparable<E>> extends BaseSort<E> {
    @Override
    protected boolean isPrintArray() {
        return false;
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
        int middle = left + ((right - left) >> 1);  // right + ((left - right) >> 1) : (left + right) / 2
        //分离
        mergeSort(array, left, middle); //left
        mergeSort(array, middle + 1, right); //right

        //测试数组是否已经有序
        if(array[middle].compareTo(array[middle + 1] ) <= 0) return;
        //合并
        merge(array, left, middle + 1, right); //merge
    }

    /**
     * 原地归并法
     * @param array array
     * @param left left
     * @param middle middle
     * @param right right
     */
    private void merge2(E[] array,int left, int middle, int right){
        int leftPointer = left;
        int rightPointer = middle + 1;
        Integer[] newArray = new Integer[right + 1];
        for (int i = left; i <= right; i++) {
            newArray[i] = (Integer) array[i];
        }
        for (int i = left; i <= right; i++) {
            if(leftPointer > middle){
                array[i] = (E) newArray[rightPointer++];
            } else if(rightPointer > right){
                array[i] = (E) newArray[leftPointer++];
            } else if(newArray[rightPointer] < newArray[leftPointer]){
                array[i] = (E) newArray[rightPointer++];
            } else {
                array[i] = (E) newArray[leftPointer++];
            }
        }
    }

    /**
     * 合并操作
     * @param array 待排序数组
     * @param left 数组左边界下标
     * @param middle 数组中间下标
     * @param right 数组右边界下标
     */
    private void merge(E[] array, int left, int middle, int right){
        if(isPrintArray()){
            System.out.println("left:" + left + " right:" + right + " middle:" + middle + " array:" + Arrays.toString(array));
        }
        int leftArraySize = middle - left;
        int rightArraySize = right - middle + 1;
        E[] leftArray = (E[]) new Integer[leftArraySize];
        E[] rightArray = (E[]) new Integer[rightArraySize];

        //左右指针，合并时通过左右指针指向数组的值比较，按顺序插入新数组
        int leftPointer = 0;
        int rightPointer = 0;

        //合并数组下标
        int mergeIndex = left;

        for (int i = left; i < middle; i++) {
            leftArray[i - left] = array[i];
        }
//        System.out.println("leftArray:" + Arrays.toString(leftArray));

        for (int i = middle; i <= right; i++) {
            rightArray[i - middle] = array[i];
        }
//        System.out.println("rightArray:" + Arrays.toString(rightArray));

        while (leftPointer < leftArraySize && rightPointer < rightArraySize) {
            if(leftArray[leftPointer].compareTo(rightArray[rightPointer]) < 0){
                array[mergeIndex++] = leftArray[leftPointer++];
            } else {
                array[mergeIndex++] = rightArray[rightPointer++];
            }
            swapCount ++;
        }

        while (leftPointer < leftArraySize) {
            array[mergeIndex++] = leftArray[leftPointer++];
            swapCount ++;
        }

        while (rightPointer < rightArraySize) {
            array[mergeIndex++] = rightArray[rightPointer++];
            swapCount ++;
        }
    }
}
