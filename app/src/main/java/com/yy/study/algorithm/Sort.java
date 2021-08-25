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

    public static void main(String[] args) {
//        int[] array = getRandomArrays(20000);
        int[] array = {4,1,7,6,9,2,8,0,3,5};
        System.out.println("待排序数组：" + Arrays.toString(array));
        long startTime = System.currentTimeMillis();
          ///20000随机数
//        popSort(array);    //8269ms
//        popSort2(array);   //6844ms
//        selectSort(array);   //2832ms
//        insertSort(array);    //4451ms
//        insertSort2(array);    //1340ms
//        shellSort(array);      //29~35ms
//        shellSort2(array);       //29~38ms
//        quickSort(array, 0, array.length - 1);    //25~35ms
//        quickSort2(array, 0, array.length - 1);    //21~32ms
        quickSort3(array, 0, array.length - 1);    //36~44ms
        long endTime = System.currentTimeMillis();

        System.out.println("数组长度：" + array.length);
        System.out.println("排序总耗时：" + (endTime - startTime) + "ms");
        System.out.println("排序结果：" + Arrays.toString(array));
    }

    /**
     * 获取随机数组
     * @param length 数组长度
     * @return result
     */
    public static int[] getRandomArrays(int length){
        int[] a = new int[length];
        Random random = new Random(100);
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(length);
        }
        return a;
    }

    /**
     * 冒泡排序（基础版）
     * 稳定性：稳定
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
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
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
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
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
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
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
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
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
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
     * 希尔排序(高效排序)(基础：步长策略(折半)：n/2)
     * 稳定性：非稳定
     * 时间复杂度 O(n^(1.3—2))
     * 空间复杂度 O(1)
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
     * 希尔排序(高效排序)(优化：步长策略：step = O(n^3/2) Knuth)
     * 稳定性：非稳定
     * 时间复杂度 O(N^3/2)
     * 空间复杂度 O(1)
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


    /**
     * 快速排序（基础版：左右指针）
     * 稳定性：非稳定
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
     * @param array 待排序数组
     * @param left 待排序数组左边界数组下标
     * @param right 待排序数组右边界数组下标
     */
    private static void quickSort(int[] array, int left, int right) {
        //递归结束条件1（空数组，只有一个数字则不需排序）
        if(array.length <= 1) return;
        //递归结束条件2（left >= right）
        if(left >= right) return;
        //获取切分点元素下标
        int partitionIndex = partition(array, left, right);
        // {leftArray} < partitionIndex < {rightArray}
        quickSort(array, left, partitionIndex - 1);  //递归调用左半数组
        quickSort(array, partitionIndex + 1, right);  //递归调用右半数组
    }

    /**
     * 切分为3段（左边，中间，右边）并获取切分点数组下标，提供递归边界控制
     * 基准数据在左边（首部），则先遍历右指针
     * 基准数据在右边（尾部），则先遍历左指针
     * @param array 待排序数组
     * @param left 待排序数组左边界数组下标
     * @param right 待排序数组右边界数组下标
     * @return 本次排序的切分点
     */
    private static int partition(int[] array, int left, int right) {
        // 基准数据（左边首元素，先遍历右指针）
        int temp = array[left];
        int leftPointer = left;  //左指针
        int rightPointer = right; //右指针
        while (leftPointer < rightPointer) {
            //因为leftPointer 和 rightPointer一直在改变，内循环必须加上限制条件 leftPointer < rightPointer
            //右指针遍历
            while (leftPointer < rightPointer && array[rightPointer] >= temp) {
                rightPointer --;
            }
            //左指针遍历
            while (leftPointer < rightPointer && array[leftPointer] <= temp) {
                leftPointer ++;
            }
            //左右指针均寻找到满足情况的元素，则交换两个元素的位置
            if(leftPointer < rightPointer){
//                int tempCompare = array[rightPointer];
//                array[rightPointer] = array[leftPointer];
//                array[leftPointer] = tempCompare;
                swap(array,rightPointer,leftPointer);
            }
        }
        //基准元素与左指针元素交换
//        array[left] = array[leftPointer];
//        array[leftPointer] = temp;
        swap(array,left,leftPointer);
//        System.out.println("quick:" + " partitionIndex:" + "array[" + left + "]:" + temp + "(" + " left:" + left + " right:" + right + ")" + " sort" + Arrays.toString(array));
        return leftPointer; // 返回切分位置
    }


    /**
     * 快速排序（挖坑法）
     * @param array
     * @param left
     * @param right
     */
    public static void quickSort2(int[] array, int left, int right) {
        if (array.length <= 1) return;
        if (left >= right) return;
        int partitionIndex = partition2(array, left, right);
        quickSort2(array, left, partitionIndex - 1);
        quickSort2(array, partitionIndex + 1, right);
    }

    public static int partition2(int[] array, int left, int right) {
        //基准数字，right作为第一个坑
        int key = array[right];
        while(left < right){
            //左指针遍历，寻找比基准值(key)大的值
            while(left < right && array[left] <= key){
                left ++;
            }
            //将左指针对应数值填入坑位,left作为新坑
            array[right] = array[left];
            //右指针遍历
            while(left < right && array[right] >= key){
                right --;
            }
            //将右指针对应数值填入坑位,right作为新坑
            array[left] = array[right];
        }
        //循环结束，left和right相遇

        //将基准值放入最后的坑位,保证key的（左边都<=）（右边都>=）
        array[right] = key;
        return left;
    }


    /**
     * 快速排序（快慢指针法）
     * @param array
     * @param left
     * @param right
     */
    public static void quickSort3(int[] array, int left, int right) {
        if (array.length <= 1) return;
        if (left >= right) return;
        int partitionIndex = partition3(array, left, right);
        quickSort3(array, left, partitionIndex);
        quickSort3(array, partitionIndex + 2, right);  // +2保证递归时，慢指针位置正确
    }

    public static int partition3(int[] array, int left, int right) {
        //将最右边的数字作为基准值
        int key = array[right];

        //快指针
        int quickPointer = left;
        // 慢指针slowPointer的作用是标记基准值最后应该在的位置
        int slowPointer = left - 1;


        while(quickPointer < right){  //由快指针quickPointer一直比较到基准值的前一位
            if(array[quickPointer] < key){
                slowPointer ++;  //慢指针向前移动一位
                swap(array,quickPointer,slowPointer);  //交换快慢指针下标对应数值
            }
            quickPointer ++; //快指针向前移动一位
        }
        swap(array,slowPointer + 1,right);  //交换慢指针下标前一位和right元素
        return slowPointer;
    }
}
