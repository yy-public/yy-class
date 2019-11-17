package day03;

public class Demo04StudentUse {

    public static void main(String [] args){
        Demo04Student stu = new Demo04Student();

        stu.setName("韩姣");
        stu.setAge(18);
        stu.setMale(false);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是爷们儿：" + stu.isMale());
    }
}
