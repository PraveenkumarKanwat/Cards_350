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
package game;

public class Card {

    private Suit suit;
    private Rank rank;
    private int points;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
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

    //setters
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
