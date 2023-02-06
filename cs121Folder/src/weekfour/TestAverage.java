package weekfour;

import java.util.Scanner;

public class TestAverage {

    public static void main (String[]args){
        //initialize variable
        int average = 0;
        int aveScore = 0;
        // tells user purpose off app
        Scanner input = new Scanner(System.in);
        System.out.println("This applications will average test scores for the entered number of students.");

        //prompt for number of students
        System.out.println("How many students?");
        int numOfStudents = input.nextInt();

        //prompt for number of test
        System.out.println("How many test per student");
        int numOfTest = input.nextInt();

        //nest loop allow user to enter all the test score and receive averages consecutively
        for(int i = 1; i <= numOfStudents; i++)
        {
            for (int j = 1; j <= numOfTest; j++){
                System.out.print("Enter score" + j + ": ");
                int score = input.nextInt();
                 aveScore = aveScore + score;
                 average = aveScore/ numOfTest;
            }
            System.out.println("The average score for student " + i + " is " + average + ".");
            aveScore = 0;
            average = 0;
        }
    }
}
