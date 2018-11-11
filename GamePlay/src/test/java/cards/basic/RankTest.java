package cards.basic;

import com.cards.basic.Rank;
import com.cards.basic.Suit;

public class RankTest {

    public static void main(String[] args) {
        System.out.println("rank of 7 is " + Rank.getRankBySymbol("j"));
        System.out.println("suit of spade is " + Suit.getSuitByString("s"));
    }
}
