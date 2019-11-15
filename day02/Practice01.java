package day02;
/*
给定两个整形变量的值，将两个值的内容进行交换。
 */
public class Practice01 {
    public static void main(String [] args) {
        int a = 15;
        int b = 20;
        int num = a;
        a = b;
        b = num;
        System.out.println("a的值为" + a);
        System.out.println("b的值为" + b);
    }

}


