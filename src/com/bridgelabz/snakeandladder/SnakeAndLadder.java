package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

    public static void main(String[] args) {
        /**
         * The following implements snake and ladder game
         *
         * @author Deepak
         * @version 1.0
         * @since 13/08/2021
         */

          /**
          * @param start -Is the starting Point
           * @param dice -Is random function to generate dice output i.e 1-6
          */

        int start=0;
        System.out.println("Welcome to Snake And Ladder game");
        System.out.println("\nStarting the game with Point= " + start);
        int dice = (int)(Math.random() * 6) + 1;
        System.out.println("number on the dice is :" + dice);
    }
}
