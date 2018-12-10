package cards.basic;

import java.util.ArrayList;

public class Dealer {

    Deck deck;
    ArrayList<Hand> hands;
    final static int noOfPlayers = 6;

    public Dealer() {
        init();
        dealCards();
    }

    public void init() {
        deck = new Deck();
        hands = new ArrayList<Hand>();
        for (int i = 0; i < noOfPlayers; i++) {
            Hand hand = new Hand();
            hands.add(hand);
        }
    }

    public void dealCards() {
        deck.shuffleDeck();
        int noOfCards = deck.getDeckSize();
        for (int i = 0; i < noOfCards; i++) {
            hands.get(i % noOfPlayers).addCard(deck.popTopCard());
        }
    }

    public Boolean validShuffle() {
        for (Hand hand : hands) {
            if (hand.getPoints() == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Hand> getHands() {
        while (!validShuffle()) {
            init();
            dealCards();
        }
        return hands;
    }

    public void showDistribution() {
        for (int i = 0; i < noOfPlayers; i++) {
            System.out.println("Hand of Player No " + (i + 1) + " Total Points = " + hands.get(i).getPoints());
            hands.get(i).showHand();
            System.out.println("===========================================================================");
        }
    }
}
