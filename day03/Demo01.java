package day03;
/*
一个方法当中可以有0，1多个参数，但是只能有0个或者1个返回值，不能有多个返回值。
希望一个方法当中产生了多个结果数据进行返回，使用一个数组作为返回值类型即可。

任何数据类型都能作为方法的参数类型，或者返回值类型。

数组作为方法的参数，传递进去的其实是数组的地址值。
数组作为方法的返回值，返回的其实也是数组的地址值。
 */
public class Demo01 {
    public static void main(String [] args){
        int [] result = calculate(15,25,20);

        System.out.println("main方法接收到的返回值：");
        System.out.println(result);
        System.out.println("总和：" + result[0]);
        System.out.println("平均数：" + result[1]);
    }
    public static int [] calculate(int a ,int b,int c){
        int sum = a + b + c;
        int avg = sum / 3;
        //两个结果都希望返回
        //需要一个数组，可以把这两个结果都保存
        int [] array = {sum , avg };
        System.out.println("calculate方法的内部数组是：");
        System.out.println(array);
        return array;
    }
}
