package day02;
/*
将数组A中的内容和数组B中的内容进行交换
 */
public class Practice06 {
    public static void main(String[] args) {
        int arrayA[] = new int[]{3, 9, 16};
        int arrayB[] = new int[]{45,98,777};
        int arrayC[] = null;
        arrayC = arrayA;
        arrayA = arrayB;
        arrayB = arrayC;
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("======================");
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
    }
}