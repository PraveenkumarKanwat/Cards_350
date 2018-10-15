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
package com.game.cards;

public class Card {
	public enum Suit{
		Hearts(3), Diamonds(1), Spades(4), Clubs(2);
		
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

	public void printCard(Card card) {
		if(card.rank.getRankValue() == 3) {
			System.out.print("3");
		}
		else if(card.rank.getRankValue() == 4) {
			System.out.print("4");
		}
		else if(card.rank.getRankValue() == 5) {
			System.out.print("5");
		}
		else if(card.rank.getRankValue() == 6) {
			System.out.print("6");
		}
		else if(card.rank.getRankValue() == 7) {
			System.out.print("7");
		}
		else if(card.rank.getRankValue() == 8) {
			System.out.print("8");
		}
		else if(card.rank.getRankValue() == 9) {
			System.out.print("9");
		}
		else if(card.rank.getRankValue() == 10) {
			System.out.print("10");
		}
		else if(card.rank.getRankValue() == 11) {
			System.out.print("J");
		}
		else if(card.rank.getRankValue() == 12) {
			System.out.print("Q");
		}
		else if(card.rank.getRankValue() == 13) {
			System.out.print("K");
		}
		else if(card.rank.getRankValue() == 14) {
			System.out.print("A");
		}
		
		if(card.suit.getSuitValue() == 2) {
			System.out.print("♡");
		}
		else if(card.suit.getSuitValue() == 1) {
			System.out.print("♢");
		}
		else if(card.suit.getSuitValue() == 4) {
			System.out.print("♠");
		}
		else if(card.suit.getSuitValue() == 3) {
			System.out.print("♣");
		}
	}
}