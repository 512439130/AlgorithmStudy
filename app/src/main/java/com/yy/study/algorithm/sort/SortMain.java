package com.yy.study.algorithm.sort;

import com.yy.study.util.TimeTestUtils;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        BaseSort<Integer>[] sorts = new BaseSort[10];
        testSorts(
                new BubbleSort3<Integer>(),
                new SelectionSort2<Integer>(),
                new InsertSort2<Integer>(),
                new ShellSort2<Integer>(),
                new QuickSort3<Integer>(),
                new HeapSort<Integer>(),
                new MergeSort<Integer>()
        );
    }

    private static void testSorts(BaseSort<Integer>... sorts){
        Integer[] array = TimeTestUtils.getRandomIntegerArrays(20);
        for(BaseSort<Integer> sort : sorts){
            sort.sort(Arrays.copyOf(array,array.length));
        }

        //对排序对象排序（耗时快慢）
        Arrays.sort(sorts);
        //打印排序结果
        for (BaseSort<Integer> sort:sorts) {
            System.out.println(sort);
        }
    }

}
