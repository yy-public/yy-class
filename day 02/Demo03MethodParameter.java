package yy.jc.day01.demo02;

/*
有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务的时候，就是有参数，
例如两个数据相加，必须知道两个数字各自是多少，才能相加。
无参数：小括号当中留空。一个方法不需要任何数据条件，自己就能独立完成任务，就是无参数，
例如定义一个方法，打印固定10次HelloWorld。
*/
public class Demo03MethodParameter {

    public static void main(String[] args){
        method1(25,30);
        method2();

    }
    //两个数字相乘，做乘法，必须知道两个数字各自是多少，否则无法进行计算
    //有参数
    public static void method1(int a, int b){
        int result = a * b;
        System.out.println("结果是：" + result);
    }

    //打印输出固定10次文本串
    public static void method2(){
        for (int i = 0; i < 10; i++) {
        System.out.println("我爱你！！");
            
        }
        // for (int i = 1 ; i <= 10; i++){
           // System.out.println("HelloWorld!!");
        }
    }
