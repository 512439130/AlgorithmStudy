package com.yy.study.algorithm.sort;

import java.util.Arrays;

public abstract class BaseSort implements Comparable<BaseSort>{
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

    /**
     * 是否打印数组排序前后情况
     */
    private boolean isPrintArray = false;

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

    /**
     * 交换待排序数组中的元素
     * @param array
     * @param i1
     * @param i2
     */
    protected void swap(int[]array, int i1, int i2) {
        swapCount++;
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

    //实现Comparable 接口 的compareTo方法后，对象可以使用Array.sort方法排序
    @Override
    public int compareTo(BaseSort o) {
        if(time == o.time){
            if(compareCount == o.compareCount){
                return (int)(swapCount - o.swapCount);
            }
            return (int)(compareCount - o.compareCount);
        }
        return (int)(time - o.time);
    }

    @Override
    public String toString() {
        String oldArrayStr = "==>>待排数组:" + Arrays.toString(oldArray);
        String newArrayStr = "==>>结果数组:" + Arrays.toString(array);
        String lengthStr = "==>>数组长度:" + array.length;
        String timerStr = "==>>耗时:" + time + "ms";
        String compareCountStr = "==>>比较:" + compareCount;
        String swapCountStr = "==>>交换:" + swapCount;

        return "-----------------------" + "【" + title() + "】" + "-----------------------\n"
                + (isPrintArray ? (lengthStr + "\n") : "")
                + (isPrintArray ? (oldArrayStr + "\n") : "")
                + (isPrintArray ? (newArrayStr + "\n") : "")
                + timerStr + "\n"
                + compareCountStr + "\n"
                + swapCountStr;
    }
}
