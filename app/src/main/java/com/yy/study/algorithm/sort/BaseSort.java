package com.yy.study.algorithm.sort;

import java.util.Arrays;

public abstract class BaseSort {
    protected int[] array;
    /**
     * 比较次数
     */
    protected int compareCount;
    /**
     * 交换次数
     */
    protected int swapCount;

    protected String title(){
        return getClass().getSimpleName();
    }

    protected abstract void sort();

    public void sort(int[] array){
        if(array == null || array.length < 2) return;
        this.array = array;
        System.out.println("===>>>" + "【" + title() + "】" + "length:" + array.length);
        System.out.println("===>>>" + "【" + title() + "】" + "lod-array:" + Arrays.toString(array));
        sort();
        System.out.println("===>>>" + "【" + title() + "】" + "new-array:" + Arrays.toString(array));
        System.out.println("===>>>" + "【" + title() + "】" + " compareCount:" + compareCount + " swapCount:" + swapCount);
    }

    /**
     * 比较两个数据大小
     * =0 array[i1] == array[i2]
     * >0 array[i1] > array[i2]
     * <0 array[i1] < array[i2]
     * @param a1
     * @param a2
     * @return
     */
    protected int compare(int a1, int a2){
        compareCount++;
        return a1 - a2;
    }

    /**
     * 交换数组中的元素
     * @param i1
     * @param i2
     */
    protected void swap(int i1, int i2){
        swapCount++;
        int temp = this.array[i1];
        this.array[i1] = this.array[i2];
        this.array[i2] = temp;
    }
}
