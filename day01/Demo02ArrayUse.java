package day01;
/*
直接打印数组名称，得到的是数组对相应的，内存地址哈希值。

访问数组元素的格式：数组名称[索引值]
索引值：就是一个int数字，代表数组当中的元素编号。
【注意】索引值从0开始，一直到“数组的长度-1”为止。
 */

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Demo02ArrayUse {
    public static void main(String[] args) {
        //静态初始化的省略格式
        int[] array = {10, 20, 30};

        System.out.println(array);//[I@1c53fd30

        System.out.println(array[0]);//10
        System.out.println(array[1]);//20
        System.out.println(array[2]);//30
        System.out.println("==========");

        int num = array[1];
        System.out.println(num);//20
    }
}