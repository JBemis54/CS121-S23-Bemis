package WeekThree;

import java.util.Scanner;

public class restaurant {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Is anyone in your party a vegetarian?");
        String vegetarian = input.nextLine();

        System.out.print("Is anyone in your party a vegan?");
        String vegan = input.nextLine();

        System.out.print("Is anyone in your party a gluten-free?");
        String gluten = input.nextLine();


        if (vegetarian.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("yes")) {
            System.out.print("Corner Cafe\n");
            System.out.print("The Chef's Kitchen\n");
        } else if (vegan.equalsIgnoreCase("yes") && gluten.equalsIgnoreCase("yes")) {
            System.out.print("Corner Cafe\n");
            System.out.print("The Chef's Kitchen\n");
        } else if (gluten.equalsIgnoreCase("yes") && vegetarian.equalsIgnoreCase("yes")) {
            System.out.print("Main Street Pizza Company\n");
            System.out.print("Corner Cafe\n");
            System.out.print("The Chef's Kitchen\n");
        } else if (gluten.equalsIgnoreCase("yes") && vegetarian.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("yes")) {
            System.out.print("Corner Cafe\n");
            System.out.print("The Chef's Kitchen\n");
        } else if (gluten.equalsIgnoreCase("yes")) {
            System.out.print("Main Street Pizza Company\n");
            System.out.print("Corner Cafe\n");
            System.out.print("The Chef's Kitchen\n");
        } else if (vegetarian.equalsIgnoreCase("yes")) {
            System.out.print("Main Street Pizza Company\n");
            System.out.print("Corner Cafe\n");
            System.out.print("The Chef's Kitchen\n");
            System.out.print("Mama's Fine Italian");
        } else if (vegan.equalsIgnoreCase("yes")) {
            System.out.print("Corner Cafe\n");
            System.out.print("The Chef's Kitchen\n");
        }
         else{
            System.out.print("Joe's Gourmet Burgers\n") ;
            System.out.print("Main Street Pizza Company\n");
            System.out.print("Corner Cafe\n");
            System.out.print("The Chef's Kitchen\n");
            System.out.print("Mama's Fine Italian");
        }
        }
    }

