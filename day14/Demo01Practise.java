package day14;

public class Demo01Practise {
    public static void main(String[] args) {
        int[] array = {1,2,5,85};
        int m  = array[0];
        for (int i = 0; i < array.length; i++) {
            if(m < array[i]){
                m = array[i];
            }
        }
        System.out.println(m);
    }
}
