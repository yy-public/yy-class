package day04;
/*
练习：键盘输入两个数字并进行求和。
 */
import java.util.Scanner;
public class Demo02ScannerSum {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("输入第二个数字");
        int num2 = sc.nextInt();
        int sum = num1 + num2 ;
        System.out.println("求和结果是：" + sum);
    }
}
