package day02;
/*
输出所有的“水仙花数”，所谓“水仙花数”是指一个3位数,其各位数字立方和等于该数本身。
例如，153是一个水仙花数，因为153=1^3+5^3+3^3
*/
public class Practice08 {
    public static void main(String [] args){
        for (int i = 1;i < 10; i ++ ){
            for (int j = 0; j < 10; j++ ){
                for (int k = 0; k < 10 ; k ++){
                    if ((i * i * i ) + (j * j * j) +(k * k * k) == (100 * i ) + (10 * j) + k){
                        System.out.println(100 * i + 10 * j + k );
                    }
                }
            }
        }
    }
}
