package com.game.players;

import com.game.cards.Card;
import com.game.cards.Card.Suit;
import com.game.cards.Hand;

public class CardPool {

	public Hand cardPoolHand = new Hand();
	public Suit baseSuit;
	private int nextIndex = 0;
	//this integer value is set to the player Index who is going to start the pool after every round.
	//so whenever we perform the operation of "findHighest" we will get the card index which will be equal to the player index
	//ez to find who is the winner of current cardpool
	public CardPool() {
		
	}
	
	public Card getCardfromPool(int index) {
		return cardPoolHand.getCard(index);
	}
	
	public void setCardofPool(Player player, Card card) {
		cardPoolHand.setCard(card, getNextIndex());
		setNextIndex(getNextIndex()+1);
	}
	public Suit getBaseSuit() {
		return baseSuit;
	}
	
	public void setBaseSuit(Suit suit) {
		this.baseSuit = suit;
	}

	public int getNextIndex() {
		return nextIndex;
	}

	public void setNextIndex(int nextIndex) {
		this.nextIndex = nextIndex;
	}
	
	public void findHighest() {
		//logic, find card with highest weight, including suit, rank and trump 
	}
	
	public int cardPoolPoints() {
		//logic, calculate total number of points, ez to implement.
		int points=0;
		return points;
	}
	
}
