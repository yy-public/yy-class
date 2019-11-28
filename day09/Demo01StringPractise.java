package day09;
/*
题目：
定义一个方法，把数组{1，2，3}按照指定的格式拼接成一个字符串，格式参照如下：[word#1word#2word#3]。

分析：
1.首先准备一个int[]数组，内容就是：1、2、3
2.定义一个方法，用来将数组变成字符串
三要素：
返回值类型：String
方法名称：fromArrayToString
参数列表：int[]
3.格式:[word#1word#2word#3]
用到：for循环，字符串拼接，每个元素之前都有一个word字样，分隔使用的是#、区分一下是不是最后一个
4.调用方法L：得到返回值，并 打印结果字符串
 */
public class Demo01StringPractise {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        String result =fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "word" + array[i] + "]";
            } else {
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }
}