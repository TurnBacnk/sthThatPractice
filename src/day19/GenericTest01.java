package day19;

import java.util.ArrayList;
import java.util.List;


public class GenericTest01 {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        Cat c1 = new Cat();

        b1.move();
        c1.move();
        System.out.println("=====================");

        List<Animal> mylist = new ArrayList<>();

        mylist.add(b1);
        mylist.add(c1);

        for ( Animal a1 : mylist ) {
            a1.move();
        }
    }
}
class Animal implements Move{

    public void move() {
        System.out.println("动物的移动父类方法");
    }
}

class Cat extends Animal implements Move{
    @Override
    public void move() {
        System.out.println("猫抓老鼠");
    }
}

class Bird extends Animal implements Move{

    @Override
    public void move() {
        System.out.println("鸟儿飞翔");
    }
}
