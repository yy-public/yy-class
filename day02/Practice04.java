package day02;
/*
将三个数按从大到小输出
 */
public class Practice04 {
    public static void main(String [] args){
        int a = 119;
        int b = 777;
        int c = 13;
        if (a > b){
            if (a > c){
                System.out.println(a);
                if (b > c){
                    System.out.println(b);
                    System.out.println(c);
                }
            }
            else {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        }
        else{
            if (b > c){
                System.out.println(b);
                if (a > c ){
                    System.out.println(a);
                    System.out.println(c);
                }
            }
            else{
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}
