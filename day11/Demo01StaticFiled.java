package day11;
/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于对象所在的类，多个对象共享一份数据。
 */
public class Demo01StaticFiled {
    public static void main(String[] args) {
        Student one = new Student("阿姣",18);
        one.room = "福慧图书馆";
        System.out.println("姓名：" + one.getName()
                + ",年龄：" + one.getAge()+ ",所在教室：" + one.room + ",学号是" + one.getId());
        Student two = new Student("阿春",18);
        System.out.println("姓名：" + two.getName()
                + ",年龄：" + two.getAge()+ ",所在教室：" + two.room + ",学号是" + two.getId());
    }
}
