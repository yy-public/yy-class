package day06;
/*
题目：
用一个大集合存放20个随机数字，然后筛选其中的偶数元素，放到小集合当中
要求使用自定义的方法来是实现
(本题以100以内的范围做例子)

分析：
1.需要创建一个集合，用来存取int数字：<Integer>
2.随机20个数字，需要用到Random  nextInt
3.循环20次，把随机数字放进大集合，for循环，add方法
4.定义一个方法，用来进行筛选
筛选：根据大集合，筛选符合要求的元素，得到小集合
三要素：
返回值类型：ArrayList小集合（元素个数不确定）
方法名称：getSmallList
参数列表：ArrayList大集合（装着20个随机数字）
5.判断（if） 是偶数：num % 2 == 0，如果是偶数，就放到小集合当中，否则不妨。
 */
import java.util.ArrayList;
import java.util.Random;
public class Demo04ArrayListReturn {
    public static void main(String[] args){
        ArrayList<Integer>listA = new ArrayList<>();
        Random r = new Random();
        for (int i = 0 ;i < 20; i++){
            int result = r.nextInt(100)+1;
            listA.add(result);
        }
        //大集合中判断出的符合要求的数放进小集合
        ArrayList<Integer> listB = getSmalleList(listA);
        System.out.println("符合要求的数有：" + listB.size() + "个");
        //遍历小集合
        for(int i = 0;i < listB.size();i++){
            System.out.println(listB.get(i));
        }
    }
    //这个方法，接受大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmalleList(ArrayList<Integer>listA) {
        //创建一个小集合，用来装偶数结果
        ArrayList<Integer> listB = new ArrayList<>();
        for (int i = 0; i < listA.size();i++) {
            int num = listA.get(i);
            if (num % 2 == 0){
                listB.add(num);
            }
        }
        return listB;
    }
}
