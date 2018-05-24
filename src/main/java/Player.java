public abstract class Player {
    private int health;
    private int money;
    private int confidence;

    public Player(int health, int money, int confidence){
        this.health = health;
        this.money = money;
        this.confidence = confidence;
    }

    public int getHealth() {
        return this.health;
    }

    public int getMoney() {
        return this.money;
    }

    public int getConfidence() {
        return this.confidence;
    }

    public void changeConfidence(int confidence) {
        this.confidence += confidence;
    }

    public void changeMoney(int money) {
        this.money += money;
    }

    public void changeHealth(int health) {
        this.health += health;
    }
}
