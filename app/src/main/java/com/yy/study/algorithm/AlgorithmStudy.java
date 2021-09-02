package com.yy.study.algorithm;

import android.annotation.SuppressLint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AlgorithmStudy {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        int[] num = {1,2,3,3,2,5,7,5,1};
//        System.out.println(singleNumber(num));
//        System.out.println(singleNumber2(num));
//        System.out.println(singleNumber3(num));
//        System.out.println(singleNumber4(num));
//        int[] num = {2, 2, 1, 1, 1, 2, 2};
//        System.out.println(majorityElement3(num));

//        int[] num = {2,2};
//        int[] num = {2,1,1,3,1,4,5,6};
//        int[] num = {1,1,1,3,3,2,2,2};
//        System.out.println(majorityElement1_3_2(num));

//        int[][] matrix = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//        int[][] matrix = new int[][]{{2,2}};
//        System.out.println(searchMatrix2(matrix,21));

        int[] num1 = new int[]{1,4,5,6,0,0};
        int[] num2 = new int[]{5,8};
        merge4(num1,4,num2,2);
        System.out.println("merge-result:" + Arrays.toString(num1));
        long endTime = System.currentTimeMillis();
        System.out.println("算法耗时：" + (endTime - startTime) + "ms");

    }


    /**
     * 只出现一次的数字
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 线性时间复杂度，不使用额外空间
     *
     * 解题思路：位运算解决
     * a^a=0；自己和自己异或等于0
     * a^0=a；任何数字和0异或还等于他自己
     * a^b^c=a^c^b；异或运算具有交换律
     * @param numbers
     * @return
     */
    public static int singleNumber(int[] numbers){
        int result = 0;
        for(int number : numbers){
            result ^= number;
        }
        return result;
    }

    /**
     * 只出现一次的数字
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 线性时间复杂度，不使用额外空间
     *
     * 解题思路：Set特性解决
     * @param numbers
     * @return
     */
    public static int singleNumber2(int[] numbers){
        Set<Integer> numberSet = new HashSet<>();
        for (int number : numbers) {
            if (!numberSet.add(number)) {
                numberSet.remove(number);
            }
        }
        return (int) numberSet.toArray()[0];
    }

    /**
     * 位运算优化空间复杂度版本
     * @param numbers
     * @return
     */
    public static int singleNumber3(int[] numbers){
        for (int i = 1; i < numbers.length; i++) {
            numbers[0] ^= numbers[i];
        }
        return numbers[0];
    }

    /**
     * 先排序，再遍历
     * @param numbers
     * @return
     */
    public static int singleNumber4(int[] numbers){
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i = i + 2) {
            if(i == numbers.length - 1){
                return numbers[i];
            } else {
                if(numbers[i] != numbers[i+1]){
                    return numbers[i];
                }
            }
        }
        return -1;
    }


    /**
     * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
     * 先排序，再/2
     * 时间复杂度 O(NLogN)
     * 空间复杂度 O(NLogN)
     * @param numbers
     * @return
     */
    public static int majorityElement(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length / 2];
    }

    /**
     * 通过Map解决，Key存放数组元素，value存放key出现的次数，
     * 通过循环遍历更新key出现的次数，一直到value > （number.length / 2），则key为多数元素
     * 时间复杂度 O(N)
     * 空间复杂度 O(N)
     * @param numbers
     * @return
     */
    public static int majorityElement2(int[] numbers) {
        if(numbers.length == 1) return numbers[0];
        Map<Integer,Integer> map = new HashMap<>();
        for (int number : numbers) {
            if (map.containsKey(number)) {
                if (map.get(number) + 1 > (numbers.length / 2)) {
                    return number;
                } else {
                    map.put(number, map.get(number) + 1);
                }
            } else {
                map.put(number, 1);
            }
        }
        return -1;
    }

    /**
     * 摩尔投票解法(两两抵消)
     * 时间复杂度 O(N)
     * 空间复杂度 O(1)
     * @param numbers
     * @return
     */
    public static int majorityElement3(int[] numbers){
        int temp = 0;
        int count = 0;
        for (int number : numbers) {
            if (count == 0) {
                count++;
                temp = number;
            } else if (temp == number) {
                count++;
            } else {
                count--;
            }
        }
        return temp;
    }


    /**
     * 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素
     * 摩尔投票法则，大于n/k的众数最多出现 k-1个 例如 n/3: 3-1 = 2个
     * 因为题目没有保证数组一定出现超过n/3次的元素，所有情况会有3种：
     * Situation 1: 2个候选人大于n/3
     * Situation 2: 1个候选人大于n/3
     * Situation 3: 0个候选人大于n/3
     * @param numbers
     * @return
     */
    public static List<Integer> majorityElement1_3_1(int[] numbers) {
        List<Integer> result = new ArrayList<>();
//        Set<Integer> set= new HashSet<>();
        if (numbers == null || numbers.length == 0) return result;
        //候选人1和他的票数
        int candidate1 = -1;
        int count1 = 0;
        //候选人2和他的票数
        int candidate2 = -1;
        int count2 = 0;
        // 摩尔投票法分为两个阶段: 配对阶段和计数阶段
        // 1.配对阶段，选出候选人
        for (int number : numbers) {
            //候选人1票数加+1
            if(candidate1 == number){
                count1++;
                continue;
            }
            //候选人1票数加+1
            if(candidate2 == number){
                count2++;
                continue;
            }
            //候选人1配对
            if(count1 == 0){
                candidate1 = number;
                count1++;
                continue;
            }
            //候选人2配对
            if(count2 == 0){
                candidate2 = number;
                count2++;
                continue;
            }

            // 如果count1和count2的数量都不为0，则说明候选人1,2的票数还有，那这一票属于非候选人的票，则执行3消，候选人1,2票数都-1
            count1--;
            count2--;
        }
        System.out.println("候选人1: " + candidate1);
        System.out.println("候选人2: " + candidate2);

        //2.计数阶段
        //循环遍历取候选人最终结果
        // 因为题目没有保证数组一定出现超过n/3次的元素，所有情况会有3种：
        // Situation 1: 2个候选人大于n/3
        // Situation 2: 1个候选人大于n/3
        // Situation 3: 0个候选人大于n/3
        count1 = 0;
        count2 = 0;
        for(int number: numbers){
            if(candidate1 == number){
                count1++;
            } else if(candidate2 == number){
                count2++;
            }
        }
        if(count1 > (numbers.length / 3)){
            result.add(candidate1);
        }
        if(count2 > (numbers.length / 3)){
            result.add(candidate2);
        }
        return result;
    }

    /**
     * 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素
     * 通过哈希表解法
     * @param numbers
     * @return
     */
    public static List<Integer> majorityElement1_3_2(int[] numbers) {
        List<Integer> result = new ArrayList<>();
        if(numbers == null || numbers.length == 0) return result;
        //哈希表解法
        Map<Integer,Integer> numberMap = new HashMap<>();
        for(int number: numbers){
            if(numberMap.containsKey(number)){
                numberMap.put(number, numberMap.get(number) + 1);
            } else {
                numberMap.put(number, 1);
            }
        }
        for(int number: numbers){
            if(numberMap.get(number) > (numbers.length / 3)){
                if(!result.contains(number)) result.add(number);
            }
        }
        return result;
    }


    /**
     * 搜索二维矩阵 II
     * 每行的所有元素从左到右升序排列
     * 每列的所有元素从上到下升序排列
     * 时间复杂度 T(N) = O(NLogN)
     * 空间复杂度 S(N) = O(1)
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        //分治思想：大问题分解成多个子问题，二维数组查找拆分为m个一维数组（matrix[m]）的查找
        //二分查找：二维数组每行所有元素从左到右升序排列，可以运用二分查找技术，逐个遍历搜索元素
        if(matrix == null || matrix.length == 0 ) return false;
        //优化：每行所有元素从左到右升序排列，则先用target查看是否在每一个一维数组的区间内，再二分查找
        for (int[] array : matrix) {
            if(target >= array[0] && target <= array[array.length - 1]){
                if (binarySearch(array, target)) return true;
            }
        }
        return false;
    }

    /**
     * 二分查找
     * 时间复杂度 T(N) = O(LogN)
     * 空间复杂度 S(N) = O(1)
     * @param array 数组
     * @param target 查找数字
     * @return result 是否存在
     */
    public static boolean binarySearch(int[] array, int target){
        if(array.length == 1) return array[0] == target;
        int start = 0;
        int end = array.length - 1;
        int mid;
        while (start <= end){
            mid = (start + end) / 2; //start + (end - start) 等价 (start + end) / 2
            if(target < array[mid]){
                end = mid - 1;
            } else if(target > array[mid]){
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }



    /**
     * 搜索二维矩阵 II（双向二分查找）
     * 每行的所有元素从左到右升序排列
     * 每列的所有元素从上到下升序排列
     * 时间复杂度 T(N) = O(lg(n!))
     * 空间复杂度 S(N) = O(1)
     */
    public static boolean searchMatrix2(int[][] matrix, int target) {
        //分治思想：大问题分解成多个子问题，二维数组查找拆分为m个一维数组（matrix[m]）的查找
        //二分查找：二维数组每行所有元素从左到右升序排列，可以运用二分查找技术，逐个遍历搜索元素
        //搜索优化：从行，列2个方向并行二分查找，提高效率
        if(matrix == null || matrix.length == 0 ) return false;
        //取行和列的最小值
        int min = Math.min(matrix.length,matrix[0].length);
        for (int i = 0; i < min; i++) {
            //二分查找每一行（由上到下）
            if (binarySearch2(matrix, target, i, true)) return true;
            //二分查找每一列（由左到右）
            if (binarySearch2(matrix, target, i, false)) return true;
        }
        return false;
    }

    /**
     * 二分查找（多方向）
     * 同时搜索二维数组的行和列
     * @param array 数组
     * @param target 目标数字
     * @param lo 开始的下标（行或列）
     * @param isHorizontal 方向：是否水平方向搜索
     * @return result 是否存在
     */
    public static boolean binarySearch2(int[][] array, int target, int lo, boolean isHorizontal){
        //左上角开始搜索
        int start = lo;
        int end = isHorizontal ? array[0].length - 1 : array.length - 1;
        int mid;
        while (start <= end){
            mid = (start + end) / 2;
            if(isHorizontal){  //搜索水平方向（列）
                if(target < array[lo][mid]){
                    end = mid - 1;
                } else if(target > array[lo][mid]){
                    start = mid + 1;
                } else {
                    return true;
                }
            } else { //搜索竖直方向(行)
                if(target < array[mid][lo]){
                    end = mid - 1;
                } else if(target > array[mid][lo]){
                    start = mid + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 搜索二维矩阵 II（双向二分查找）
     * 每行的所有元素从左到右升序排列
     * 每列的所有元素从上到下升序排列
     * 时间复杂度 T(N) = O(m + n)
     * 空间复杂度 S(N) = O(1)
     */
    public boolean searchMatrix3(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 ) return false;
        //左下角的指针
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length){
            if(matrix[row][col] > target){ //当前指向的值大于目标值，“向上” 移动一行
                row--;
            } else if(matrix[row][col] < target){ //当前指向的值小于目标值，“向右” 移动一列
                col++;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * 合并两个有序数组
     * 合并+排序
     * 时间复杂度：T(N) = O((m+n)Log(m+n))
     * 空间复杂度：S(N) = O(Log(m+n))
     * @param nums1 有序数组1
     * @param m 数组1的长度
     * @param nums2 有序数组2
     * @param n 数组2的长度
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //先合并再排序
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    /**
     * 合并两个有序数组
     * 双指针遍历插入数组 (正序遍历)
     * @param nums1 有序数组1
     * @param m 数组1的长度
     * @param nums2 有序数组2
     * @param n 数组2的长度
     */
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        //通过双指针记录两个数组的访问下标，通过轮训不断比较并插入合适的位置
        //归并排序思路：创建一个适合大小的数组，将2个数组按照大小依次放入新数组中完成合并
        if(nums1 == null || nums2 == null)  return;
        if(m == 0 && n == 0)  return;
        int[] temp = new int[m + n];
        int i = 0;
        int j = 0;
        int index = 0;
        //2个数组中，其中一个数组长度为0，则结果 = 其中一个数组
        if(m == 0 && n != 0){
            int y = 0;
            while(y < n){
                nums1[index++] = nums2[y++];
            }
            return;
        } else if(n == 0 && m != 0){
            return;
        }
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[index++] = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                temp[index++] = nums2[j++];
            }
        }
        //检查nums1和nums2是否全部合并
        //1.nums1剩余元素直接按顺序加入temp
        while(i < m){
            temp[index++] = nums1[i++];
        }
        //2.nums2剩余元素直接按顺序加入temp
        while (j < n) {
            temp[index++] = nums2[j++];
        }
        //copy temp数组给num1
        int k = 0;
        while (k < temp.length) {
            nums1[k] = temp[k++];
        }
    }


    /**
     * 合并两个有序数组
     * 双指针遍历插入数组(正序遍历-优化)
     * 时间复杂度：T(N) = O(m+n)
     * 空间复杂度：S(N) = O(m+n)
     * @param nums1 有序数组1
     * @param m 数组1的长度
     * @param nums2 有序数组2
     * @param n 数组2的长度
     */
    public static void merge3(int[] nums1, int m, int[] nums2, int n) {
        //通过双指针记录两个数组的访问下标，通过轮训不断比较并插入合适的位置
        //归并排序思路：创建一个适合大小的数组，将2个数组按照大小依次放入新数组中完成合并
        if (nums1 == null || nums2 == null) return;
        if (m == 0 && n == 0) return;
        //合并临时数组
        int[] temp = new int[m + n];
        int i = 0;
        int j = 0;
        int current;
        while (i < m || j < n) {
            if (i == m) {
                current = nums2[j++];
            } else if (j == n) {
                current = nums1[i++];
            } else if (nums1[i] < nums2[j]) {
                current = nums1[i++];
            } else {
                current = nums2[j++];
            }
            temp[i + j - 1] = current;
        }
        //copy temp数组给num1
        int k = 0;
        while (k < temp.length) {
            nums1[k] = temp[k++];
        }
    }

    /**
     * 合并两个有序数组
     * 双指针遍历插入数组(逆序 优化)
     * 时间复杂度：T(N) = O(m+n)
     * 空间复杂度：S(N) = O(1)
     * @param nums1 有序数组1
     * @param m 数组1的长度
     * @param nums2 有序数组2
     * @param n 数组2的长度
     */
    public static void merge4(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null) return;
        if (m == 0 && n == 0) return;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 || j >= 0) {
            if (i == -1) {
                nums1[i + j + 1] = nums2[j--];
            } else if (j == -1) {
                nums1[i + j + 1] = nums1[i--];
            } else if (nums1[i] > nums2[j]) {
                nums1[i + j + 1] = nums1[i--];
            } else {
                nums1[i + j + 1] = nums2[j--];
            }
        }
    }

}
