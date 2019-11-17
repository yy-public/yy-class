package day03;
/*
一个标准的类通常由以下的四个组成部分：

1.所有的成员变量都要使用private的关键字进行修饰。
2.为每一个成员变量都编写一对Getter/Setter方法。
3.编写一个无参数的构造方法。
4.编写一个全参数的构造方法。

这样的标准的类也叫Java Bean
 */
public class Demo05Student {

    private String name;//姓名
    private int age;//年龄

    public Demo05Student() {
    }

    public Demo05Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
