package cards.basic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card {

    private Suit suit;
    private Rank rank;
    private int points;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        points = allocatePoints();
    }

    public String getCardString() {
        return this.getRank().getRankSymbol() + this.getSuit().getSymbol();
    }

    public String getCardFullString(){
        return this.getRank().name() + " " + this.getSuit().name();
    }
    public boolean isEqualTo(Card card) {
        if (this.suit == card.suit && this.rank == card.rank) {
            return true;
        }
        return false;
    }

    public static boolean areEqual(Card card1, Card card2) {
        if (card1.suit == card2.suit && card1.rank == card2.rank) {
            return true;
        }
        return false;
    }

    public int allocatePoints() {
        if (this.rank == Rank.ACE) {
            return 25;
        } else if (this.rank == Rank.KING) {
            return 20;
        } else if (this.rank == Rank.QUEEN || this.rank == Rank.JACK) {
            return 15;
        } else if (this.rank == Rank.THREE && this.suit == Suit.SPADES) {
            return 50;
        } else {
            return 0;
        }
    }

    public static Card findCardByString(String string) {
        string = string.trim();
        Rank cardRank = Rank.getRankBySymbol(string.substring(0, string.length() - 1));
        Suit cardSuit = Suit.getSuitByString(string.substring(string.length() - 1));
        if (cardRank != null && cardSuit != null) {
            return new Card(cardSuit, cardRank);
        } else {
            return null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        Card card = (Card) obj;
        return (this.getSuit() == card.getSuit()) && (this.getRank() == card.getRank());
    }
}

