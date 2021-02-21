package day17;


public class Test {
    public static void main(String[] args) {
        Army army = new Army(4);
        Weapon fighter = new Fighter("战斗机");
        Weapon tank = new Tank("坦克");
        Weapon wuZiFeiJi = new WuZiFeiJi("物资飞机");
        Weapon antiAircraftGun = new AntiAircraftGun("高射炮");
        try {
            army.addWeapon(fighter);
            army.addWeapon(tank);
            army.addWeapon(wuZiFeiJi);
            army.addWeapon(antiAircraftGun);
        } catch (AddWeaponException e) {
            System.out.println(e.getMessage());
        }
        army.moveAll();
        army.attackAll();
    }
}
