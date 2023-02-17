package weekfour;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main (String[]args){
        //initialize count
        int count = 0;
        //create scanner object
        Scanner keyboard = new Scanner(System.in);

        //create random object
        Random random = new Random();

        //roll number for guessing game
        int answer = random.nextInt((100-1)+1);

        // set up while loop to allow player to keep guessing
        while(true) {
            // prompt for users guess
            System.out.println("Guess a number between 1 and 100, or enter q if you want to quit.");
            String input = keyboard.nextLine();

            if (input.equalsIgnoreCase("q")) {

                System.out.println("Thanks for playing!");
                break;
            } else {

                // convert sting to int
                int inputInt = Integer.parseInt(input);

                if (inputInt > 100 || inputInt < 1) {
                    System.out.println("This is an invalid number.");
                    count = count + 1;
                } else if (inputInt < answer) {
                    System.out.println("Too low. Guess again:");
                    count = count + 1;
                } else if (inputInt > answer) {
                    System.out.println("Too High. Guess again:");
                    count = count + 1;
                } else {
                    System.out.println("Correct!, it took you " + count + " attempts");
                    break;

                }
            }
        }
    }
}
