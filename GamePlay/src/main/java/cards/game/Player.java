package cards.game;

import java.util.Scanner;

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

    public Card playCard() {
        Card card;
        while (true) {
            System.out.print("You have = " + hand.showHand() + "Enter your Card : ");
            String input = new Scanner(System.in).nextLine();
            try {
                card = Card.findCardByString(input);
                if (card != null && hand.hasCard(card)) {
                    break;
                }
            } catch (Exception e){
                System.out.println(e);
            }

            System.out.print("Please enter a valid card. ");
        }
        System.out.println("Player " + this.name + " played " + card.getCardString());
        hand.removeCard(card);
        return card;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
