/* code is complete as of now
 * I tried making a set of 8 cards as a hand which every player will hold
 * the code assigns literally random values when the hand object is created
 * suggestions pls
 * 
 * 
 *
 * 
 * 
 */
package com.game.cards;

import java.util.ArrayList;
import com.game.cards.Card.Rank;
import com.game.cards.Card.Suit;

public class Hand {
	
	private Suit s;
	private Rank r;
	private ArrayList<Card> hand = new ArrayList<>();
	
	public Hand() {
		//empty hand of 8 cards
		int i;
		for(i=0; i<8; i++) {
			hand.add(new Card(s,r));
		}
	}
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public Card getCard(int index) {
		return hand.get(index);
	}
	
	public void setCard(Card card, int index) {
		hand.set(index, card);
	}
	public void arrangeHand() {
		
        int n = 8;
        
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (hand.get(j).getSuit().getSuitValue() < hand.get(j+1).getSuit().getSuitValue()){
                    Card temp = hand.get(j);
                    hand.set(j, hand.get(j+1));
                    hand.set(j+1, temp);
                }
        
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (hand.get(j).getRank().getRankValue() < hand.get(j+1).getRank().getRankValue() && hand.get(j).getSuit().getSuitValue() == hand.get(j+1).getSuit().getSuitValue()){
                    Card temp = hand.get(j);
                    hand.set(j, hand.get(j+1));
                    hand.set(j+1, temp);
                }
		//Collections.sort(hand, hand.get(i).getRank().getRankValue());
	}
	
	public void printHand(Hand hand) {
		int i = 0;
		for(i=0; i<8; i++) {
			if (i!=0) {
				if (hand.getCard(i-1).getSuit().getSuitValue() != hand.getCard(i).getSuit().getSuitValue()) {
					System.out.print("   ");
				}
			}

			hand.getCard(i).printCard(hand.getCard(i));
		}
		
	}
}