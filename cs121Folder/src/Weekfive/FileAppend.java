package Weekfive;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class FileAppend {
    public static void main(String[]args) throws IOException{
        try {
            FileWriter fileWriter = new FileWriter("mycourses.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            String course = JOptionPane.showInputDialog("Enter course name");
            String credits = JOptionPane.showInputDialog("Enter course credits");
            String score = JOptionPane.showInputDialog("Enter course score");

            output.printf("%s %s %s", course, credits, score);
            fileWriter.close();
            output.close();
        }catch(FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
        }
    }
}
