package day08;

public class Cat extends Pet{
    private String name;
    public void eat()
    {
        System.out.println("小猫正在吃鱼");
    }

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }
}
