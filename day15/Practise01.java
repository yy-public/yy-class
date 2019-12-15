package day15.practise.review.day;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
生成6个1~33之间的随机整数，添加到集合并遍历集合。
 */
public class Practise01 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        Random r = new Random();
        for(int i = 0 ; i < 6 ; i++){
            int sum = r.nextInt(33) + 1;
            list.add(sum);
        }
    }
}