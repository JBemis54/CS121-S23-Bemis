//******************
//    Assignment 2
//    Jacob Bemis
//    CS121
//******************
package WeekOne;

import javax.swing.*;

public class TestScores {
    public static void main(String[] args) {

        String finalGrade = "A";

        // give instructions to user
        JOptionPane.showMessageDialog(null,"This program will accept three scores and then averages them for a final grade.");

        //prompt for first test score
        int scor1 = Integer.parseInt(JOptionPane.showInputDialog("Score 1: "));

        //prompt for second test score
        int scor2 = Integer.parseInt(JOptionPane.showInputDialog("Score 2: "));

        //prompt for first test score
        int scor3 = Integer.parseInt(JOptionPane.showInputDialog("Score 3: "));

        int finalScore = scor1 + scor2 + scor3;

       int average = finalScore / 3;

       if (average > 90){
            finalGrade = "A";
       }
       else if(average > 80){
            finalGrade = "B";
       }
       else if(average > 70){
            finalGrade = "C";
       }
       else if(average > 60){
            finalGrade = "D";
       }
       else if(average < 60){
            finalGrade = "F";
       }

        JOptionPane.showMessageDialog(null,String.format("Your average test grade is " + average + ". Your final grade is " + finalGrade));



    }
}