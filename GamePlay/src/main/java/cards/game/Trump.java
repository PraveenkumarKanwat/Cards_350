package cards.game;

import java.util.Scanner;

import cards.basic.Suit;

public class Trump {

    static Suit trumpSuit;
    static boolean isTrumpOpen;

    public Trump() {
        isTrumpOpen = false;
    }

    public Trump(Suit suit) {
        trumpSuit = suit;
        isTrumpOpen = false;
    }

    public static void setTrumpSuit(Suit trumpSuit) {
        Trump.trumpSuit = trumpSuit;
    }

    public static Suit getTrump() {
        return trumpSuit;
    }

    public static void setTrump() {
        while (true) {
            System.out.print("Enter Your Suit {D,C,H,S}: ");
            String input = new Scanner(System.in).next();
            Suit suit = Suit.getSuitByString(input);
            if (suit != null) {
                setTrumpSuit(suit);
                break;
            } else {
                System.out.print("Invalid Input Please try again. ");
            }
        }
        System.out.println("You have set trump to : " + getTrump());
    }

    public static boolean isTrumpOpen() {
        return isTrumpOpen;
    }

    public void openTrump() {
        System.out.println("The Trump is : " + getTrump());
        isTrumpOpen = true;
    }
}
