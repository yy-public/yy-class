package yy.jc.day01.demo04;
/*
题目要求：
比较两个数据是否相等。
参数类型分别为两个byte类型，两个short类型，两个int类型。两个long类型，
并在main方法中进行测试。
 */

public class Demo02MethodOvreloadSame {
    public static void main(String[] args) {
        byte a = 20;
        byte b = 30;
        System.out.println(compare(a, b));

        System.out.println(compare((short) 10, (short) 30));

        System.out.println(compare(20,20));

        System.out.println(compare(15L, 30L));

    }

    public static boolean compare(byte a, byte b) {
        System.out.println("两个byte方法的执行");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean compare(short a, short b) {
        System.out.println("两个short方法的执行");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean compare(int a, int b){
        System.out.println("两个int方法执行");
        return (a == b);
    }

    public static boolean compare (long a, long b){
        System.out.println("两个long方法的执行");
        if (a == b){
            return true;
        }else{
            return false;
        }
    }



}
