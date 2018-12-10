package cards.game;

import java.util.ArrayList;
import java.util.Scanner;

public class Bidding {

    final static int maxBiddingValue = 350;
    final static int minBiddingValue = 250;
    static int currentBiddingValue;
    ArrayList<Player> inBiddingPlayers;
    int winnerID;

    public Bidding(ArrayList<Player> players) {
        this.inBiddingPlayers = players;
        currentBiddingValue = minBiddingValue - 10;
    }

    public static int getCurrentBiddingValue() {
        return currentBiddingValue;
    }

    public int getWinnerID() {
        return winnerID;
    }

    public int doBidding(Player player) {
        if (currentBiddingValue == maxBiddingValue) {
            return 0;
        }
        while (true) {
            System.out.print("Player: " + player.name + " Enter your Bid {'P': Pass, " + displayBiddingOptions()
                             + ": Bid} : ");
            String input = new Scanner(System.in).nextLine();
            try {
                if (input.charAt(0) == 'P') {
                    System.out.println("Player: " + player.name + " has Passed");
                    return 1;
                } else if (input.charAt(0) == 'B') {
                    if (Integer.valueOf(input.split(" ")[1]) % 10 == 0
                        && Integer.valueOf(input.split(" ")[1]) > currentBiddingValue
                        && Integer.valueOf(input.split(" ")[1]) <= maxBiddingValue) {

                        currentBiddingValue = Integer.valueOf(input.split(" ")[1]);
                        System.out.println("Player: " + player.name + " has New Bid Set to " + currentBiddingValue);
                        return 2;
                    }
                }
            } catch (Exception e) {
                System.out.print("Enter legal operation [ERROR] " + e);
            }
            System.out.print("Invalid! Please try again. ");
        }
    }

    public String displayBiddingOptions() {
        String options = "";
        for (int i = currentBiddingValue + 10; i <= maxBiddingValue; i = i + 10) {
            options += "'B " + String.valueOf(i) + "', ";
        }
        return options;
    }

    public int getHighestBidderPosition() {
        ArrayList<Player> removed = new ArrayList<Player>();
        winnerID = -1;
        while (true) {
            for (Player player : inBiddingPlayers) {
                if (inBiddingPlayers.size() == 1) {
                    return inBiddingPlayers.get(0).id;
                } else if (winnerID == player.id) {
                    return player.id;
                }
                if (winnerID == -1) {
                    winnerID = player.id;
                }
                int answer = doBidding(player);
                if (answer == 0) {
                    return winnerID;
                } else if (answer == 1) {
                    removed.add(player);
                } else if (answer == 2) {
                    winnerID = player.id;
                }
            }
            for (Player player : removed) {
                inBiddingPlayers.remove(player);
            }
            removed = new ArrayList<Player>();

        }
    }

}
