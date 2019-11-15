package day01;
/*
数组的概念：是一种容器，可以放置多个数据值。

数组的特点：
1.数组是一种引用数据类型
2.数组当中的多个数据，类型必须统一。
3.数组的长度在程序的运行期间不可改变。

数组的初始化：在内存当中创建一个数组，并且向其中赋予一些默认值。

两种常见的初始化方式：
1.动态初始化（指定的长度）
2.静态初始化（指定的内容）

动态初始化数组的格式：
数据类型[] 数组名称 = new 数据类型[数组长度];

静态初始化数组的基本格式：
数据类型[] 数组名称 = new 数据类型 [] {元素1， 元素2，...};

静态初始化数组的省略格式：
数据类型[] 数组名称 = {元素1，元素2，...};
 */
public class Demo01Array {
    public static void main(String[] args){
        //创建一个数组，里面可以存放300个int数据
        int [] arrayA = new int [300];

        //创建一个数组，能存放五个字符串
        String [] arrayB = new String [5];

        //直接创建一个数组，里面装的全部都是int数字，具体为：5，15，20
        int [] arrayC = new int [] {5,15,20};
        int [] arrayE = {5, 15, 20};

        //创建一个数组，用来装字符串： “Hello“ ，”World“，“Java”
        String [] arrayD = new String [] {"Hello", "World", "Java"};
        String [] arrayF = {"Hello", "World", "Java"};

    }
}
