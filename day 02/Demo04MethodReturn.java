package yy.jc.day01.demo02;
/*
题目要求：定义一个方法，用来【求出】两个数字之和
题目变形：定义一个方法，用来【打印】两个数字之和

注意事项：
对于有返回值的方法，可以使用单独调用，打印调用和赋值调用；
对于无返回值的方法，只能使用单独调用，不能使用打印调用或者赋值调用
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        //我是main方法，我来调用你。
        // 我调用你，你来帮我计算一下，算完了之后，把结果告诉我的num变量
        float num = sum(15,30);
       System.out.println("结果是："+ num);
       System.out.println("------------");

       printsum(15,5);
}

    //我是一个方法，我负责两个数字相加。
    //我有返回值int，谁调用我，我就把结果告诉谁
    public static float sum(int a, int b) {
        int result = a + b;
        return result;
    }

    //我是一个方法，我负责两个数字相加
    //我没有返回值，不会把结果告诉任何人，而是我自己进行打印输出。

    public static void printsum(int a, int b){
        int result = a + b ;
        System.out.println("结果是：" + result);
        }
}
