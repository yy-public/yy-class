package day17;
/*
题目
有一个400米一圈的操场，一个人要跑10000米，
第一圈50秒，其后每一圈都比前一圈慢1秒，
按照这个规则计算跑完10000米需要多少秒
 */
public class Practise03 {
    public static void main(String[] args) {
        int round=10000/400;
        int sum=0;
        int time=50;
        for(int i=1;i<=round;i++) {
            sum+=time;
            System.out.println("圈数:"+i+",时间:"+time+",花的时间:"+sum);
            time++;
        }
        System.out.println(sum);
    }
}
