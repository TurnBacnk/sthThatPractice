package day17;

public class Fighter extends Weapon implements Moveable,Shootable{
    public Fighter(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("战斗机起飞");
    }

    @Override
    public void shoot() {
        System.out.println("战斗机开跑");
    }
}
