public class MagicalBeing extends Player {

    private SpellType spellType;
    private MagicalCreatureType magicalCreatureType;

    public MagicalBeing(int health, int money, int confidence, SpellType spellType, MagicalCreatureType magicalCreatureType) {
        super(health, money, confidence);
        this.spellType = spellType;
        this.magicalCreatureType = magicalCreatureType;

    }

    public SpellType getSpellType() {
        return this.spellType;
    }

    public MagicalCreatureType getMagicalCreatureType() {
        return magicalCreatureType;
    }

    public void changeSpellType(SpellType newSpellType) {
        this.spellType = newSpellType;
    }

    public void changeMagicalCreatureType(MagicalCreatureType newMagicalCreatureType) {
        this.magicalCreatureType = newMagicalCreatureType;
    }

    public void attack(Player opponent){
        int damage = getSpellType().getDamage();
        int confidenceLoss = getSpellType().getConfidenceLoss();
        opponent.changeHealth(-damage);
        opponent.changeConfidence(-confidenceLoss);
    }
}
