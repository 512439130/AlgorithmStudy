package com.yy.study.algorithm.sort;

/**
 * 快速排序2（挖坑法）
 */
public class QuickSort2 extends BaseSort {
    @Override
    protected String title() {
        return  getClass().getSimpleName() + " 挖坑法";
    }

    @Override
    protected void sort() {
        quickSort2(array,0,array.length - 1);
    }

    /**
     * 快速排序（挖坑法）
     * @param array
     * @param left
     * @param right
     */
    public void quickSort2(int[] array, int left, int right) {
        if (array.length <= 1) return;
        if (left >= right) return;
        int partitionIndex = partition2(array, left, right);
        quickSort2(array, left, partitionIndex - 1);
        quickSort2(array, partitionIndex + 1, right);
    }

    public int partition2(int[] array, int left, int right) {
        //基准数字，right作为第一个坑
        int key = array[right];
        while(left < right){
            //左指针遍历，寻找比基准值(key)大的值
            while(left < right && compare(array[left],key) <= 0){
                left ++;
            }
            //将左指针对应数值填入坑位,left作为新坑
            array[right] = array[left];
            //右指针遍历
            while(left < right && compare(array[right],key) >= 0){
                right --;
            }
            //将右指针对应数值填入坑位,right作为新坑
            array[left] = array[right];
        }
        //循环结束，left和right相遇

        //将基准值放入最后的坑位,保证key的（左边都<=）（右边都>=）
        array[right] = key;
        return left;
    }
}
