package day14;

public class Demo03Practise {
    public static void main(String[] args) {
        int[]array = {1,5,978,544};
        int m = 5444;
        int i = 0;
        for (; i < array.length; i++) {
            if(m == array[i]){
                System.out.println(i);
                break;
            }
        }
        if(i == array.length){
            System.out.println("-1");
        }
    }
}
