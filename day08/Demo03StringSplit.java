package day08;
/*
分割字符串的方法
public  String[] split(String regex):根据参数的规则，将字符串切分成若干部分

注意事项：
split方法的参数其实是一个“正则表达式”
如果按照英文句点“.”进行分割，必须写"\\."(两个反斜杠)
 */
public class Demo03StringSplit {

    public static void main(String[] args){
        String str1 = "aaa,bbb,ccc";
        String[] array1 =  str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("==================");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
        System.out.println("===================");

        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split(".");
        System.out.println(array3.length);//0
        System.out.println(array3);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        System.out.println("====================");

        String str4 = "XXX.YYY.ZZZ";
        String[] array4 = str4.split("\\.");
        System.out.println(array4.length);//0
        System.out.println(array4);
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }
    }
}
