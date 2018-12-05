package cards.game;

import cards.basic.Card;
import cards.basic.Rank;
import cards.basic.Suit;

public class BiddingTest {

    public static void main(String[] args) {
//        Bidding bidding = new Bidding();
//        bidding.doBidding();
//        System.out.println(Rank.getRankBySymbol("o"));
        String input = "JS";
        Rank r = Rank.getRankBySymbol(input.substring(0,input.length() - 1));
        Suit s = Suit.getSuitByString(input.substring(input.length() - 1));
        Card card = new Card(s,r);
    }
}
