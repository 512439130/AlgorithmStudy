package com.yy.study.deke;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //// 本题为考试多行输入输出规范示例，无需提交，不计分。
    //import java.util.Scanner;
    //
    //public class Main {
    //    public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //        int n = sc.nextInt();
    //        int ans = 0, x;
    //        for(int i = 0; i < n; i++){
    //            for(int j = 0; j < n; j++){
    //                x = sc.nextInt();
    //                ans += x;
    //            }
    //        }
    //        System.out.println(ans);
    //    }
    //}
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            String value = scanner.nextLine();
//            char[] array = value.toCharArray();
//            //双指针法
//            int start = 0;
//            int end = array.length - 1;
//            while(start<=end){
//                char temp = array[start];
//                array[start++] = array[end];
//                array[end--] = temp;
//            }
//            System.out.println(String.valueOf(array));

    //            String value = scanner.nextLine();
//            value = value.replaceAll(" ","");
//            int [] intArray = new int[value.length()];
//            for(int i = 0; i < value.length(); i++){
//                intArray[i] = (value.charAt(i) - '0');
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String value = scanner.nextLine();
            int count = getCount(Integer.parseInt(value));
            System.out.println(count);
        }
    }

    public static int getCount(int sum) {
        if (sum <= 1) return sum;
//        int count = 0;
//        int multiply;


        //动态规划
        //dp[0] = 0
        //dp[1] = 1
        //dp[2] = 1
        //dp[3] = dp[2]+1
        //dp[4] = 2
        //dp[5] = 1 + 2
        //dp[6] = dp[3] + 1

        int dp[] = new int[sum];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i < sum; i++) {
            int number = i;
            int result = number % 2;
            int count = 1;
            while(number > 1){
                number = number / 2;
                count++;
            }
            System.out.println("number - result:"+(number - result) + " dp[result]:"+result);
            System.out.println("number - result:"+(dp[number - result]) + " dp[result]:"+dp[result]);

            dp[i] = dp[number - result] + dp[result] + count;
        }
        System.out.println(Arrays.toString(dp));
        return dp[sum - 1];
//
//        while (sum > 1) {
//            if ((sum % 2) != 0) {
//                multiply = 1;
//                while (true) {
//                    multiply = multiply * 2;
//                    if (sum <= multiply) {
//                        break;
//                    }
//                }
//                //通过和2的次方数比较出合适的方案（取出和放回）
////                System.out.println("sum:" + sum + " multiply:" + multiply);
//
//                if (((sum + 1) % multiply == 0) && (multiply % (sum - 1) != 0)) {
//                    System.out.println("sum-取出:" + sum + " + 1 = " + (sum + 1) +" multiply:" + multiply);
//                    //放回
//                    sum++;
//
//                } else {
//                    System.out.println("sum-放回:" + sum + " - 1 = " + (sum - 1) +" multiply:" + multiply);
//                    //取出
//                    sum--;
//                }
//            } else {
//                //均分
//                System.out.println("sum-均分:" + sum + " / 2 = " + (sum / 2));
//                sum = sum / 2;
//            }
//            count++;
//        }
//        return count;
    }
}
