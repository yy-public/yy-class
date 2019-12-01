package day10;

import java.util.Scanner;

/*
题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
(2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。
(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
 */
public class Demo02Practice {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);//定义从键盘输入
        System.out.print("请输入一个正整数:");//提示
        x = in.nextInt(); //将从键盘输入的数赋值给x
        new PrimeSplit(x); //匿名初始化一个对象，还有参数的构造函数
    }
}

class PrimeSplit{
    int k = 2; //将最小的质数赋值给k
    public PrimeSplit(int x){  //小于等于1的数不可以分解
        if(x<=1){
            System.out.println(x+"是无效的被分解数");
        }
        else if(x==2){
            System.out.println(x+"分解后的质因数为: 1*"+x);   //如果输入的是最小质数2，
        }else {
            System.out.print(x+"分解后的质因数为: 1"); //1是所有的正整数的质数
            while(k<=x){   //输入的数可以被k整除
                if(x%k==0){
                    System.out.print("*"+k);           //将k添加到结果中
                    x = x/k;//除以最小质数后重新循环
                }
                else{
                    k++;
                }
            }
        }
    }
}