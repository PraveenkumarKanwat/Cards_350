/* code is complete
 * modify for your local repos for testing
 * 
 * 
 * 
 * 
 *
 * 
 * 
 */
package com.game.cards;


/**
 * Hello world!
 *
 */

//use App.java to run the application to test
public class App {
    public static void main( String[] args ){
    		Deck deck = new Deck();
    		deck.Shuffle();
       		
    		Deal deal = new Deal(deck);
    		Hand hand0  = new Hand();
    		Hand hand1  = new Hand();
    		Hand hand2  = new Hand();
    		Hand hand3  = new Hand();
    		Hand hand4  = new Hand();
    		Hand hand5  = new Hand();
    		
    		System.out.println("player 0  ");
   
    		hand0 = deal.handlist.get(0);
    		hand0.arrangeHand();
    		hand0.printHand(hand0);
    		System.out.println();
    		System.out.println();
    		
    		System.out.println("player 1  ");
    
    		hand1 = deal.handlist.get(1);
    		hand1.arrangeHand();
    		hand1.printHand(hand1);
    		System.out.println();
    		System.out.println();
    		
    		System.out.println("player 2  ");
   
    		hand2 = deal.handlist.get(2);
    		hand2.arrangeHand();
    		hand2.printHand(hand2);
    		System.out.println();
    		System.out.println();
    		
    		System.out.println("player 3  ");
    	
    		hand3 = deal.handlist.get(3);
    		hand3.arrangeHand();
    		hand3.printHand(hand3);
    		System.out.println();
    		System.out.println();
    		
    		System.out.println("player 4  ");

    		hand4 = deal.handlist.get(4);
    		hand4.arrangeHand();
    		hand4.printHand(hand4);
    		System.out.println();
    		System.out.println();
    		
    		System.out.println("player 5  ");

    		hand5 = deal.handlist.get(5);
    		hand5.arrangeHand();
    		hand5.printHand(hand5);
    }
}