package day17;

import java.util.Random;

/*
题目：
向一个长度为5的整型数组中随机生成5个1-10的随机整数
要求生成的数字中没有重复数
 */
public class Practise05 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Random ran = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ran.nextInt(10) + 1;

            for (int j = 0; j < i; j++) {
                while (nums[i] == nums[j]) {//如果重复，退回去重新生成随机数
                    i--;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
