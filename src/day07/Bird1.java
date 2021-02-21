package day07;

public class Bird1 extends Animal1{
    @Override
    public void move() {
        System.out.println("鸟儿在飞");
    }
    public void fly()
    {
        System.out.println("飞");
    }

    public Bird1(String name) {
        super(name);
    }
}
