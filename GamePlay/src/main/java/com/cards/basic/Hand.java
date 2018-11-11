package com.cards.basic;

import java.util.ArrayList;


public class Hand {
    ArrayList<Card> myCard;
    int myPoints;
    public Hand() {
        myCard = new ArrayList<Card>();
        myPoints = 0;
    }

    void addCard(Card card){
        myCard.add(card);
        calcPoints();
    }

    void calcPoints(){
        myPoints = 0;
        int handSize = myCard.size();
        for(int i =0; i < handSize; i++){
            myPoints += myCard.get(i).getPoints();
        }
    }

    Boolean removeCard(Card card){
        boolean isSuccessful = myCard.remove(card);
        calcPoints();
        return isSuccessful;
    }

    int getPoints(){
        return myPoints;
    }

    public void showHand(){
        int handSize = myCard.size();
        for(int i =0; i < handSize; i++){
            System.out.println(myCard.get(i).getCardString() + "  ");
        }
    }
}
