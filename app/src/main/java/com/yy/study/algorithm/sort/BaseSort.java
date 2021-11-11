package com.yy.study.algorithm.sort;

import java.util.Arrays;


public abstract class BaseSort<E extends Comparable<E>> implements Comparable<BaseSort<E>> {
    /**
     * 是否打印数组排序前后情况
     */
    protected boolean isPrintArray(){
        return true;
    }

    /**
     * 排序数组
     */
    protected E[] array;

    /**
     * 记录数组
     */
    protected E[] oldArray;
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
     * 排序
     */
    protected abstract void sort();
    /**
     * 排序稳定性
     */
    public abstract boolean isStable();

    protected String title() {
        return getClass().getSimpleName();
    }

    public void sort(E[] array) {
        this.array = array;
        if (array == null || array.length < 2) return;
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
     * @param a1 数据a1
     * @param a2 数据a2
     * @return return
     */
    protected int compare(E a1, E a2) {
        if (a1 == null || a2 == null) return 0;
        compareCount++;
        return a1.compareTo(a2);
    }

    /**
     * 交换待排序数组中的元素
     *
     * @param i1 i1
     * @param i2 i2
     */
    protected void swap(int i1, int i2) {
        swapCount++;
        E temp = this.array[i1];
        this.array[i1] = this.array[i2];
        this.array[i2] = temp;
    }

    /**
     * 交换待排序数组中的元素
     *
     * @param array array
     * @param i1 数组下标i1
     * @param i2 数组下标i2
     */
    protected void swap(int[] array, int i1, int i2) {
        swapCount++;
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

    //实现Comparable 接口 的compareTo方法后，对象可以使用Array.sort方法排序
    @Override
    public int compareTo(BaseSort<E> nextSort) {
        compareCount ++;
        if (time == nextSort.time) {
            if (compareCount == nextSort.compareCount) {
                return (int) (swapCount - nextSort.swapCount);
            }
            return (int) (compareCount - nextSort.compareCount);
        }
        return (int) (time - nextSort.time);
    }

    /**
     * 数组是否升序
     *
     * @return boolean
     */
    public boolean isSortAscending() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 数组是否升序
     *
     * @return boolean
     */
    public boolean isSortAscending(E[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 数组是否降序
     *
     * @return boolean
     */
    public boolean isSortDescending() {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(array[i + 1]) < 0) {
                return false;
            }
        }
        return true;
    }


    @Override
    public String toString() {
        String lengthStr = "==>>数组长度:" + array.length;
        String oldArrayStr = "==>>待排数组:" + Arrays.toString(oldArray);
        String newArrayStr = "==>>结果数组:" + Arrays.toString(array);
        String timerStr = "==>>耗时:" + time + "ms";
        String compareCountStr = "==>>比较:" + compareCount;
        String swapCountStr = "==>>交换:" + swapCount;
        String isSortAscending = "==>>排序正确性:" + isSortAscending();
        String isStable = "==>>排序稳定性:" + isStable();
        return "-----------------------" + "【" + title() + "】" + "-----------------------\n"
                + (isPrintArray() ? (lengthStr + "\n") : "")
                + (isPrintArray() ? (oldArrayStr + "\n") : "")
                + (isPrintArray() ? (newArrayStr + "\n") : "")
                + timerStr + "\n"
                + compareCountStr + "\n"
                + swapCountStr + "\n"
                + isSortAscending + "\n"
                + isStable;
    }
}
