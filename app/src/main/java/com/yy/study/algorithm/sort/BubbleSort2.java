package com.yy.study.algorithm.sort;

/**
 * 冒泡排序2
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(1)
 * 稳定性：稳定
 */
public class BubbleSort2<E extends Comparable<E>> extends BaseSort<E> {
    @Override
    public boolean isStable() {
        return true;
    }

    @Override
    protected void sort() {
        boolean isSorted;
        for (int end = array.length - 1; end > 0; end--) {
            isSorted = true;
            for (int begin = 1; begin <= end; begin++) {
                if (compare(array[begin], array[begin - 1]) < 0) {
                    swap(begin,begin - 1);
                    isSorted = false;
                }
            }
            if(isSorted){
                //未交换元素，则证明数组已经完全有序
                break;
            }
        }
    }
}
