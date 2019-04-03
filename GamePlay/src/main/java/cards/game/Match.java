package cards.game;

import java.util.ArrayList;
import java.util.Scanner;

import cards.basic.Card;
import cards.basic.Dealer;
import cards.basic.Hand;
import cards.basic.Rank;
import cards.basic.Suit;

public class Match {

    ArrayList<Round> rounds;
    ArrayList<Player> players;
    Trump trump;
    Dealer dealer;
    final int noOfRounds = 8;

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
        int winnerIndex = 0;
        int chaserPoints = 0;

        for (int i = 0; i < noOfRounds; i++) {
            Round round = new Round(trump);
            for (int j = 0; j < 6; j++) {
                Card card = players.get((winnerIndex + j) % 6).playCard();
                System.out.println(card.getCardString());
                round.addCardToRound(card);
            }
            winnerIndex = round.whoIsTheWinner();
            chaserPoints += round.calculateRoundPoints();
            /**
             * here to write rounds to be conducted
             */
        }

        if (chaserPoints >= bidding.getCurrentBiddingValue()){
            System.out.println("Winners are chasers");
        } else {
            System.out.println("Winner are defenders");
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
