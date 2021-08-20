package com.yy.study.algorithm;

import java.util.Arrays;
import java.util.Random;

public class Sort {

    /**
     * 交换数组元素顺序
     * @param array  待排序数组
     * @param indexA  位置A
     * @param indexB  位置B
     */
    public static void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (less(array[i], array[i - 1])) return false;
        return true;
    }

    /**
     * 是否排序
     * @param v
     * @param w
     * @return
     */
    private static boolean less(int v, int w) {
        return v < w;
    }

    public static void main(String[] args) {
        int[] array = getRandomArrays(50000);
        System.out.println("待排序数组：" + Arrays.toString(array));
        long startTime = System.currentTimeMillis();
          ///50000随机数
//        popSort(array);    //8269ms
//        popSort2(array);   //6844ms
//        selectSort(array);   //2832ms
//        insertSort(array);    //4451ms
//        insertSort2(array);    //1340ms
//        shellSort(array);      //13~22ms
        shellSort2(array);       //8~22ms
        long endTime = System.currentTimeMillis();

        System.out.println("数组长度：" + array.length);
        System.out.println("排序总耗时：" + (endTime - startTime) + "ms");
        System.out.println("排序结果：" + Arrays.toString(array));
    }

    /**
     * 获取随机数组
     * @param length 数组长度
     * @return
     */
    public static int[] getRandomArrays(int length){
        int[] a = new int[length];
        Random random = new Random(1);
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(length);
        }
        return a;
    }

    /**
     * 冒泡排序（基础版）
     * 稳定性：稳定
     * @param array 待排序数组
     */
    public static void popSort(int[] array) {
        if (array == null || array.length < 2) return;
        for (int i = 0; i <= array.length - 1; i++) {
//            int popCount = 0;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array,j,j+1);
//                    popCount++;
//                    System.out.println("第" + (i + 1) + "遍" + "冒泡移动元素第" + popCount + "趟：" + Arrays.toString(array));
                }
            }
//            System.out.println("第" + (i + 1) + "趟排序后的结果：" + Arrays.toString(array));
        }
    }

    /**
     * 冒泡排序（优化版）
     * 稳定性：稳定
     * 1.增加标志位，当内循环中无元素交换，则结束外层循环体
     * 2.记录内循环的元素交换，减少内层循环次数
     * @param array 待排序数组
     */
    public static void popSort2(int[] array) {
        if (array == null || array.length < 2) return;
        int popPosition = array.length - 1; //记录交换位置
        int len = array.length - 1;
        for (int i = 0; i < array.length - 1; i++) {
//            int popCount = 0;
            boolean popFlag = false; //标志每一遍排序是否交换1次元素
            for (int j = 0; j < len; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array,j,j+1);
                    popPosition = j;
                    popFlag = true;
//                    popCount++;
//                    System.out.println("第" + (i + 1) + "遍" + "冒泡移动元素第" + popCount + "趟：" + Arrays.toString(array));
                }
            }
            //记录元素交换位置，减少排序内循环的次数，提高性能
            len = popPosition;

            //如果标识未改，则排序结束
            if (!popFlag) {
//                System.out.println("第" + (i + 1) + "趟无移动元素，排序结束");
                break;
            } else {
//                System.out.println("第" + (i + 1) + "遍 Result ===> " + Arrays.toString(array));
            }

        }
    }

    /**
     * 选择排序
     * 稳定性：非稳定
     * 每次找到数组中最小值的下标(从第1个下标开始，假设它是数组中最小的值，通过循环与全部元素比较，取最小值的下标)，将最小值下标与第1位下标替换，再寻找数组中剩下元素最小的值，再和数组第2位下标替换，一直执行，直到全部位置元素放置完成（从第1位一直排序到数组大小的位置为结束）
     * @param array 待排序数组
     */
    public static void selectSort(int[] array) {
        if (array == null || array.length < 2) return;
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
    }


    /**
     * 插入排序
     * 稳定性：稳定
     * 从数组左边开始，第一个位置有序，向右遍历，新元素和（左边）已有序位置数字挨个比较。如果当前比较者小于左边有序数组中的数，则向该位置插入，大于的元素统一向右移动，给新元素腾出空间
     * @param array 待排序数组
     */
    public static void insertSort(int[] array){
        if (array == null || array.length < 2) return;
        int len = array.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                } else {
                    //因为左边有序，当else时，则证明新元素大于左边元素，跳出循环。
                    break;
                }
            }
        }
    }


    /**
     * 插入排序（优化版）
     * 稳定性：稳定
     * 排序中不需数组交换元素，新元素和左边比较时，如果 array[j] < array[j-1]，则a[j] = array[j-1],更大的数向右覆盖，新元素等到最后合适的位置再放入
     * @param array 待排序数组
     */
    public static void insertSort2(int[] array){
        if(array == null || array.length < 2) return;
        int len = array.length;
        int temp;
        for(int i = 1; i < len; i++){
            temp = array[i];
            int j;
            for(j = i; j > 0; j--){
                if(temp < array[j-1]){
                    array[j] = array[j-1];
//                    System.out.println("交换元素 " + "array[" + j + "]=" + "array[" + (j - 1) + "] ==>> " + array[j]);
//                    System.out.println("交换后 array:" + Arrays.toString(array));
                } else {
                    break;
                }
            }
            //将temp中的元素插入合适位置
//            System.out.println("将temp中的元素插入合适位置 "+ "array[" + j + "] = " + temp);
            array[j] = temp;
        }
    }


    /**
     * 高效排序
     * 稳定性：非稳定
     * 希尔排序(基础：步长策略(折半)：n/2)
     * @param array 待排序数组
     */
    public static void shellSort(int[] array) {
        if(array == null || array.length < 2) return;
        //步长
        int length = array.length;
        //缓存变量
        int temp;
        //求最大步长
        int step = length / 2;
        int i;
        int j;
        while (step > 0){
            for (i = step; i < length; i++) {
                temp = array[i];
                //1.根据步长计算左侧同组元素位置下标
                j = i - step;
                //2.同小组做直接插入排序（array[j + step] 和 array[j]）,比较满足条件后，调整2个元素顺序(1,2)
                for (; (j >= 0 && array[j] > temp); j = j - step) {
                    //1
                    array[j + step] = array[j];
                }
                //2
                array[j + step] = temp;
            }
            //步长更新，逐步减少,最后step = 1 时 做最后的直接插入排序，保证排序的正确性
            step /= 2;
        }
    }

    /**
     * 高效排序
     * 稳定性：非稳定
     * 希尔排序(优化：步长策略：step = O(n^3/2) Knuth)
     * @param array 待排序数组
     */
    public static void shellSort2(int[] array) {
        if(array == null || array.length < 2) return;
        //顺序输出
        int length = array.length;
        int temp;
        int step = 1;
        //求最大步长
        while (step < length / 3) {
            step = step * 3 + 1;
        }
        int i;
        int j;
        while (step > 0) {
            for (i = step; i < length; i++) {
                temp = array[i];
                //1.根据步长计算左侧同组元素位置下标
                j = i - step;
                //2.同小组做直接插入排序（array[j + step] 和 array[j]）,比较满足条件后，调整2个元素顺序(1,2)
                for (; j >= 0 && array[j] > temp; j = j - step) {
                    //1
                    array[j + step] = array[j];
                }
                //2
                array[j + step] = temp;

            }
            //步长更新，逐步减少,最后step = 1 时 做最后的直接插入排序，保证排序的正确性
            step /= 3;
        }

    }

}
