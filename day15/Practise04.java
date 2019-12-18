package day15.practise.review.day;

public class Practise04 {
    public static void main(String[] args) {
        int a = 121;
        String str = String.valueOf(a);
//        System.out.println(str);
        char[] Array = str.toCharArray();
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }
}
