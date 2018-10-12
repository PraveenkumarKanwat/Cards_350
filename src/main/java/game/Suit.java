package game;

public enum Suit {
    HEARTS(1,"♡"), DIAMONDS(2,"♢"), SPADES(3,"♠"), CLUBS(4,"♣");

    private int suitValue;
    private String suitSymbol;

    Suit(int suitValue, String suitSymbol) {
        this.suitValue = suitValue;
        this.suitSymbol = suitSymbol;
    }


    //getters

    public int getSuitValue() {
        return suitValue;
    }

    public String getSymbol() {
        return suitSymbol;
    }
}
