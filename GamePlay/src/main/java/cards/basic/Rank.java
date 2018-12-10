package cards.basic;

public enum Rank {

    THREE(3, "3"), FOUR(4, "4"), FIVE(5, "5"), SIX(6, "6"), SEVEN(7, "7"), EIGHT(8, "8"), NINE(9, "9"), TEN(10,
                                                                                                            "10"), JACK(
            11, "J"), QUEEN(12, "Q"), KING(13, "K"), ACE(14, "A");

    private int rankValue;
    private String rankSymbol;

    /**
     * @param rankValue
     * @param rankSymbol
     */
    Rank(int rankValue, String rankSymbol) {
        this.rankValue = rankValue;
        this.rankSymbol = rankSymbol;
    }

    /**
     * @return
     */
    public int getRankValue() {
        return rankValue;
    }

    public String getRankSymbol() {
        return rankSymbol;
    }

    /**
     * @param symbol of the card in caps
     * @return the rank enum of the card
     */
    public static Rank getRankBySymbol(String symbol) {
        for (Rank r : Rank.values()) {
            if (r.rankSymbol.equals(symbol.toUpperCase())) {
                return r;
            }
        }
        return null;
    }

    /**
     * @param value
     * @return the
     */
    public static Rank getRankByValue(int value) {
        for (Rank r : Rank.values()) {
            if (r.rankValue == value) {
                return r;
            }
        }
        return null;
    }
}
