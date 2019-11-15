package day02;

public class Practice03 {
   /*
   将三个数按从大到小输出(未完成版本)
    */
    public static void main(String[] args) {
        int array [] = new int [] {30,98,13};
        int max = array[0];
        int min = array[2];
        int num = array[1];
        for (int i = 0 ; i < 3 ; i++) {
            if (max < array[i]){
                max = array[i];
            }
            for (int a =0; a < 3; a++){
                if (min > array[a]){
                    min = array[a];
                }
            }
            for (int c =0; c <3 ; c++){
                if (num <max && num >min){
                    num = array[c];
                }
            }
        }
        System.out.println(max);
        System.out.println(num);
        System.out.println(min);
    }

}
