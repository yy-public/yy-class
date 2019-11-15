package day01;
/*
使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值，规则如下：
如果为整数类型，呢么默认为0；
如果为浮点类型，那么默认为0.0；
如果为字符类型，那么默认为‘\u0000';
如果为布尔类型，那么默认为false；
如果为引用类型，那么默认为null。

注意事项：
静态初始化也有默认值的过程，只不过系统自动马上将默认值替换成了大括号里面的具体数值。
 */
public class Demo03ArrayUse {
    public static void main(String[] args){
        int [] array = new int [3];

        System.out.println(array);//内存地址值
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0
        System.out.println("============");

        //将数据123赋值交给数组array当中的1号元素
        array [1] = 123;
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0
    }
}
