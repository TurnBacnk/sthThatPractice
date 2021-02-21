package day17;

public class WuZiFeiJi extends Weapon implements Moveable{

    public WuZiFeiJi(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("物资运输机飞了");
    }
}
