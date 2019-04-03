package cards.game;

import cards.basic.Suit;

public class TrumpTest {

    public static void main(String[] args) {
        Trump trump = new Trump(Suit.CLUBS);
        System.out.println(trump.getTrump());
        System.out.println(trump.isTrumpOpen());
        System.out.println(Trump.isTrumpOpen());
        trump.openTrump();
        System.out.println(trump.isTrumpOpen());
        System.out.println(Trump.isTrumpOpen());
    }
}
