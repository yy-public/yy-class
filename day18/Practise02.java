package day18;
/*
题目：
随机生成一个1-100之间的数字num，循环让用户输入猜这个数，
如果用户输入的数字大于num提示输入的数字比较大，
如果用户输入的数字小于num提示输入的数字比较小，
直到用户输入的数字和num相等为止，然后输出用户猜数的总次数
 */
import java.util.Random;
import java.util.Scanner;

public class Practise02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random ran=new Random();
        //生成游戏答案1~100
        int num=ran.nextInt(100)+1;
        //System.out.println(num);
        int n=0;//定义n的初值
        int i=0;//定义猜数次数
        while(n!=num) {
            System.out.println("请猜数字");
            n=scan.nextInt();
            if(n>num) {//判断猜数结果
                System.out.println("输入的数字较大");
            }else if(n<num) {
                System.out.println("输入的数字较小");
            }else {
                System.out.println("恭喜您猜对了");
            }
            i++;//猜数次数加1
        }
        System.out.println("总共猜了"+i+"次");
    }
}
