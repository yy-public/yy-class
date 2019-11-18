package day04;
/*
Random由于生成随机数字，三个步骤
导包，创建，使用

导包  import java.util.Random;

创建  Random r = new Random();//小括号留空即可

使用
获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt();
获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r. nextInt();
实际上代表的含义：[0,3)，也就是0~2。
 */
import java.util.Random;
public class Demo04Random {
    public static void main(String[] args){
        Random r = new Random ();

        int num = r.nextInt();
        System.out.println("随机数字是：" + num);
    }
}
