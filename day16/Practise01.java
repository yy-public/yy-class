package day16;

import java.util.Scanner;

public class Practise01 {
    public static void main(String[] args) {
        int num = 1;
        if(num < 0 )
            System.out.println(false);
        int a = num;
        int b = 0;
        while ( num >= 10){
            b = b * 10 + num % 10;
            num /= 10;
        }
        if (num < 10) {
            b = b * 10 + num % 10;
        }
        if (a == b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
