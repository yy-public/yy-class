package day03;

public class Demo05StudentUse {
    public static void main(String[] args) {
        Demo05Student stu1 = new Demo05Student();
        stu1.setName("韩姣");
        stu1.setAge(20);
        System.out.println("姓名：" + stu1.getName() + "，年龄：" + stu1.getAge());
        System.out.println("===============");

        Demo05Student stu2 = new Demo05Student("杨阿春",19);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        stu2.setAge(20);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
    }
}
