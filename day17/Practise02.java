package day17;
/*
题目：
商场根据会员积分打折，
2000分以内打9折，
4000分以内打8折
8000分以内打7.5折，
8000分以上打7折，
使用if-else-if结构，实现手动输入购物金额和积分，计算出应缴金额
 */
import java.util.Scanner;

public class Practise02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入购物金额");
        double shop = sc.nextDouble();
        System.out.println("请输入积分");
        int fen = sc.nextInt();
        if (fen < 2000) {
            shop *= 0.9;
            System.out.println("目前消费" + shop + "元");
        } else if (fen >= 2000 && fen <= 4000) {
            shop *= 0.8;
            System.out.println("目前消费" + shop + "元");
        } else if (fen <= 8000 && fen > 4000) {
            shop *= 0.75;
            System.out.println("目前消费" + shop + "元");
        } else if (fen > 8000) {
            shop *= 0.7;
            System.out.println("目前消费" + shop + "元");
        } else {
            System.out.println("抱歉没有折扣");

        }
    }
}
