package cards.basic;

public enum Suit {
    HEARTS(1, "♡", "H"), DIAMONDS(2, "♢", "D"), SPADES(3, "♠", "S"), CLUBS(4, "♣", "C");

    private int suitValue;
    private String suitSymbol;
    private String suitString;

    Suit(int suitValue, String suitSymbol, String suitString) {
        this.suitValue = suitValue;
        this.suitSymbol = suitSymbol;
        this.suitString = suitString;
    }

    //getters

    public int getSuitValue() {
        return suitValue;
    }

    public String getSymbol() {
        return suitSymbol;
    }

    public String getSuitString() {
        return suitString;
    }

    public static Suit getSuitByString(String string) {
        for (Suit s : Suit.values()) {
            if (s.suitString.equals(string.toUpperCase())) {
                return s;
            }
        }
        return null;
    }

    public static Suit getSuitByValue(int value) {
        for (Suit s : Suit.values()) {
            if (s.suitValue == value) {
                return s;
            }
        }
        return null;
    }
}
