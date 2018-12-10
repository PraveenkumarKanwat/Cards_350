package cards.game;

import java.util.ArrayList;

import cards.basic.Dealer;
import cards.basic.Hand;

public class Match {

    ArrayList<Round> rounds;
    ArrayList<Player> players;
    Trump trump;
    Dealer dealer;

    public Match(ArrayList<Player> players) {
        rounds = new ArrayList<Round>();
        this.players = new ArrayList<Player>();
        trump = new Trump();
        dealer = new Dealer();
        this.players = players;
    }

    public void startTheGame() {
        /**
         * this should contain collection of players
         * then shuffle deck and distribute {check for 0 point player and then reshuffle}
         * then bidding {highest bidder and queue}
         * prompt the bidding winner to set trump and call partner cards
         * play rounds and keep an option to open the trump if the player has no base suit.
         * open trump and declare
         * play remaining rounds
         * declare results and calculate points
         */
        Dealer dealer = new Dealer();
        assignHandToPlayers(dealer.getHands());
        Bidding bidding = new Bidding(players);
        Trump trump = new Trump();
        trump.setTrump();
        Partner partner = new Partner(bidding.getHighestBidderPosition());
        partner.callPartner(players);
        for (int i = 0; i < 6; i++) {
            Round round = new Round();
            /**
             * here to write rounds to be conducted
             */
        }

    }

    public void addPlayers(Player player) {
        players.add(player);
    }

    public void assignHandToPlayers(ArrayList<Hand> hands) {
        for (int i = 0; i < 6; i++) {
            players.get(i).setHand(hands.get(i));
        }
    }

    public int getChasingTeamPoint() {
        return 0;
    }

}
