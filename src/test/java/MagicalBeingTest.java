import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MagicalBeingTest {

    MagicalBeing magicalBeing;

    @Before
    public void before(){
        magicalBeing = new MagicalBeing( 40, 60, 70, SpellType.FRIGHT);
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
}

