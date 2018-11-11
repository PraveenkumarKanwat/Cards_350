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
package com.bugchod.cards;

import java.util.ArrayList;

import com.bugchod.cards.Card.Suit;
import com.bugchod.cards.Card.Rank;


public class Hand {
	
	private int i;
	private Suit s;
	private Rank r;
	private ArrayList<Card> hand = new ArrayList<>();
	
	public Hand() {
		//empty hand of 8 cards
		for(i=0; i<8; i++) {
			hand.add(new Card(s,r));
		}
	}
	
	public void addCard(Card card, int Index) {
		hand.add(card);
	}
}