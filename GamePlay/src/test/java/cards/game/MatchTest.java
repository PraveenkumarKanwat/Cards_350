package cards.game;

import java.util.ArrayList;

import cards.basic.Hand;

public class MatchTest {

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();

        players.add(new Player(1, "Praveen", new Hand()));
        players.add(new Player(2, "GV", new Hand()));
        players.add(new Player(3, "Sai", new Hand()));
        players.add(new Player(4, "Shetty", new Hand()));
        players.add(new Player(5, "Bole", new Hand()));
        players.add(new Player(6, "Appu", new Hand()));
        Match match = new Match(players);
    }
}
