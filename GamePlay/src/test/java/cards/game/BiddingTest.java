package cards.game;

import java.util.ArrayList;

import cards.basic.Card;
import cards.basic.Hand;
import cards.basic.Rank;
import cards.basic.Suit;

public class BiddingTest {

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();

        players.add(new Player(1, "Praveen", new Hand()));
        players.add(new Player(2, "GV", new Hand()));
        players.add(new Player(3, "Sai", new Hand()));
        players.add(new Player(4, "Shetty", new Hand()));
        players.add(new Player(5, "Bole", new Hand()));
        players.add(new Player(6, "Appu", new Hand()));

        Bidding bidding = new Bidding(players);
        int hb = bidding.getHighestBidderPosition();
        System.out.println("HB = " + hb);

        //        String input = "JS";
//        Rank r = Rank.getRankBySymbol(input.substring(0,input.length() - 1));
//        Suit s = Suit.getSuitByString(input.substring(input.length() - 1));
//        Card card = new Card(s,r);
    }
}
