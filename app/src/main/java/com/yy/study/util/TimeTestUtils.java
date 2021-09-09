package com.yy.study.util;

/**
 * 算法执行时间测试工具类
 */
public class TimeTestUtils {

    public interface Task {
        void execute();
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
        System.out.println("TimeTestUtils ==>> " + "【" + title + "】" + " 耗时：" + (endTime - startTime) + "ms");
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
            System.out.println("TimeTestUtils ==>> " + "【" + title[i] + "】" + " 耗时：" + (endTime - startTime) + "ms");
        }
    }
}
