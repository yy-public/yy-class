package day13;

import java.util.Arrays;

/*
题目：
请使用Arrays相关的API,将一个随机的字符串的所有字符升序排列，并倒叙打印。
 */
public class Demo03ArraysPractise {
    public static void main(String[] args) {
        String str = "adavsdf61a53fdaf1";

        //如何进行升序的排列：sort
        //必须是一个数组，才能用Arrays.sort方法
        //String-->数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);//对字符数组进行升序排列

        //需要倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);

        }
    }
}
