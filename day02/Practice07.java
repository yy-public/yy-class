package day02;
/*
编写程序数一下 1到 100 的所有整数中出现多少次数字9
 */
public class Practice07 {
    public static void main(String [] args ){
        int a = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 10 == 9 || i / 10 ==9){
                a++;
            }
        }
        System.out.println(a);
    }
}
