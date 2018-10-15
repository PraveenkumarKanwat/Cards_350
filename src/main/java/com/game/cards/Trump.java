package com.game.cards;

public class Trump {

    int suitIndex;
    boolean trumpOpen = false;

    public Trump(int suitIndex, boolean trumpOpen) {
        this.suitIndex = suitIndex;
        this.trumpOpen = trumpOpen;
    }

    public int getSuitIndex() {
        return suitIndex;
    }

    public boolean isTrumpOpen() {
        return trumpOpen;
    }

    public void setSuitIndex(int suitIndex) {
        this.suitIndex = suitIndex;
    }

    public void setTrumpOpen(boolean trumpOpen) {
        this.trumpOpen = trumpOpen;
    }
}