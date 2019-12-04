package day11;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        //首先设置一下教室，这是静态的东西。应该通过类名称调用
        Student.room = "陕西科技大学";

        Student one = new Student("阿春",20);
        System.out.println("one的姓名" + one.getName());
        System.out.println("one的年龄" + one.getAge());
        System.out.println("one的教室" + Student.room);
        System.out.println("============================");

        Student two = new Student("姣姣",20);
        System.out.println("two的姓名" + two.getName());
        System.out.println("two的年龄" + two.getAge());
        System.out.println("two的教室" + Student.room);
    }
}
