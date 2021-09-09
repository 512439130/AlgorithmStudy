package com.yy.study.algorithm.sort;

/**
 * 快速排序3（快慢指针法）
 */
public class QuickSort3 extends BaseSort {
    @Override
    protected String title() {
        return getClass().getSimpleName() + " 快慢指针法";
    }

    @Override
    protected void sort() {
        quickSort3(0,array.length - 1);
    }

    /**
     * 快速排序（快慢指针法）
     * @param left
     * @param right
     */
    public void quickSort3(int left, int right) {
        if (array.length <= 1) return;
        if (left >= right) return;
        int partitionIndex = partition3(left, right);
        quickSort3(left, partitionIndex);
        quickSort3(partitionIndex + 2, right);  // +2保证递归时，慢指针位置正确
    }

    public int partition3(int left, int right) {
        //将最右边的数字作为基准值
        int key = array[right];

        //快指针
        int quickPointer = left;
        // 慢指针slowPointer的作用是标记基准值最后应该在的位置
        int slowPointer = left - 1;


        while(quickPointer < right){  //由快指针quickPointer一直比较到基准值的前一位
            if(compare(array[quickPointer],key) < 0){
                slowPointer ++;  //慢指针向前移动一位
                swap(quickPointer,slowPointer);  //交换快慢指针下标对应数值
            }
            quickPointer ++; //快指针向前移动一位
        }
        swap(slowPointer + 1,right);  //交换慢指针下标前一位和right元素
        return slowPointer;
    }
}
