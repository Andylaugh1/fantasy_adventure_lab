import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MagicalBeingTest {

    MagicalBeing magicalBeing;
    Fighter fighter;

    @Before
    public void before(){
        magicalBeing = new MagicalBeing( 40, 60, 70, SpellType.FRIGHT, MagicalCreatureType.UNICORN);
        fighter = new Fighter(100, 500, 20, WeaponType.SWORD);
    }

    @Test
    public void canGetSpellType(){
        assertEquals(SpellType.FRIGHT, magicalBeing.getSpellType());
    }

    @Test
    public void canGetDamage(){
        assertEquals(5,magicalBeing.getSpellType().getDamage());
    }

    @Test
    public void canGetConfidenceLoss(){
        assertEquals(10,magicalBeing.getSpellType().getConfidenceLoss());
    }

    @Test
    public void canGetMagicalCreatureType(){
        assertEquals(MagicalCreatureType.UNICORN, magicalBeing.getMagicalCreatureType());
    }

    @Test
    public void canGetMagicalCreatureDefence(){
        assertEquals(4, magicalBeing.getMagicalCreatureType().getDefence());
    }

    @Test
    public void canChangeSpellType(){
        magicalBeing.changeSpellType(SpellType.FREEZE);
        assertEquals(SpellType.FREEZE, magicalBeing.getSpellType());
        assertEquals(20, magicalBeing.getSpellType().getDamage());
        assertEquals(0, magicalBeing.getSpellType().getConfidenceLoss());
    }

    @Test
    public void canChangeMagicalCreatureType(){
        magicalBeing.changeMagicalCreatureType(MagicalCreatureType.CENTAUR);
        assertEquals(MagicalCreatureType.CENTAUR, magicalBeing.getMagicalCreatureType());
    }

    @Test
    public void canAttackOpponent(){
        magicalBeing.attack(fighter);
        assertEquals(95, fighter.getHealth());
        assertEquals(10, fighter.getConfidence());
    }
}

