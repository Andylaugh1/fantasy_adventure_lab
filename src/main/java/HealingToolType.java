public enum HealingToolType {

    POTION(10),
    HERBS(15),
    MEDICINE(20),
    FOOD(5),
    COFFEE(2);

    private final int healingPower;

    HealingToolType(int healingPower){
        this.healingPower = healingPower;
    }

    public int getHealingPower(){
        return this.healingPower;
    }


}
