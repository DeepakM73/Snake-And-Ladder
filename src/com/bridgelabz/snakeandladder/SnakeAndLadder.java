package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

    public static final int START = 0;
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WIN_POSITION = 100;

    public static void main(String[] args) {

        /**
         * The following implements snake and ladder game
         */

          /**
          * @param start -Is the starting Point
           *@param dice - dice -Is random function to generate dice output i.e 1-6
           *@param pasition - The current position in the game
           *@param newPosition - The position aquired after dice roll
          */

        int start=0;
        System.out.println("Welcome to Snake And Ladder game");
        System.out.println("\nStarting the game with Point= " + START);

        int position = 0;
        int newPosition = 0;

        while (position != WIN_POSITION) {

            int dice = (int) (Math.random() * 6) + 1;
            System.out.println("Dice roll: " + dice);
            int checkOption = (int) (Math.random() * 3);

            switch (checkOption) {
                case NO_PLAY:
                    newPosition = 0;
                    break;
                case LADDER:
                    newPosition = dice;
                    break;
                case SNAKE:
                    newPosition = -dice;
            }
            position = position + newPosition;
            if (position < 0) {
                position = 0;
            }
            System.out.println("Position: " + position);
        }
    }
}
