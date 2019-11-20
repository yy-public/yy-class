package day05;

import java.util.ArrayList;

/*
ArraryListt当中的常用方法有：

public boolean add(E,e);向集合当中添加元素，参数的类型和泛型一致。
public E get(int index);从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
public E remove(int index);从集合当中删除元素，参数是索引编号，返回值就是被删掉的元素。
public int size(); 获取集合的尺寸长度，返回值是集合中包含的元素个数。
 */
public class Demo03ArrayListMethod {

    public static void main(String[] args){
        ArrayList<String>list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合当中添加元素：add
        boolean success = list.add("姣姣");
        System.out.println(list);//[姣姣]
        System.out.println("是否成功：" + success);//true

        list.add("阿春");
        list.add("春姣");
        System.out.println(list);//[姣姣, 阿春, 春姣]

        //从集合当中获取元素：get。索引值从0开始
        String name = list.get(2);
        System.out.println("2号索引的位置：" + name);//春姣

        //从集合当中删除元素：remove。索引值从0开始
        String whoRemoved = list.remove(1);
        System.out.println("被删除的人是：" + whoRemoved);//阿春
        System.out.println(list);//[姣姣, 春姣]

        //获取集合的尺寸长度，也就是其中的元素的个数
        int size = list.size();
        System.out.println("集合的长度是：" + size);
    }
}
