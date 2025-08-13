package com.example.evenodd;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // infinite loop until user exits
            System.out.print("Enter an integer (or type 'exit' to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break; // exit loop
            }

            try {
                int num = Integer.parseInt(input);
                if (num % 2 == 0) {
                    System.out.println(num + " is even.");
                } else {
                    System.out.println(num + " is odd.");
                }
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid integer. Please try again.");
            }
        }

        scanner.close();
    }
}
