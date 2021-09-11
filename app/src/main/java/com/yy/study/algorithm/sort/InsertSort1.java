package com.yy.study.algorithm.sort;

/**
 * 插入排序1
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(1)
 * 稳定性：稳定
 */
public class InsertSort1<E extends Comparable<E>> extends BaseSort<E> {
    @Override
    public boolean isStable() {
        return true;
    }

    @Override
    protected void sort() {
        //默认升序排列
        //两两比较，首个元素默认有序，第i个元素和第i-1个元素比较，array[i] < array[i-1]，则交换2个元素
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j].compareTo(array[j - 1]) < 0) {
                    swap(j, j - 1);
                } else {
                    //因为左边有序，当else时，则证明新元素大于左边元素，跳出循环。
                    break;
                }
            }
        }
    }
}
