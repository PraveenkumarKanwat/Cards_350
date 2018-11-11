package com.cards.game;

import java.util.Scanner;

public class Bidding {
    final static int maxBiddingValue = 350;
    final static int minBiddingValue = 250;
    static int currentBiddingValue;

    public Bidding() {
        currentBiddingValue = minBiddingValue - 10;
    }

    public static int getCurrentBiddingValue() {
        return currentBiddingValue;
    }


    public void doBidding(){
        if (currentBiddingValue == maxBiddingValue) return;
        while(true){
            System.out.print("Enter your Bid {'P': Pass, "+ displayBiddingOptions() + ": Bid} : ");
            String input = new Scanner(System.in).nextLine();
            if(input.charAt(0) == 'P') {
                System.out.println("You have Passed");
                break;
            }
            else if (input.charAt(0) == 'B'){
                if(Integer.valueOf(input.split(" ")[1]) % 10 == 0
                   && Integer.valueOf(input.split(" ")[1]) > currentBiddingValue
                   && Integer.valueOf(input.split(" ")[1]) <= maxBiddingValue){

                    currentBiddingValue = Integer.valueOf(input.split(" ")[1]);
                    System.out.println("New Bid Set to " + currentBiddingValue);
                    break;
                }
            }
            System.out.print("Invalid! Please try again. ");
        }
    }

    public String displayBiddingOptions(){
        String options = "";
        for (int i = currentBiddingValue + 10; i <= maxBiddingValue; i = i + 10){
            options += "'B " + String.valueOf(i) + "', ";
        }
        return options;
    }
}
