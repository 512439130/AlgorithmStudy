package com.yy.study.algorithm.sort;

import com.yy.study.util.TimeTestUtils;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        testTasks();
    }

    private static void testTask() {
        BaseSort quickSort = new QuickSort3();
        int[] array = TimeTestUtils.getRandomArrays(50);
        System.out.println("-------------------Task--------------------");
        //单个排序测速
        TimeTestUtils.testTask(quickSort.getClass().getSimpleName(), new TimeTestUtils.Task() {
            @Override
            public void execute() {
                quickSort.sort(array);    //36~44ms
            }
        });
        System.out.println("-------------------Task--------------------\n");
    }

    private static void testTasks() {
        int[] array = TimeTestUtils.getRandomArrays(15);
        System.out.println("-------------------Tasks--------------------");

        BaseSort[] sorts = new BaseSort[10];
        sorts[0] = new BubbleSort3();
        sorts[1] = new SelectionSort2();
        sorts[2] = new InsertSort2();
        sorts[3] = new ShellSort2();
        sorts[4] = new QuickSort3();

        int[][] arrays = new int[10][array.length];
        arrays[0] = Arrays.copyOf(array, array.length);
        arrays[1] = Arrays.copyOf(array, array.length);
        arrays[2] = Arrays.copyOf(array, array.length);
        arrays[3] = Arrays.copyOf(array, array.length);
        arrays[4] = Arrays.copyOf(array, array.length);

        String[] titles = {
                sorts[0].getClass().getSimpleName(),
                sorts[1].getClass().getSimpleName(),
                sorts[2].getClass().getSimpleName(),
                sorts[3].getClass().getSimpleName(),
                sorts[4].getClass().getSimpleName(),
        };
        TimeTestUtils.Task[] tasks = new TimeTestUtils.Task[titles.length];
        for (int i = 0; i < tasks.length; i++) {
            int key = i;
            tasks[i] = new TimeTestUtils.Task() {
                @Override
                public void execute() {
                    sorts[key].sort(arrays[key]);
                }
            };
        }
        TimeTestUtils.testTasks(titles,tasks);
        System.out.println("-------------------Tasks--------------------\n");
    }
}
