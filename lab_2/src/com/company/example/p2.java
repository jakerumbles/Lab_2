// Author: Jake Edwards
// Class: CSC 241-001
// Professor: Dr. Ivancic
// Date: 9/19/2017
// comment out before submitting to CS server!!!
package com.company.example;

import java.io.IOException;
import java.util.Scanner;

public class p2 {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);
        CardDeck cardDeck = new CardDeck();

        System.out.println("Deck loaded:");
        int choice;

        do {
            cardDeck.print();
            System.out.println("---------------------------");

            System.out.println("Would you like to (1)shuffle or (2)sort the deck or (3)quit?");
            choice = input.nextInt();
            while (choice < 1 || choice > 3) {
                System.out.println("Please choose one of the three choices:");
                System.out.println("Would you like to (1)shuffle or (2)sort the deck or (3)quit?");
                choice = input.nextInt();
            }
            // shuffle deck
            if (choice == 1) {
                cardDeck.shuffle();
            }

            // sort the deck
            else if(choice == 2) {
                System.out.println("Sort");
                cardDeck.sort();
            }
            else {
                break;
            }

        } while (choice != 3);
    }
}
