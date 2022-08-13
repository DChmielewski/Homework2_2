package org.example;

import java.util.Random;
import java.util.Scanner;


public class GuessGame {
    public static Scanner scanner;
    public static final int NUMBEROFTRIES = 5;
    public static final int BOUND = 100;

    public static void main(String[] args) {

        int numberToGuess = selectNumberToGuess();

        scanner = new Scanner(System.in);
        printMessage("Welcome in my game. You have 5 tries to guess the number.");
        printMessage("Guess the number from 0 to 99: ");

        for (int i = 1; i <= NUMBEROFTRIES; i++) {
            myGameBody(numberToGuess, scanner, i);
        }
        printMessage("Game over. Guessing number is: " + numberToGuess);
    }

    private static int selectNumberToGuess() {
        return new Random().nextInt(GuessGame.BOUND);
    }

    private static void myGameBody(int numberToGuess, Scanner scanner, int i) {
        int getNumberFromUser;
        getNumberFromUser = scanner.nextInt();
        if (numberToGuess == getNumberFromUser) {
            printMessage("Win!");
            System.exit(0);
        } else if (numberToGuess > getNumberFromUser && i <= GuessGame.NUMBEROFTRIES) {
            printMessage("Not this time! Your number is greater." + " Tries left: " + i + "/" + GuessGame.NUMBEROFTRIES);
        } else if (numberToGuess < getNumberFromUser && i <= GuessGame.NUMBEROFTRIES) {
            printMessage("Not this time! Your number is less." + " Tries left " + i + "/" + GuessGame.NUMBEROFTRIES);
        }
    }

    private static void printMessage(String x) {
        System.out.println(x);
    }

}












