package day14;

public class Demo02practise {
    public static void main(String[] args) {
        int[] array = {12, 54, 456, 5, 99};
        int m = 999;
        int i = 0;
        for (; i < array.length; i++) {
            if (m == array[i]) {
                System.out.println("存在");
                break;
            }
        }
        if(i == array.length){
            System.out.println("不存在");
        }
    }
}