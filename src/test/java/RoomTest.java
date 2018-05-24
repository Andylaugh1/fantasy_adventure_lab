import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class RoomTest {

    Room room;
    Player player1;
    Player player2;


    @Before
    public void before(){
        player1 = new Fighter(100, 500, 0, WeaponType.SWORD);
        player2 = new MagicalBeing(40, 60, 70, SpellType.FRIGHT, MagicalCreatureType.UNICORN);
        room = new Room(player1, player2, 50);
    }

    @Test
    public void canGetPlayer1(){
        assertEquals(0, room.getPlayer1().getConfidence());
    }

    @Test
    public void canGetPlayer2(){
        assertEquals(40, room.getPlayer2().getHealth());
    }

//    @Test
//    public void canGetPlayerAsMB(){
//        assertEquals(40, ( (MagicalBeing)   room.getPlayer2()   ).getMagicalCreatureType() );
//    }

    @Test
    public void canGetReward(){
        assertEquals(50, room.getReward());
    }

    @Test
    public void canGetCompletionStatus(){
        assertFalse(room.getCompletionStatus());
    }

    @Test
    public void canGetWinner(){
        assertEquals("Player 1 Wins!!!", room.getWinner());
    }

//    @Test
//    public void canGetWinner(){
//        assertEquals("Player 2 Wins!!!", room.getWinner());
//    }
}
