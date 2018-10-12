package com.bugchod.cards;

import java.util.ArrayList;
import java.util.Collections;

import com.bugchod.cards.Card.*;

public class Deck {

	private ArrayList<Card> deck = new ArrayList();
	
	public Deck() {
		  for (Card.Suit s : Card.Suit.values()) {
		    for (Card.Rank r : Card.Rank.values()) {
		      deck.add(new Card(s,r));
		    }
		  }
		}
	//shuffles the deck
	public void Shuffle() {
		Collections.shuffle(deck);
	}
	
	//shows the current deck situation
	public void showDeck() {
		int i=0;
			for(i=0; i<=47; i++) {
				System.out.print(deck.get(i).getRank() + " of ");
				System.out.println(deck.get(i).getSuit());
			}
	}
	
	
}