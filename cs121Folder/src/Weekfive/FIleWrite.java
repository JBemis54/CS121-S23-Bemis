package Weekfive;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;


public class FIleWrite {
    public static void main(String[]args)throws FileNotFoundException {
        File outputFile = new File("mycourses.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String course;
        String credits;
        String score;

        output.printf("%s %s %s\n", "course", "credits", "score");

        for (int i=1; i <= 3; i++){
            course = JOptionPane.showInputDialog(String.format("Enter name of course %d", i));
            credits = JOptionPane.showInputDialog("Enter the course credit");
            score = JOptionPane.showInputDialog("Enter the course score");

            output.printf("%s %s %s\n", course, credits,score);

        }
        output.close();

    }


}
