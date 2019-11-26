package day08;
/*
String当中与转换相关的常用方法有：

public char[] toCharArray()：将当前字符串拆分成字符数组作为返回值。
public byte[] getBytes():获得当前字符串底层的字节数组。
public String replace(charSequence oldString,charSequence newString):
将所有出现的老字符串替换为新的字符串，返回替换之后的结果新字符串
备注：CharSequence意思就是说可以接受字符串类型
 */
public class Demo02StringConvert {

    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);//H
        System.out.println(chars.length);//5
        System.out.println("================");

        //转换为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("================");

        String str1 = "How are you?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);//How are you?
        System.out.println(str2);//H*w are y*u?
        System.out.println("=================");

        String lang1 = "会不会玩啊，fw";
        String lang2 = lang1.replace("fw", "**");
        System.out.println(lang1);
        System.out.println(lang2);
    }
}
