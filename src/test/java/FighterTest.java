import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter fighter;

    @Before
    public void before(){
        fighter = new Fighter(100, 500, 0, WeaponType.SWORD);
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, fighter.getHealth());
    }

    @Test
    public void canGetMoney(){
        assertEquals(500, fighter.getMoney());
    }

    @Test
    public void canGetConfidence(){
        assertEquals(0, fighter.getConfidence());
    }

    @Test
    public void canGetWeaponType(){
        assertEquals(WeaponType.SWORD, fighter.getWeaponType());
    }

    @Test
    public void canGetWeaponDamage(){
        assertEquals(15, fighter.getWeaponType().getDamage());
    }

    @Test
    public void canIncreaseConfidence(){
        fighter.changeConfidence(10);
        assertEquals(10, fighter.getConfidence());

    }
    @Test
    public void canDecreaseConfidence(){
        fighter.changeConfidence(-10);
        assertEquals(-10, fighter.getConfidence());

    }
    @Test
    public void canIncreaseMoney(){
        fighter.changeMoney(10);
        assertEquals(510, fighter.getMoney());
    }

    @Test
    public void canDecreaseMoney(){
        fighter.changeMoney(-10);
        assertEquals(490, fighter.getMoney());
    }

    @Test
    public void canIncreaseHealth(){
        fighter.changeHealth(20);
        assertEquals(120, fighter.getHealth());
    }

    @Test
    public void canDecreaseHealth(){
        fighter.changeHealth(-20);
        assertEquals(80, fighter.getHealth());
    }



}
