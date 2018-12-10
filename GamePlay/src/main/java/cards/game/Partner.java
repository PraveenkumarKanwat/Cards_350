package cards.game;

import java.util.ArrayList;
import java.util.Scanner;

import cards.basic.Card;

public class Partner {

    Card card1, card2;
    int biddersID;
    int partnerID1, partnerID2;
    Player partner1, partner2;

    public Partner(int biddersID) {
        this.biddersID = biddersID;
        card1 = null;
        card2 = null;
        partnerID1 = -1;
        partnerID2 = -1;
    }

    public Partner(Card card1, Card card2) {
        this.card1 = card1;
        this.card2 = card2;
    }

    public void callPartner(ArrayList<Player> players) {
        this.card1 = callPartnerCard(1);
        this.card2 = callPartnerCard(2);
        for (Player player : players) {
            if (player.getHand().hasCard(card1)) {
                partner1 = player;
                partnerID1 = player.id;
            } else if (player.getHand().hasCard(card2)) {
                partner2 = player;
                partnerID2 = player.id;
            }
        }
    }

    public Card callPartnerCard(int index) {
        Card card;
        while (true) {
            System.out.print("Enter the Cards of your Partner " + index + " {AS, AC} : ");
            String input = new Scanner(System.in).nextLine();
            card = Card.findCardByString(input);
            if (card != null) {
                break;
            }
            System.out.print("Please enter a valid card. ");
        }
        System.out.println("Partner no " + index + " is " + card.getCardString());
        return card;
    }
}
