package day02;

public class Practice09 {
    public static void main(String[] args){
        int a = 149;
        int i = 1;
        while (a / 10 != 0){
            a  = a /10;
            i++;
        }System.out.println(i);
        System.out.println("=============");
        a = 895;
        boolean m = true;
        while (a / 10 != 0){
            if(a / 1000 ==0){
                int s = a % 10;
                a = a / 10;
                int t = a % 10;
                a = a /10;
                int d = a % 10;
                if (d != 0){
                    System.out.println(d);
                }
                System.out.println(t);
                System.out.println(s);
        }else{
                int h = a % 10;
                a = a / 10;
                int f = a % 10;
                a = a / 10;
                int g = a % 10;
                a = a / 10;
                int k = a % 10;
                System.out.println(k);
                System.out.println(g);
                System.out.println(f);
                System.out.println(h);
            }
            m = false;

        }
        if (m){
            System.out.println(a);
        }
    }
}
