package day03;

public class Demo03PhoneUse {
    public static void main(String[] args) {

        Demo03Phone use = new Demo03Phone();
        use.brand = "Iphone";
        use.price = 10888.8;
        use.color = "星空灰";

        System.out.println(use.brand);
        System.out.println(use.price);
        System.out.println(use.color);

        use.call("姣姣");
        use.senMessag("我爱你");
    }
}