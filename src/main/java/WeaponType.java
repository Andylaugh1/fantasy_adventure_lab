public enum WeaponType {

    SWORD(15),
    AXE(20),
    WARHAMMER(30),
    CLUB(15),
    LANCE(10);

    private final int damage;

    WeaponType(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }

}
