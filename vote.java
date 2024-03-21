/**
 * Checks if a user is eligible to vote and calculates 
 * how many more years they need to be eligible to vote.
 *
 * @author Jaydin Madore
 * @version 1.0
 * @since 2023-03-21
 */

import java.util.Scanner;

public final class vote {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        int age;

         // Infinite for loop
        for (; ; ) {
            // Asks the user for their  age or 'q'.
            
            System.out.print("Please enter your age or 'q' to quit the game: ");
            userInput = scanner.nextLine();
            // If the user enters "q" it will break out of the loop. 
            if ("q".equalsIgnoreCase(userInput)) {
                break;
            }

            try {
                // Try to convert the user input to an integer
                age = Integer.parseInt(userInput);
            } 
            // If the user input convert to an integer it prints
            // an error message back to the user.
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
                // Skips the iteration with the loop
                continue;
            }
            // If age is greater than your equal to 18 you can vote.
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } 
            // tells the user to enter a positive number if age is less than 0.
            else if (age < 0)
            System.out.println("Must enter a number equal or greater than 0.");
            // else you can not vote
            else {
                System.out.println("You are not eligible to vote yet.");
                // Takes the user age to find out how long till he can vote.
                int yearsLeft = 18 - age;
                System.out.println("You need to wait " + yearsLeft + " years to vote.");
            }
        }
        // Thanks the user for playing.
        System.out.println("Thank you for playing!");
        // closes the scanner.
        scanner.close();
    }
}