package com.yy.study.algorithm.sort;

/**
 * 希尔排序2
 * 时间复杂度 O(N^3/2)
 * 空间复杂度 O(1)
 * 稳定性：非稳定
 */
public class ShellSort2 extends BaseSort {

    @Override
    protected void sort() {
        int length = array.length;
        int temp;
        int step = 1;
        //求最大步长
        while (step < length / 3) {
            step = step * 3 + 1;
        }
        int i;
        int j;
        while (step > 0) {
            for (i = step; i < length; i++) {
                temp = array[i];
                //1.根据步长计算左侧同组元素位置下标
                j = i - step;
                //2.同小组做直接插入排序（array[j + step] 和 array[j]）,比较满足条件后，调整2个元素顺序(1,2)
                for (; j >= 0 && compare(array[j],temp) > 0; j = j - step) {
                    //1
                    array[j + step] = array[j];
                    //记录交换次数
                    swapCount ++;
                }
                //2
                array[j + step] = temp;

            }
            //步长更新，逐步减少,最后step = 1 时 做最后的直接插入排序，保证排序的正确性
            step /= 3;
        }
    }
}
