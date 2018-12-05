package cards.basic;

import java.util.ArrayList;

public class Dealer {
    Deck deck;
    ArrayList<Hand> hands;
    static int noOfPlayers = 6;
    public Dealer(){
        deck = new Deck();
        hands = new ArrayList<Hand>();
        for(int i = 0; i < noOfPlayers; i++){
            Hand hand = new Hand();
            hands.add(hand);
        }
    }

    public void baatNa(){
        deck.shuffleDeck();
        int noOfCards = deck.getDeckSize();
        for(int i = 0; i < noOfCards; i++){
            hands.get(i % noOfPlayers).addCard(deck.popTopCard());
        }
    }

    public void showDistribution() {
        for (int i = 0; i < noOfPlayers; i++) {
            System.out.println("Hand of Player No " + (i+1) + " Total Points = " + hands.get(i).getPoints());
            hands.get(i).showHand();
            System.out.println("===========================================================================");
        }
    }
}
