package day05;
/*
如果希望向集合ArrayList当中体检基本类型数据，必须使用基本类型对应的“包装类”

基本类型    包装类（引用类型，包装类都在java.lang 包下）
byte        Byte
short       Short
int         Integer     【特殊】
long        Long
float       Float
double      Double
char        Character    【特殊】
blean       Boolean

从JDK1.5开始，支持自动装箱，自动拆箱

自动装箱： 基本类型--->包装类型
自动拆箱： 包装类型--->基本类型
 */
import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args){

        ArrayList<String> listA = new ArrayList<>();
        //错误写法！泛型只能用引用类型，不能用基本类型
//        ArrayList<int> listB = new ArrayList<>();
        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        listC.add(300);
        System.out.println(listC);//[100, 200, 300]

        int num = listC.get(1);
        System.out.println("得到的数字是：" + num);
    }
}
