public class Healer extends Player {

    private HealingToolType healingToolType;

    public Healer(int health, int money, int confidence, HealingToolType healingToolType){
        super(health, money, confidence);
        this.healingToolType = healingToolType;
    }

    public HealingToolType getHealingToolType(){
        return this.healingToolType;
    }

    public void changeHealingToolType(HealingToolType newHealingToolType) {
        this.healingToolType = newHealingToolType;
    }
}
