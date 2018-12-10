package cards.basic;

import java.util.ArrayList;


public class Hand {

    ArrayList<Card> myCards;
    int myPoints;

    public Hand() {
        myCards = new ArrayList<Card>();
        myPoints = 0;
    }

    void addCard(Card card) {
        myCards.add(card);
        calcPoints();
    }

    void calcPoints() {
        myPoints = 0;
        int handSize = myCards.size();
        for (int i = 0; i < handSize; i++) {
            myPoints += myCards.get(i).getPoints();
        }
    }

    Boolean removeCard(Card card) {
        boolean isSuccessful = myCards.remove(card);
        calcPoints();
        return isSuccessful;
    }

    public Boolean hasCard(Card card) {
        return myCards.contains(card);
    }

    public ArrayList<Card> getMyCards() {
        return myCards;
    }

    int getPoints() {
        return myPoints;
    }

    public void showHand() {
        int handSize = myCards.size();
        for (int i = 0; i < handSize; i++) {
            System.out.println(myCards.get(i).getCardString() + "  ");
        }
    }
}
