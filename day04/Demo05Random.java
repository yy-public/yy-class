package day04;
/*
题目
根据int变量n的值，来获取随机数字，范围是[1,n],可以取到1，也可取到n

思路：
左闭右开，如果写上n，就是0~n-1,但是现在需要的是1~n，可以发现，整体加1即可
 */
import java.util.Random;
public class Demo05Random {
    public static void main(String [] args){
        int n = 5;
        Random  r = new Random();
        for (int i = 0 ;i< 100;i ++){
            //本来范围是[0,n),整体+1之后变成了[1，n+1)，也即是[1,n]
            int result = r.nextInt(n)+ 1 ;
            System.out.println(result);
        }
        }

}
