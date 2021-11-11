package com.yy.study.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序(优化3)
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
    protected boolean isPrintArray() {
        return true;
    }

    @Override
    protected void sort() {
        //一轮排序中是否交换过（检查有序性）==>> 减少外层循环次数 趟数
        int isSorted;
        //记录最后一次交换的位置 ==>> 减少内层循环次数 比较次数
        int pos;

        int end = array.length - 1;
        int i;
        int j;

        for (i = 0; i < array.length - 1; i++) {
            pos = 0;
            isSorted = 0;
            for (j = 0; j < end; j++) {
                if(array[j].compareTo(array[j + 1]) > 0){
                    swap(j, j + 1);
                    pos = j; //记录最后一次交换的位置
                    isSorted = 1; //排序标识
                }
            }
            if(isSorted == 0){
                //通过标识判断每一轮排序中，是否有交换元素，如果无，则证明数组已经有序
                return;
            }
            //更新内层循环遍历的数量限制
            //通过记录最后一次的交换位置，作为下一次内层遍历的有边界，删减无意义的比较
            end = pos;
        }
    }
}
