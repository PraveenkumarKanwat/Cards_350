package com.cards.game;

import java.util.ArrayList;

import com.cards.basic.Dealer;

public class Match {

    ArrayList<Round> rounds;
    ArrayList<Player> players;
    Trump trump;
    Dealer dealer;

    public Match(ArrayList<Round> rounds, ArrayList<Player> players, Trump trump, Dealer dealer) {
        rounds = new ArrayList<Round>();
        players = new ArrayList<Player>();
        trump = new Trump();
        dealer = new Dealer();
        this.rounds = rounds;
        this.players = players;
        this.trump = trump;
        this.dealer = dealer;
    }

    public void startTheGame(){
        /**
         * this should contain collecting players
         * then shuffle deck and distribute {check for 0 point player and then reshuffle}
         * then bidding {highest bidder and queue}
         * set trump
         * play rounds
         * open trump
         * play rounds
         * declare results and calculate points
         */
    }

    public int getChasingTeamPoint(){
        return 0;
    }

}
