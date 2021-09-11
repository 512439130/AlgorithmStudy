package com.yy.study.algorithm.sort;

/**
 * 快速排序1（基础版：左右指针）
 * 时间复杂度 O(NLogN)
 * 空间复杂度 O(logN)
 * 稳定性：不稳定
 */
public class QuickSort1<E extends Comparable<E>> extends BaseSort<E> {
    @Override
    public boolean isStable() {
        return false;
    }

    @Override
    protected void sort() {
        quickSort(0,array.length - 1);
    }

    /**
     * 快速排序（基础版：左右指针）
     * 稳定性：不稳定
     * 时间复杂度 O(NLogN)
     * 空间复杂度 O(logN)
     * 待排序数组：[3, 2, 1, 8, 5, 9, 4, 7, 6]
     * quick: partitionIndex:array[0]:3( left:0 right:8) sort[1, 2, 3, 8, 5, 9, 4, 7, 6]
     * quick: partitionIndex:array[0]:1( left:0 right:1) sort[1, 2, 3, 8, 5, 9, 4, 7, 6]
     * quick: partitionIndex:array[1]:2( left:1 right:1) sort[1, 2, 3, 8, 5, 9, 4, 7, 6]
     * quick: partitionIndex:array[3]:8( left:3 right:8) sort[1, 2, 3, 7, 5, 6, 4, 8, 9]
     * quick: partitionIndex:array[3]:7( left:3 right:6) sort[1, 2, 3, 4, 5, 6, 7, 8, 9]
     * quick: partitionIndex:array[3]:4( left:3 right:5) sort[1, 2, 3, 4, 5, 6, 7, 8, 9]
     * quick: partitionIndex:array[4]:5( left:4 right:5) sort[1, 2, 3, 4, 5, 6, 7, 8, 9]
     * quick: partitionIndex:array[5]:6( left:5 right:5) sort[1, 2, 3, 4, 5, 6, 7, 8, 9]
     * quick: partitionIndex:array[8]:9( left:8 right:8) sort[1, 2, 3, 4, 5, 6, 7, 8, 9]
     * @param left 待排序数组左边界数组下标
     * @param right 待排序数组右边界数组下标
     */
    private void quickSort(int left, int right) {
        //递归结束条件1（空数组，只有一个数字则不需排序）
        if(array.length <= 1) return;
        //递归结束条件2（left >= right）
        if(left >= right) return;
        //获取切分点元素下标
        int partitionIndex = partition(left, right);
        // {leftArray} < partitionIndex < {rightArray}
        quickSort(left, partitionIndex - 1);  //递归调用左半数组
        quickSort(partitionIndex + 1, right);  //递归调用右半数组
    }

    /**
     * 切分为3段（左边，中间，右边）并获取切分点数组下标，提供递归边界控制
     * 基准数据在左边（首部），则先遍历右指针
     * 基准数据在右边（尾部），则先遍历左指针
     * @param left 待排序数组左边界数组下标
     * @param right 待排序数组右边界数组下标
     * @return 本次排序的切分点
     */
    private int partition(int left, int right) {
        // 基准数据（左边首元素，先遍历右指针）
        E temp = array[left];
        int leftPointer = left;  //左指针
        int rightPointer = right; //右指针
        while (leftPointer < rightPointer) {
            //因为leftPointer 和 rightPointer一直在改变，内循环必须加上限制条件 leftPointer < rightPointer
            //右指针遍历
            while (leftPointer < rightPointer && array[rightPointer].compareTo(temp) >= 0) {
                rightPointer --;
            }
            //左指针遍历
            while (leftPointer < rightPointer && array[leftPointer].compareTo(temp) <= 0) {
                leftPointer ++;
            }
            //左右指针均寻找到满足情况的元素，则交换两个元素的位置
            if(leftPointer < rightPointer){
                swap(rightPointer,leftPointer);
            }
        }
        //基准元素与左指针元素交换
        swap(left,leftPointer);
//        System.out.println("quick:" + " partitionIndex:" + "array[" + left + "]:" + temp + "(" + " left:" + left + " right:" + right + ")" + " sort" + Arrays.toString(array));
        return leftPointer; // 返回切分位置
    }
}
