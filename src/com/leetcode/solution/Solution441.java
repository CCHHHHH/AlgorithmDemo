package com.leetcode.solution;

import static java.lang.Math.sqrt;

/**
 * @Author:chenhao
 * @Date:2019/11/20 10:38
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 * 给定一个数字 n，找出可形成完整阶梯行的总行数。
 * n 是一个非负整数，并且在32位有符号整型的范围内
 */
public class Solution441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(0));
    }

    public static int arrangeCoins(int n) {
        /*
        int i;
        int sum = 0;

        if (n == 1){
            return 1;
        }

        for (i = 1; i < n; i++) {
            sum += i;
            if (sum > n){
                break;
            }
        }
        return i-1;
        */
        return (int)(sqrt(1.0/4+2*n)-1.0/2);
    }
}
