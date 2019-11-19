package day05;

import java.util.ArrayList;

/*
数组的长度不可发生改变
但是ArrayList集合的长度是可以随意改变的

对于ArrayList来说，有一个尖括号<E>代表泛型。
泛型：也就是装在集合当中的所有元素，全部都统一的什么类型。
注意：泛型只能是引用类型，不能是基本类型。

注意事项：
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
如果内容是空的，得到的是空的中括号；[]
 */
public class Demo02ArrayList {

    public static void main(String [] args){
        //创建了一个ArrayList集合，集合的名称是List，里卖弄装的全都是String字符串类型的数据
        //备注：从JDK1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合当中添加一些数据，需要用到add方法。
        list.add("姣姣");
        System.out.println(list);//[姣姣]

        list.add("阿春");
        list.add("春姣");
        System.out.println(list);//[姣姣, 阿春, 春姣]
    }
}
