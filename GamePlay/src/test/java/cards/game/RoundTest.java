package cards.game;

import java.util.Scanner;

import cards.basic.Card;
import cards.basic.Rank;
import cards.basic.Suit;

public class RoundTest {

    public static void main(String[] args) {
        Trump trump = new Trump();
        Round round = new Round();
        trump.setTrump();
        trump.openTrump();
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter card no " + i);
            String input = new Scanner(System.in).nextLine();
            Rank cardRank = Rank.getRankBySymbol(input.substring(0, input.length() - 1));
            Suit cardSuit = Suit.getSuitByString(input.substring(input.length() - 1));
            Card card = new Card(cardSuit, cardRank);
            System.out.println(card.getCardString());
            round.addCardToRound(card);
        }
        System.out.println("points = " + round.calculateRoundPoints());
        System.out.println(
                "winner card" + round.getSoFarHighestCard().getCardString() + " position at " + round.whoIsTheWinner());

    }
}
