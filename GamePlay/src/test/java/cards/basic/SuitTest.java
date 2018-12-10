package cards.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuitTest {

    @Test
    public void getSuitByStringTest() {
        assertEquals(Suit.getSuitByString("S"), Suit.SPADES);
        assertEquals(Suit.getSuitByString("s"), Suit.SPADES);
        assertEquals(Suit.getSuitByString("D"), Suit.DIAMONDS);
        assertEquals(Suit.getSuitByString("d"), Suit.DIAMONDS);
        assertEquals(Suit.getSuitByString("H"), Suit.HEARTS);
        assertEquals(Suit.getSuitByString("h"), Suit.HEARTS);
        assertEquals(Suit.getSuitByString("C"), Suit.CLUBS);
        assertEquals(Suit.getSuitByString("c"), Suit.CLUBS);
    }

    @Test
    public void getSuitByValueTest() {
        assertEquals(Suit.getSuitByValue(3), Suit.SPADES);
        assertEquals(Suit.getSuitByValue(2), Suit.DIAMONDS);
        assertEquals(Suit.getSuitByValue(1), Suit.HEARTS);
        assertEquals(Suit.getSuitByValue(4), Suit.CLUBS);
    }

    @Test
    public void getSuitValueTest() {
        assertEquals(3, Suit.SPADES.getSuitValue());
        assertEquals(2, Suit.DIAMONDS.getSuitValue());
        assertEquals(1, Suit.HEARTS.getSuitValue());
        assertEquals(4, Suit.CLUBS.getSuitValue());
    }
}
