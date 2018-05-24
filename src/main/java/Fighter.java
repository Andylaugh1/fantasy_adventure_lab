public class Fighter extends Player {

    private WeaponType weaponType;

    public Fighter(int health, int money, int confidence, WeaponType weaponType){
        super(health, money, confidence);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return this.weaponType;
    }


}
