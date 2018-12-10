package cards.game;

import cards.basic.Card;
import cards.basic.Hand;
import cards.basic.Suit;

public class Player {

    int id;
    String name;
    Hand hand;

    public Player() {
    }

    public Player(int id, String name, Hand hand) {
        this.id = id;
        this.name = name;
        this.hand = hand;
    }

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public Boolean hasSuit(Suit suit) {
        for (Card card : hand.getMyCards()) {
            if (card.getSuit() == suit) {
                return true;
            }
        }
        return false;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
