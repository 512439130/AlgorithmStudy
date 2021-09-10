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

    /**
     * 时间
     */
    protected long time;

    /**
     * 待排序数组
     */
    protected int[] oldArray;

    protected String title() {
        return getClass().getSimpleName();
    }

    protected abstract void sort();

    public void sort(int[] array) {
        if (array == null || array.length < 2) return;
        this.array = array;
        oldArray = Arrays.copyOf(this.array, this.array.length);

        long startTime = System.currentTimeMillis();
        sort();
        long endTime = System.currentTimeMillis();
        time = endTime - startTime;
    }

    /**
     * 比较两个数据大小
     * =0 array[i1] == array[i2]
     * >0 array[i1] > array[i2]
     * <0 array[i1] < array[i2]
     *
     * @param a1
     * @param a2
     * @return
     */
    protected int compare(int a1, int a2) {
        compareCount++;
        return a1 - a2;
    }

    /**
     * 交换待排序数组中的元素
     *
     * @param i1
     * @param i2
     */
    protected void swap(int i1, int i2) {
        swapCount++;
        int temp = this.array[i1];
        this.array[i1] = this.array[i2];
        this.array[i2] = temp;
    }

    @Override
    public String toString() {
        String oldArrayStr = "==>>待排数组: " + Arrays.toString(oldArray);
        String newArrayStr = "==>>结果数组: " + Arrays.toString(array);
        String lengthStr = "==>>数组长度: " + array.length;
        String timerStr = "==>>算法耗时: " + time + "ms";
        String compareCountStr = "==>>比较次数: " + compareCount;
        String swapCountStr = "==>>交换次数: " + swapCount;

        return "===============" + "【" + title() + "】" + "===============\n"
                + oldArrayStr + "\n"
                + newArrayStr + "\n"
                + lengthStr + "\n"
                + timerStr + "\n"
                + compareCountStr + "\n"
                + swapCountStr + "\n"
                + "===============" + "【" + title() + "】" + "===============\n";
    }
}