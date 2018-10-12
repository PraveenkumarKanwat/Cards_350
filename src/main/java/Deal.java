/* Code is incomplete
 * 
 * 
 * Literally fucked up here
 * I am trying to make 6 Hand objects
 * I want to distribute like first 8 cards to 1st Hand object and next 8 cards to 2nd and so on
 * Help needed
 * 
 * 
 *
 * 
 * 
 */
package com.game.Cards350;

import java.util.ArrayList;

public class Deal {

	private int i,j,k=0;
	private Card card;
	private ArrayList<Hand> handlist = new ArrayList<>();

	private Hand hand = new Hand();

	
	public Deal(Deck deck) {
			for(i=0; i<6; i++) {
					handlist.add(hand);
					hand = handlist.get(i);
					System.out.println("===========================================");			
					System.out.println("hand number " + i);

							for(j=0; j<8; j++) {
								card = deck.getCard(k);
								hand.addCard(card, j);
									k++;
									
									System.out.print(card.getSuit());
									System.out.println(card.getRank());
				}
			}
	}
}
