package game;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<>();

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
            System.out.print(deck.get(i).getRank().getRankSymbol());
            System.out.println(deck.get(i).getSuit().getSymbol());
        }
    }


    public Card getCard(int index)
    {
        return deck.get(index);
    }


    public Card popTopCard(){
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }
}
