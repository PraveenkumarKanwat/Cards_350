/* code is complete
 * 
 * 
 * 
 * 
 * 
 *
 * 
 * 
 */
package com.game.Cards350;

public class Card {
	public enum Suit{
		Hearts(1), Diamonds(2), Spades(3), Clubs(4);
		
		  private int suitValue;

		  Suit(int suitValue){
		    this.suitValue = suitValue;
		  }

		  public int getSuitValue(){
		    return suitValue;
		  }
;
	}
	
	public enum Rank {
		Three(3), Four(4), five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(13), Ace(14);
		  private int rankValue;

		  Rank(int rankValue){
		    this.rankValue = rankValue;
		  }

		  public int getRankValue(){
		    return rankValue;
		  }
;
	}

	
	private Suit suit;
	private Rank rank;
	private int points;
	
	public Card(Suit suit, Rank rank) {
		setSuit(suit);
		setRank(rank);
	}
	
	//setters
	public void setRank(Rank rank) {
		this.rank = rank;	
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	//getters
	public Suit getSuit() {
		return suit;
	}
	
	public Rank getRank() {
		return rank;
	}

	public int getPoints() {
		return points;
	}


}
