package day17;

public class Army {
    private final Weapon[] weapon;

    public Army(int count) {
        weapon = new Weapon[count];
    }

    public void addWeapon(Weapon weapon1) throws AddWeaponException {
        for ( int i = 0 ; i < weapon.length ; i++ ) {
            if (null == weapon[i]) {
                weapon[i] = weapon1;
                System.out.println(weapon1 + "添加成功");
                return;
            }
        }
        throw new AddWeaponException("添加武器失败");
    }

    public void attackAll() {
        for ( int i = 0 ; i < weapon.length ; i++ ) {
            if (weapon[i] instanceof Shootable) {
                Shootable shootable = (Shootable) weapon[i];
                shootable.shoot();
            }
        }
    }

    public void moveAll() {
        for ( int i = 0 ; i < weapon.length ; i++ ) {
            if (weapon[i] instanceof Moveable) {
                Moveable Moveable = (Moveable) weapon[i];
                Moveable.move();
            }
        }
    }
}
