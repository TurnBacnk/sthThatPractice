package day17;

public class Tank extends Weapon implements Moveable,Shootable{
    public Tank(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开炮");
    }
}
