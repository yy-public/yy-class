package day12;
/*
井里有一只蜗牛，他白天往上爬5米，晚上掉3.5米，井深56.7米
计算蜗牛需要多少天才能从井底到爬出来
 */
public class Demo02Practice {
    public static void main(String[] args) {
        int day=1;//天数
        double sum=0;//爬过的距离
        while(true) {
            //白天向上爬5米
            sum+=5;
            System.out.println("day:"+day+",sum:"+sum);
            if(sum>=56.7) {//如果爬出了井
                //退出循环
                break;
            }
            //晚上掉3.5;
            sum-=3.5;
            day++;
        }
        System.out.println(day);
    }
}
