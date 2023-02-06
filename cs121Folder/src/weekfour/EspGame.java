package weekfour;
import java.util.Random;
import java.util.Scanner;

public class EspGame {
    public static void main(String[] args){
        //initialize variable
        String color = null;
        int points = 0;
        int counter = 1;

        // create random object
        Random random = new Random();
        // create scanner object
        Scanner input = new Scanner(System.in);
        while (counter <= 10){
      int colorSet = random.nextInt(5);


        if (colorSet == 0){
          color = "red";
      }
        if (colorSet == 1){
            color = "green";
        }
        if (colorSet == 2){
            color = "blue";
        }
        if (colorSet ==3){
            color = "orange";
        }
        if (colorSet == 4){
            color = "yellow";
        }

            System.out.println(" What color has the computer chosen?");
            String userGuess = input.nextLine();

            if (color.equalsIgnoreCase(userGuess)){
                System.out.println("Correct!");
                points = points + 1;
                counter = counter + 1;
            }else{
                System.out.println("That is incorrect. \n The computer was thinking " + color + ".");
                counter = counter + 1;
            }

        }
        System.out.println("You scored " + points + "/10.");
    }
}
