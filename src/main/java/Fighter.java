import Interfaces.IAttack;

public class Fighter extends Player implements IAttack {

    private WeaponType weaponType;

    public Fighter(int health, int money, int confidence, WeaponType weaponType){
        super(health, money, confidence);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return this.weaponType;
    }


    public void changeWeapon(WeaponType newWeapon) {
        this.weaponType = newWeapon;
    }

    public void attack(Player opponent){
        int damage = getWeaponType().getDamage();
        opponent.changeHealth(-damage);
    }

}
