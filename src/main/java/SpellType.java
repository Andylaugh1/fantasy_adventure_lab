public enum SpellType {

    FRIGHT(5, 10),
    FREEZE(20,0);


    private final int damage;
    private final int confidenceLoss;

    SpellType(int damage, int confidenceLoss){
        this.damage = damage;
        this.confidenceLoss = confidenceLoss;
    }

    public int getDamage(){
        return this.damage;
    }

    public int getConfidenceLoss(){
        return this.confidenceLoss;
    }



}
