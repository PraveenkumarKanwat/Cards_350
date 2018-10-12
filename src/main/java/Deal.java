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

	private int i,j,k;
	private Hand hand;
	private Card card;
	private ArrayList<Hand> handlist;
	
	
	public Deal() {
		for(i=0; i<6; i++) {
			hand = handlist.get(i);
			for(j=0; j<8; j++) {
				card = deck.get(k);
				hand.get(j) = card;
			}
		}
	}
}
