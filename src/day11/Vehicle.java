package day11;

public class Vehicle {
    public static void main(String[] args) {
        AutoMachine auto = new AutoMachine(123,10);
        auto.move();
        auto.speedUp(50);
        System.out.println(auto.getSpeed());
        auto.speedDown(30);
        System.out.println(auto.getSpeed());
        System.out.println("逮虾户！");
    }
}
class AutoMachine
{
    private int speed;
    private int size;

    public AutoMachine() {
    }

    public AutoMachine(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void move()
    {
        System.out.println("燃起来了！");
    }
    public void speedUp(int addSpeed)
    {
       this.setSpeed( this.getSpeed()+addSpeed);
    }
    public void speedDown(int subSpeed)
    {
        this.setSpeed(this.getSpeed()-subSpeed);
    }
}
