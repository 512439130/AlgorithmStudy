package com.yy.study.algorithm.leetcode;

/**
 * 151. 翻转字符串里的单词
 * 给你一个字符串s，逐个翻转字符串中的所有单词。
 * 单词 是由非空格字符组成的字符串。s中使用至少一个空格将字符串中的 单词 分隔开。
 */
public class ReverseWords {

    public static void main(String[] args) {
        ReverseWords words = new ReverseWords();

        System.out.println(words.reverseWords("  the sky is blue   "));
    }


    public String reverseWords(String content) {
        char[] charArray = content.toCharArray();
        int length = charArray.length;

        //存放结果
        StringBuilder builder = new StringBuilder();
        //每个单词的起始下标
        int startIndex = -1;

        //1.先整体反转字符串
        reverseWordsWithIndex(charArray, 0, length - 1);

        //2.再逐个反转单词（去除括号）
        //i相当于每个单词的尾部指针
        for (int i = 0; i < length; i++) {
            //从头开始遍历，当出现字符非空格时，记录起始下标
            if (charArray[i] != ' ' && startIndex == -1) {
                startIndex = i;
            }

            if (((i == charArray.length - 1) || (charArray[i + 1] == ' ')) && (startIndex != -1)) {
                //逐个反转数组中的单词
                reverseWordsWithIndex(charArray, startIndex, i);

                //非首位则拼接一个空格
                if (builder.length() != 0) {
                    builder.append(' ');
                }

                //拼接反转后的单词
                for (int j = startIndex; j <= i; j++) {
                    builder.append(charArray[j]);
                }


                startIndex = -1;
            }
        }

        return builder.toString();
    }

    /**
     * 根据下标反转字符串(双指针)
     *
     * @param array
     * @param start
     * @param end
     */
    private void reverseWordsWithIndex(char[] array, int start, int end) {
        if (array == null || array.length < 2) return;
        char temp;
        while (start < end) {
            temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
    }
}
