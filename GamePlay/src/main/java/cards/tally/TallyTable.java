package cards.tally;

import java.util.ArrayList;

import cards.game.Player;

public class TallyTable {

    ArrayList<Player> players;
    ArrayList<int[]> points;
    int[] totalPoints;
    static int noOfLastResults = 10;
    static int noOfPlayers = 6;

    public TallyTable(ArrayList<Player> players) {
        this.players = players;
        this.points = new ArrayList<int[]>();
        this.totalPoints = new int[6];
    }


    public void displayTable() {
        System.out.println("The scores so far");
        for (int i = 0; i < Math.min(points.size(), noOfLastResults); i++) {
            for (int j = 0; j < noOfPlayers; j++) {
                System.out.println(players.get(j).getName());
            }
        }
    }
}
