package day17;
/*
题目：
商场消费返利活动，手动输入顾客消费金额，
如果金额打8折后仍然满1000元，用户就获得200元代金券一张（不考虑多张）
 */
import java.util.Scanner;

public class Practise01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入消费金额");
        int num = scan.nextInt();

        double dis = num * 0.8;// 打折后的价格
        if (dis > 1000) {
            dis = dis - 200;// 200元代金券
        }
        System.out.println(dis);
    }
}
