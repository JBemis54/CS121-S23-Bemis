package WeekThree;

import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);// create scanner object

        System.out.print("This application will tell if the number\n" +
                "entered is even or odd. Please enter a number: ");

        int input = Integer.parseInt(keyboard.nextLine());

        if (input % 2 == 0) {
            System.out.print(" Number is even!");
        }else {
            System.out.print("Number is odd!");
        }


    }
}