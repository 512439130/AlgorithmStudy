package com.yy.study.algorithm.sort;

/**
 * 冒泡排序1
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(1)
 * 稳定性：稳定
 */
public class BubbleSort1<E extends Comparable<E>> extends BaseSort<E> {
    @Override
    public boolean isStable() {
        return true;
    }



    @Override
    protected void sort() {
//        for (int end = array.length - 1; end > 0; end--) {
//            for (int begin = 1; begin <= end; begin++) {
//                if (array[begin].compareTo(array[begin - 1]) < 0) {
//                    swap(begin,begin - 1);
//                }
//            }
//        }

        for (int i = 0; i < array.length - 1; i++) {
            //array.length - 1 - i :
            // (array.length - 1 : 循环比较时需要访问下标 j + 1)
            // (array.length - 1 - i : 当一轮遍历结束后，数组最右边的值已经排好序，无需再次比较，随着i不断增大，待比较的数组的长度越来越低)
            // 最大值在最右边
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j].compareTo(array[j + 1]) > 0){
                    swap(j, j + 1);
                }
            }
        }
    }
}
