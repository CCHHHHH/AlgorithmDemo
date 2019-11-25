package com.leetcode.solution;

import java.util.Scanner;

/**
 * @Author:chenhao
 * @Date:2019/11/20 9:15
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * 输入: "Hello, my name is John"
 * 输出: 5
 */
public class Solution434 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        System.out.println(countSegmentsTest(next));
    }

    public static int countSegments(String s) {
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 32 && flag) {
                count++;
                flag = false;
            } else if (s.charAt(i) == 32) {
                flag = true;
            }
        }
        return count;
    }

    public static int countSegmentsTest(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {
                count++;
            }
        }
        return count + 1;
    }
}
