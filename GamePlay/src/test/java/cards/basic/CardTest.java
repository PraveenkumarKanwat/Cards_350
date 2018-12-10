package cards.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CardTest {


    @Test
    public void findCardByStringTest() throws Exception {
//        assertEquals(Rank.getRankBySymbol("7"),Rank.SEVEN);
        assertEquals(Card.findCardByString("7s"), new Card(Suit.SPADES, Rank.SEVEN));
        assertEquals(Card.findCardByString("7S"), new Card(Suit.SPADES, Rank.SEVEN));
        assertEquals(Card.findCardByString("AD"), new Card(Suit.DIAMONDS, Rank.ACE));
        assertEquals(Card.findCardByString("ad"), new Card(Suit.DIAMONDS, Rank.ACE));
        assertNotEquals(Card.findCardByString("A D"), new Card(Suit.DIAMONDS, Rank.ACE));
        assertEquals(Card.findCardByString("10D"), new Card(Suit.DIAMONDS, Rank.TEN));

    }
}
