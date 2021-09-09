package com.yy.study.algorithm.sort;

/**
 * 选择排序1（选择最小值和起始位置交换）
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(1)
 * 稳定性：不稳定
 */
public class SelectionSort1 extends BaseSort {

    @Override
    protected void sort() {
        int minIndex;
        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (compare(array[j], array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(i, minIndex);
            }
        }
    }
}
