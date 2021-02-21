package day17;

public class AntiAircraftGun extends Weapon implements Shootable{
    public AntiAircraftGun(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println("高射炮射击");
    }
}
