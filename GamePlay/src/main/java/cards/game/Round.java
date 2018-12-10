package cards.game;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import cards.basic.*;

public class Round {

    final static int noOfPlayers = 6;
    Suit baseSuit;
    ArrayList<Card> roundCards;
    static int winnerIndex;
    Card soFarHighestCard;
    Logger logger = Logger.getLogger(Round.class.getName());

    public Round() {
        roundCards = new ArrayList<Card>();
        winnerIndex = -1;
        soFarHighestCard = null;
    }

    public void addCardToRound(Card card) {
        if (roundCards.size() == 0) {
            baseSuit = card.getSuit();
        }
        if (roundCards.size() == 6) {
            System.out.println("Only 6 cards in a round.");
            return;
        }
        calculateWinner(card);
        roundCards.add(card);
    }

    private void calculateWinner(Card card) {
        if (roundCards.size() == 0) {
            soFarHighestCard = card;
            winnerIndex = 0;
            logger.log(Level.INFO,
                       "first card added " + card.getCardString() + " SFH " + soFarHighestCard.getCardString() + " WI "
                       + winnerIndex);
        } else {
            if (card.getSuit() == soFarHighestCard.getSuit()) {
                if (card.getRank().getRankValue() > soFarHighestCard.getRank().getRankValue()) {
                    winnerIndex = roundCards.size();
                    soFarHighestCard = card;
                    logger.log(Level.INFO,
                               "card.getSuit() == soFarHighestCard.getSuit() " + card.getCardString() + " SFH "
                               + soFarHighestCard.getCardString() + " WI " + winnerIndex);

                }
            } else {
                if (Trump.isTrumpOpen()) {
                    if (card.getSuit() == Trump.getTrump()) {
                        if (card.getSuit() == soFarHighestCard.getSuit()) {
                            if (card.getRank().getRankValue() > soFarHighestCard.getRank().getRankValue()) {
                                winnerIndex = roundCards.size();
                                soFarHighestCard = card;
                                logger.log(Level.INFO,
                                           "card.getRank().getRankValue() > soFarHighestCard.getRank().getRankValue() "
                                           + card.getCardString() + " SFH " + soFarHighestCard.getCardString() + " WI "
                                           + winnerIndex);
                            }
                        } else {
                            winnerIndex = roundCards.size();
                            soFarHighestCard = card;
                            logger.log(Level.INFO,
                                       "card.getSuit() != soFarHighestCard.getSuit() " + card.getCardString() + " SFH "
                                       + soFarHighestCard.getCardString() + " WI " + winnerIndex);
                        }
                    }
                }
            }
        }
    }

    public int calculateRoundPoints() {
        int points = 0;
        for (Card c : roundCards) {
            points += c.getPoints();
        }
        return points;
    }

    public Card getSoFarHighestCard() {
        return soFarHighestCard;
    }

    public int whoIsTheWinner() {
        System.out.println("The winner card is " + soFarHighestCard.getCardString() + " at position " + winnerIndex);
        return winnerIndex;
    }

    public static int getWinnerIndex() {
        return winnerIndex;
    }

}
