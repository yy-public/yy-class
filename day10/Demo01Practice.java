package day10;
/*
古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class Demo01Practice {
    public static void main(String args[]){
        //i是表示月份的，这里计算了36个月，也就是三年，兔子的数量
        int i;
        long arr[]=new long[36];   //这个数组时用来计算每月有兔子的对数
        arr[0]=arr[1]=1;
        System.out.println("第1个月有兔子1对"+", "+"总数是"+2);
        System.out.println("第2个月有兔子1对"+", "+"总数是"+2);
        for(i=2;i<=35;i++){
            arr[i]=arr[i-1]+arr[i-2];
            System.out.println("第"+i+"个月有兔子"+arr[i]+"对"+", "+"总数是"+2*arr[i]);
            //规律是每个数字都是前面两个数字之和
        }
    }
}
