package day02;
/*
求10 个整数中最大值
 */
public class Practice02 {
    public static void main(String[] args){
        int [] array = new int [] {15,89,1117,5641,464546546,48646,21318846,233,0,5};
        int max = array [0];
        for( int i = 0 ;i < array.length; i ++){
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}