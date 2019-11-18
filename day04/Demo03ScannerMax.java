package day04;
/*
题目要求：
键盘输入三个int数字，而案后求出其中的最大值。

思路：
Scanner三个步骤：导包，创建，使用nextInt
三个数字，调用三次nextInt()方法
 */
import java.util.Scanner;
public class Demo03ScannerMax {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数");
        int num1 = sc.nextInt();
        System.out.println("输入第二个数");
        int num2 = sc.nextInt();
        System.out.println("输入第三个数");
        int num3 = sc.nextInt();

        int max = (compare(num1,num2,num3));
        System.out.println("最大值是：" + max);
    }
    public static int compare (int num1,int num2,int num3){
        int max;
        if (num1 > num2){
            max  = num1 > num3 ?  num1 : num3;
        }else{
            max = num2 > num3 ? num2 : num3;
        }
        return max;
    }

}