import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Healer healer;

    @Before
    public void before(){
        healer = new Healer(80, 70, 120, HealingToolType.COFFEE);
    }

    @Test
    public void canGetHealingToolType(){
        assertEquals(HealingToolType.COFFEE, healer.getHealingToolType());
    }

    @Test
    public void canGetHealingToolTypeDefence(){
        assertEquals(2, healer.getHealingToolType().getHealingPower());
    }

    @Test
    public void canChangeHealingToolType(){
        healer.changeHealingToolType(HealingToolType.HERBS);
        assertEquals(HealingToolType.HERBS, healer.getHealingToolType());
    }
}
