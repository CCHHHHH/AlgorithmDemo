package com.leetcode.classicsort;

import java.util.Arrays;

/**
 * @Author:chenhao
 * @Date:2019/11/22 9:36
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] a = {8, 1, 9, 5, 6, 4, 3, 3, 7};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] a) {
        /**
         * 冒泡排序:就是俩俩比较,若前一个数比后一个数大,则调换位置,N个数,则需要循环N-1次
         */
        //设置一个标志位,如果一次循环中,没有数调换顺序,则表示已经排序完毕,结束循环
        boolean flag = false;
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
        return a;
    }
}
