package com.cards.game;

import java.util.Scanner;

import com.cards.basic.Card;

public class Partner {
    Card card1,card2;
    int biddersID;
    int partnerID1, partnerID2;

    public Partner() {
    }

    public Partner(Card card1, Card card2) {
        this.card1 = card1;
        this.card2 = card2;
    }

    public void callPartner(){
        this.card1 = callPartnerCard(1);
        this.card2 = callPartnerCard(2);
    }

    public Card callPartnerCard(int index){
        Card card;
        while (true){
            System.out.print("Enter the Cards of your Partner " + index + " {AS ,AC} : ");
            String input = new Scanner(System.in).nextLine();
            card = Card.findCardByString(input);
            if (card != null){
                break;
            }
            System.out.print("Please enter a valid card. ");
        }
        System.out.println("Partner no " + index + " is " + card.getCardString());
        return card;
    }
}
