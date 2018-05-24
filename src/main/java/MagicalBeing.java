public class MagicalBeing extends Player {

    private SpellType spellType;

    public MagicalBeing(int health, int money, int confidence, SpellType spellType) {
        super(health, money, confidence);
        this.spellType = spellType;

    }

    public SpellType getSpellType() {
        return this.spellType;
    }
}
