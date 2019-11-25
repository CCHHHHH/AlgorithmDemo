package com.leetcode.classicsort;

import java.util.Arrays;

/**
 * @Author:chenhao
 * @Date:2019/11/22 10:53
 */
public class XuanZe {
    public static void main(String[] args) {
        int[] a = {8, 1, 9, 5, 6, 4, 3, 3, 7};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] a) {
        /**
         * 选择排序:就是找到数组中最大的和第一位交换位置,找到第二大的和第二位换位置,以次类推
         */
        for (int i = 0; i < a.length; i++) {
            //每次循环找到最大的,放到max中,记录最大值的下标
            int max = a[i];
            int temp = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < max) {
                    max = a[j];
                    temp = j;
                }
            }
            //调换位置
            if (temp != i) {
                a[temp] = a[i];
                a[i] = max;
            }
        }
        return a;
    }
}
