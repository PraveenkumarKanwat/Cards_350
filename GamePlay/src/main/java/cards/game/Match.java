package cards.game;

import java.util.ArrayList;

import cards.basic.Dealer;

public class Match {

    ArrayList<Round> rounds;
    ArrayList<Player> players;
    Trump trump;
    Dealer dealer;

    public Match(ArrayList<Round> rounds, ArrayList<Player> players, Trump trump, Dealer dealer) {
        rounds = new ArrayList<Round>();
        players = new ArrayList<Player>();
        trump = new Trump();
        dealer = new Dealer();
        this.rounds = rounds;
        this.players = players;
        this.trump = trump;
        this.dealer = dealer;
    }

    public void startTheGame(){
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


    }

    public int getChasingTeamPoint(){
        return 0;
    }

}
