package com.yy.study.util;

import java.util.Random;

/**
 * 算法执行时间测试工具类
 */
public class TimeTestUtils {

    public interface Task {
        void execute();
    }

    /**
     * 获取随机数组
     * @param length 数组长度
     * @return result
     */
    public static int[] getRandomArrays(int length){
        int[] a = new int[length];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(length);
        }
        return a;
    }
    /**
     * 获取随机数组
     * @param length 数组长度
     * @return result
     */
    public static Integer[] getRandomIntegerArrays(int length){
        Integer[] a = new Integer[length];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(length);
        }
        return a;
    }

    /**
     * 获取种子随机数组(通过种子生成，每次相同)
     * @param length 数组长度
     * @return result
     */
    public static Integer[] getConstantRandomIntegerArrays(int length){
        Integer[] a = new Integer[length];
        Random random = new Random(100);
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(length);
        }
        return a;
    }

    /**
     * 测试算法耗时 Task单独任务
     * @param title title
     * @param task task
     */
    public static void testTask(String title, Task task) {
        if (task == null) return;
        title = title == null ? "null" : title;
        long startTime = System.currentTimeMillis();
        task.execute();
        long endTime = System.currentTimeMillis();
        System.out.println("===>>>" + "【" + title + "】" + " 执行任务耗时：" + (endTime - startTime) + "ms\n");
    }

    /**
     * 测试算法耗时 Tasks任务数组
     * @param title title
     * @param tasks task
     */
    public static void testTasks(String[] title, Task[] tasks) {
        if (tasks == null || tasks.length == 0) return;
        for (int i = 0; i < tasks.length; i++) {
            long startTime = System.currentTimeMillis();
            tasks[i].execute();
            long endTime = System.currentTimeMillis();
            System.out.println("===>>>" + "【" + title[i] + "】" + " 执行任务耗时：" + (endTime - startTime) + "ms\n");
        }
    }

}
