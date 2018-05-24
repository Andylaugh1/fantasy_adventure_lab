public enum MagicalCreatureType {

    DRAGON(3),
    OGRE(2),
    UNICORN(4),
    CENTAUR(2);

    private final int defence;

    MagicalCreatureType(int defence){
        this.defence = defence;
    }

    public int getDefence(){
        return this.defence;
    }
}
