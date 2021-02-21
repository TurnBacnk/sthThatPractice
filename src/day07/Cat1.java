package day07;

public class Cat1 extends Animal1 {
    /**
     * 一旦继承，即是不再重写方法，父类的方法依然会被继承过来，即注释掉move（）方法，依然可以调用
     */
    @Override
    public void move() {
       System.out.println("猫在走猫步");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }

    public Cat1(String name) {
        super(name);
    }
}
