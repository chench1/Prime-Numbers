/*
Author - Charles Chen
Date - 12/8/2021
Purpose - Finds the prime numbers from 1 to what the user inputs
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program will list the prime numbers up to the integer that the user will enter. To exit this program " +
                "please enter N or n anytime");
        String input = "";
        while(true) {
            int max = 0;
            while(true) {
                input = scan.nextLine();
                if (input.equalsIgnoreCase("n")) {
                    System.out.println("This program is exiting");
                    break;
                }
                try {
                    max = Integer.parseInt(input);
                    if (max > 2) {
                        break;
                    } else {
                        System.out.println("Please enter an integer that is larger than 2:");
                    }
                } catch (Exception exception) {
                    System.out.println("Please enter a valid number");
                }
            }

            String res = "";
            for (int i = 2; i < max; i++) {
                if (isPrime(i)) {
                    res += i + " ";
                }
            }
            if (!input.equalsIgnoreCase("n")) {
                System.out.println("The prime numbers from 1 to " + max + " are: " + res);
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
