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

public class Cards {
    public enum Suit{
        HEARTS(1), DIAMONDS(2), SPADES(3), CLUBS(4);
        private int suitValue;
        Suit(int suitValue){
            this.suitValue = suitValue;
        }
        public int getSuitValue(){
            return suitValue;
        }
    }

    public enum Rank {

        THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);

        private int rankValue;
        Rank(int rankValue){
            this.rankValue = rankValue;
        }
        public int getRankValue(){
            return rankValue;
        }
    }


    private Suit suit;
    private Rank rank;
    private int points;

    public Cards(Suit suit, Rank rank) {
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
