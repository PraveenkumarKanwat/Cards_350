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
package com.game.cards;

import java.util.ArrayList;

public class Deal {

	private Card card;
	
	public ArrayList<Hand> handlist = new ArrayList<>();

	public Deal(Deck deck) {
			int i,j,k=0;
			
				//empty hands of 6 players
				for(i=0; i<6; i++) {
					handlist.add(new Hand());
				}
			
			for(i=0; i<6; i++) {
				//System.out.println();
				//handlist.set(i, hand);
				//System.out.println("===========================================");			
				//System.out.println("hand number " + i);

				for(j=0; j<8; j++) {
					card = deck.getCard(k);
					handlist.get(i).setCard(card, j);
					k++;	
						//card.printCard(card);
						//System.out.print(" ");
				}
			}
		}
}