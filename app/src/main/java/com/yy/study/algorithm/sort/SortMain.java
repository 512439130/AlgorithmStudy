package com.yy.study.algorithm.sort;

import com.yy.study.util.TimeTestUtils;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        int[] array = TimeTestUtils.getRandomArrays(20000);
        testSorts(array,
                new BubbleSort3(),
                new SelectionSort1(),
                new InsertSort2(),
                new ShellSort2(),
                new QuickSort3(),
                new HeapSort()
        );
    }

    private static void testSorts(int[] array, BaseSort... sorts){
        for(BaseSort sort : sorts){
            sort.sort(Arrays.copyOf(array,array.length));
        }

        //打印排序结果
        Arrays.sort(sorts);
        for (BaseSort sort:sorts) {
            System.out.println(sort);
        }
    }

}
