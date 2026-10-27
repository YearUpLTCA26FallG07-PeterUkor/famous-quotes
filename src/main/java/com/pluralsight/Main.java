package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] quotes = {
                "Believe in yourself and never give up.",
                "Success begins with a single step.",
                "Hard work beats talent when talent doesn't work hard.",
                "Every mistake is an opportunity to learn.",
                "Dream big, start small, and keep going.",
                "Your future depends on what you do today.",
                "Great things take time and patience.",
                "Failure is part of the journey to success.",
                "Stay focused and trust the process.",
                "The only limit is the one you set for yourself."
        };

        while(true) {
            System.out.println("Enter an index between 1 - 10 or  ");
            System.out.println("Enter 0 for a random quote. ");
            System.out.printf("Choice: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 0){
                // random is always between 0 and 1

                int randomNumber = (int) (Math.random() * 10);
                System.out.println(quotes[randomNumber]);
                break;
            }

            try {
                System.out.println("Quote: " + quotes[choice - 1]);
            } catch (Exception e) {
                System.out.println("INVALID INPUT");
                System.out.println("Please enter a range between 1 and 10.");
                continue;
            }
            break;
        }

    }
}