package day03;
/*
对于基本类型的当中的boolean值，Geeter方法一定要写成isXxx的格式，而setXxx规则不变
 */
public class Demo04Student {

    private String name;//姓名
    private int age;//年龄
    private boolean male;//是不是爷们

    public void setMale(boolean b){
        male = b;
    }

    public boolean isMale(){
        return male ;
    }

    public void setName(String str){
        name = str ;
    }

    public String  getName(){
        return name;
    }

    public void setAge(int num){
        age = num;
    }

    public int getAge(){
        return age ;
    }
}
