package day06;
/*
题目：
生成6个1~33之间的随机整数，添加到集合并遍历集合。

思路：
1.需要储存6个整数，所以用到数组集合ArrayList
2.随机产生，用到Random
3.循环6次，用到for循环
4.循环内调用r.nextInt(33),此时范围为0~32,还应该加上1
5.把数字添加到集合当中add
6.遍历集合，for ，size,get
 */
import java.util.ArrayList;
import java.util.Random;
public class Demo01ArrayListMethod {
    public  static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6;i++){
            int result = r.nextInt(33) + 1;
            list.add(result);

        }
        for (int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
