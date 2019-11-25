package com.leetcode.solution;

/**
 * @Author:chenhao
 * @Date:2019/11/20 9:39
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 */
public class Solution415 {
    public static void main(String[] args) {
        System.out.println(addStrings("3876620623801494171"
                , "6529364523802684779"));
    }

    public static String addStrings(String num1, String num2) {
        /*
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += num2.charAt(j--) - '0';
            }
            sb.append(carry % 10);
            carry /= 10;
        }
        return sb.reverse().toString();
        */
        int num1length = num1.length()-1;
        int num2length = num2.length()-1;
        int max = (num1length-num2length)>0?num1length:num2length;
        StringBuilder sb = new StringBuilder();
        boolean status = false;
        int n1=0;
        int n2=0;
        for (int i=0;i<=max+1;i++){
            if (num1length>=0){
                n1 = (int)num1.charAt(num1length)-48;
            }else {
                n1=0;
            }
            if (num2length>=0){
                n2 = (int)num2.charAt(num2length)-48;
            }else {
                n2=0;
            }
            int sum=n1+n2;
            if(i==max+1&&!status){
                continue;
            }
            if (!status){
                sb.insert(0,sum%10);
                status = sum >= 10;
            }else {
                sb.insert(0,(sum+1)%10);
                status = sum+1 >= 10;
            }
            num1length--;
            num2length--;
        }
        return sb.toString();
    }
}
