package day15.practise.review.day;

import java.util.Scanner;

public class Practise03 {
    public static void main(String[] args) {
        int a = 1000;
        int sum = 0;
        while (a / 10 != 0) {
            sum += a % 10;
            a = a / 10;

        }
        sum = sum + a;
        System.out.println("各位数字之和为" + sum);
    }
}


