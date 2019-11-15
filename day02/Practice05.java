package day02;
/*
计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
 */
public class Practice05 {
    public static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;
        double sum = 0;
        for (int n = 1; n <= 100; n++) {
            if (n % 2 == 0){
                sum1 = sum1 - (1.0 / n);
            }
            else{
                sum2 = sum2 + (1.0 / n);

            }
        }
        sum = sum1 + sum2;
        System.out.println(sum);
    }
}