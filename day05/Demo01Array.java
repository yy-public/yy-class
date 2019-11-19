package day05;
/*
题目：
定义一个数组，用来储存3个person对象。

数组有一个缺点，一旦创建，程序运行期间长度不可再改变。
 */
public class Demo01Array {

    public static void main(String [] args){
        //首先创建一个长度为3的数组，里面用来存放person类型的对象
        Person[] array = new Person[3];

        Person one = new Person("姣姣",20);
        Person two = new Person("阿春",20);
        Person three = new Person("春姣",18);

        //将one当中的地址值赋值到0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);//地址值
        System.out.println(array[1]);//地址值
        System.out.println(array[2]);//地址值

        Person person = array[1];
        System.out.println(person.getName());//阿春
        System.out.println(person.getAge());
        System.out.println(array[0].getName());//姣姣
    }
}

