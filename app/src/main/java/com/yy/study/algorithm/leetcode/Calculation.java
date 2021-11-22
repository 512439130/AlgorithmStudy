package com.yy.study.algorithm.leetcode;

import java.util.Arrays;

public class Calculation {

    public static void main(String[] args) {
//        String a1 = "123456";
//        String b1 = "8887987654";
//        System.out.println("add: " + a1 + " + " + b1 + " = " + add(a1, b1));

        String a2 = "123";
        String b2 = "117";
        System.out.println("minus: " + a2 + " - " + b2 + " = " + minus(a2, b2));
    }

    /**
     * 大数相加
     * @param num1
     * @param num2
     * @return
     */
    public static String add(String num1, String num2) {
        char[] array1 = num1.toCharArray();
        char[] array2 = num2.toCharArray();
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;

        int a = 0;
        int b = 0;
        int sum = 0;
        //进位
        int carry = 0;
        StringBuilder resultBuilder = new StringBuilder();
        while(index1 >= 0 || index2 >= 0){
            if(index1 >= 0){
                //char -> int : array1[index1--] - '0'  other : Integer.parseInt(String.valueOf(charArrayA1[i]))
                a = array1[index1--] - '0';
            } else {
                a = 0;
            }
            if(index2 >= 0){
                b = array2[index2--] - '0';
            } else {
                b = 0;
            }
            sum = a + b + carry;
            carry = sum / 10;
            resultBuilder.append(sum % 10);
        }
        if(carry > 0){
            resultBuilder.append(carry);
        }
        return resultBuilder.reverse().toString();
    }

    /**
     * 大数相减
     * @param num1
     * @param num2
     * @return
     */
    public static String minus(String num1, String num2) {
        //是否负数
        boolean flag = false;
        //判断两个字符数字哪个更大，并且调整num1始终作为被减数，num2作为减数
        //如果num1<num2: 转化为-(num2-num1)，保证任何情况可以借位
        if (num1.length() != num2.length()) {
            //数字长度不相同，长的更大
            if (num1.length() < num2.length()) {
                String temp = num1;
                num1 = num2;
                num2 = temp;
                flag = true;
            }
        } else {
            //长度相同，则通过compareTo 比较ASCII顺序: (compareTo() > 0 : num1 > num2)
            if (num1.compareTo(num2) < 0) {
                String temp = num1;
                num1 = num2;
                num2 = temp;
                flag = true;
            }
        }
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;

        //字符数组转换
        char[] charArrayA1 = num1.toCharArray();
        char[] charArrayA2 = num2.toCharArray();

        int a = 0;
        int b = 0;
        //和
        int difference = 0;
        //借位（负值）
        int carry = 0;
        StringBuilder resultBuilder = new StringBuilder();
        while (index1 >= 0 || index2 >= 0) {
            //获取字符数组对应下标的数字，数组长度短的取0
            if(index1 >= 0){
                a = charArrayA1[index1--] - '0';
            } else {
                a = 0;
            }
            if(index2 >= 0){
                b = charArrayA2[index2--] - '0';
            } else {
                b = 0;
            }

            //求和，需要考虑借位
            difference = (a - b - carry);

            if(difference < 0){
                carry = 1;
                difference += 10;
            } else {
                carry = 0;
            }
            resultBuilder.append(Math.abs(difference));
        }
        //去除尾部多余的0（反转后的头部中，从头部开始的0无意义）
        for (int i = resultBuilder.length() - 1; i >= 0; i--) {
            if(resultBuilder.charAt(i) != '0'){
                resultBuilder = new StringBuilder(resultBuilder.substring(0,i + 1));
                break;
            }
        }
        //正负
        if(flag) resultBuilder.append("-");
        //反转结果
        resultBuilder = resultBuilder.reverse();
        return resultBuilder.toString();
    }

    public String multiply(String num1, String num2) {
        //0 * ? = 0
        if("0".equals(num1) || "0".equals(num2)) return "0";
        char[] array1 = num1.toCharArray();
        char[] array2 = num2.toCharArray();

        int[] value = new int[array1.length + array2.length];

        //乘法模拟 a*b
        //外循环: b
        //内循环: a
        //用index数组模拟缓存每次乘法的结果，同一个index的结果需要累加
        for(int i = array1.length - 1; i >= 0; i--){
            for(int j = array2.length - 1; j >= 0; j--){
                int index = (array1.length - 1 - i) + (array2.length - 1 - j);
                value[index] += (array1[i] - '0') * (array2[j] - '0');
            }
        }

        //整理结果（逆向）
        for(int i = 0; i < value.length - 1; i++){
            //前一个位置累加当前位置的进位计算
            value[i + 1] += value[i] / 10;
            //该位置的结果：保留个位数 ==>> 求余
            value[i] = value[i] % 10;
        }
        //处理乘积结果中末尾多余的0（末尾的0真实结果是高位   例如 value = 43210 ==>> result = 01234 : 1234）
        //index位置指向有意义的高位
        int index = value.length - 1;
        while(value[index] == 0){
            index--;
        }
        //通过StringBuilder拼接结果
        StringBuilder resultBuilder = new StringBuilder();
        while(index >= 0){
            resultBuilder.append(value[index--]);
        }

        return resultBuilder.toString();

    }

    public static void reverse(char[] array) {
        int left = 0;
        int right = array.length - 1;
        char temp;
        while (left < right) {
            temp = array[left];
            array[left++] = array[right];
            array[right--] = temp;
        }
    }
}
