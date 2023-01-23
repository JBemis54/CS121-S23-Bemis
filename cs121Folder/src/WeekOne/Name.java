//******************
//    Assignment 1
//    Jacob Bemis
//    CS121
//******************
package WeekOne;
import javax.swing.*;
import java.util.Scanner;
public class Name {
    public static void main(String[] args)
    {
        //create scanner class
        Scanner keyboard = new Scanner(System. in);

        //asking for first name using scanner
        System.out.println("What is your first name");
        String fName = keyboard.nextLine();

        //asking for last name dialog box
        String lName = JOptionPane.showInputDialog("What is your last name?");
        // line from top to bottom: combine first and last name into one variable
        //make the string "name" upper case, then lower case, then reversed
        String name = fName + " " + lName;
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        StringBuilder reverse = new StringBuilder(name).reverse();

        // displaying string formatting
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(reverse);

        // prompting for first number
        System.out.println("Enter a number:");
        int num1= Integer.parseInt(keyboard.nextLine());

        // prompt for second number in a dialog box
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("enter a second number:"));

        // display numbers entered
        System.out.println("Numbers enters are " + num1 + " and " + num2);

        // figure sum of two numbers entered
        int sum = num1 + num2;

        // subtract num1 from num 2
        int differance = num1 - num2;

        //divide num1 from num2
        int quotient = num1 / num2;

        // square root num1
        double square1 = Math.sqrt(num1);

        // square root num2
        double square2 = Math.sqrt(num2);

        //power
        double power = Math.pow(num1,num2);

        // log 1
        double log1 = Math.log(num1);

        //log2
        double log2 = Math.log(num2);

        System.out.println("The sum of the two numbers are " + sum);
        System.out.println("The differance of the two numbers are " + differance);
        System.out.println("The quotient of the two numbers are " + quotient);
        System.out.println("The square root of the first number is " + square1);
        System.out.println("The square root of the second number is " + square2);
        System.out.println("The first number to the power of the second number is " + power);
        System.out.println(" The log of the first number is " + log1);
        System.out.println(" The log of the second number is " + log2);










    }
}
