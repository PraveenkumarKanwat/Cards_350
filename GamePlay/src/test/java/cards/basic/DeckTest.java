package cards.basic;

import java.util.Scanner;

public class DeckTest {

    public static void main(String[] args) {
        System.out.println("Enter card :");
        String input = new Scanner(System.in).nextLine();
//        Rank cardRank = Rank.getRankBySymbol(input.substring(0, input.length() - 1));
        System.out.println("rank " + input.substring(0, input.length() - 1));
        Rank cardRank = Rank.getRankBySymbol("7");
        System.out.println(cardRank);
//        Suit cardSuit = Suit.getSuitByString(input.substring(input.length() - 1));
        System.out.println("suit " + input.substring(input.length() - 1));
        Suit cardSuit = Suit.getSuitByString("D");
        System.out.println(cardSuit);
        Card card = new Card(cardSuit, cardRank);
        System.out.println(card.getCardString());
    }
}
