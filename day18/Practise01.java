package day18;
/*
题目：定义一个数组int[] nums={8,7,3,9,5,4,1}
输出数组中的最大值和最大值所在的下标
 */
public class Practise01 {
    public static void main(String[] args) {
        int[] nums={8,7,3,9,5,4,1};
        int max = nums[0];//默认第一个最大
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        System.out.println("最大的数： "+max+" 下标： "+index);
    }
}
