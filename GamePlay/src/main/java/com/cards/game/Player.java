package com.cards.game;

import com.cards.basic.Hand;

public class Player {
    int id;
    String name;
    Hand hand;

    public Player() {
    }

    public Player(int id, String name, Hand hand) {
        this.id = id;
        this.name = name;
        this.hand = hand;
    }

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
