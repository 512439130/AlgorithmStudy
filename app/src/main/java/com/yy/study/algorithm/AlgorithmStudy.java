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
//        int[] num = {1,2,3,3,2,5,7,5,1};
//        System.out.println(singleNumber(num));
//        System.out.println(singleNumber2(num));
//        System.out.println(singleNumber3(num));
//        System.out.println(singleNumber4(num));
//        int[] num = {2, 2, 1, 1, 1, 2, 2};
//        System.out.println(majorityElement3(num));

//        int[] num = {2,2};
//        int[] num = {2,1,1,3,1,4,5,6};
        int[] num = {1,1,1,3,3,2,2,2};
        System.out.println(majorityElement1_3_2(num));
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
}
