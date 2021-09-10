package com.yy.study.algorithm.sort;

/**
 * 冒泡排序3
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(1)
 * 稳定性：稳定
 */
public class BubbleSort3<E extends Comparable<E>> extends BaseSort<E> {
    @Override
    public boolean isStable() {
        return true;
    }

    @Override
    protected void sort() {
        int sortIndex;
        for (int end = array.length - 1; end > 0; end--) {
            sortIndex = 1;
            for (int begin = 1; begin <= end; begin++) {
                if (compare(array[begin], array[begin - 1]) < 0) {
                    swap(begin,begin - 1);
                    sortIndex = begin;
                }
            }
            end = sortIndex;
        }
    }
}
