package day04;
/*
题目：
用代码模拟猜数字的小游戏

思路：
1.首先需要产生一个随机数字，并且一旦产生不在变化
2.需要键盘输入
3.获取键盘输入的数字
4.已经得到连两个数，做判断
 */
import java.util.Random;
import java.util.Scanner;
public class Demo06RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100) + 1;
        // 最多十次机会
        for (int p = 0; p < 10; p++) {
            Scanner sr = new Scanner(System.in);
            int m = sr.nextInt();

            if (m > n) {
                System.out.println("猜的有点大了(⊙o⊙)");
            } else if (m < n) {
                System.out.println("猜的小了呀呀呀QAQ");
            } else {
                System.out.println("恭喜宝宝猜对啦，奖励一个亲亲么么");
                break;
            }
          }



        /*Scanner s = new Scanner(System.in);
        Random r = new Random ();
        int t = r.nextInt(100)+ 1;
        while(s.hasNext()){
            int m = s.nextInt();
            if (m > t){
                System.out.println("猜的有点大了(⊙o⊙)");

            }else if (m < t) {
            System.out.println("猜的小了呀呀呀QAQ");
            }else{
                System.out.println("恭喜宝宝猜对啦，奖励一个亲亲么么");
                break;
            }

        }*/
        /*Random r = new Random();
        int n = r. nextInt(100) + 1 ;


       while(true){
           Scanner sc = new Scanner(System.in);
           int m = sc.nextInt();
           if (m > n){
               System.out.println("大了" );
           }else if(m < n){
               System.out.println("小了");
           }else{
               System.out.println("呵呵，对了");
               break;
           }
       }



*/
        }
}