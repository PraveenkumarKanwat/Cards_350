package cards.basic;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<Card>();

    public Deck() {
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                deck.add(new Card(s,r));
            }
        }
    }

    //shuffles the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    //shows the current deck situation
    public void showDeck() {
        int i=0;
        for(i=0; i < deck.size(); i++) {
            System.out.println(deck.get(i).getCardString());
        }
    }


    public Card getCard(int index)
    {
        return deck.get(index);
    }

    public int getDeckSize(){
        return deck.size();
    }

    public Card popTopCard(){
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }
}
