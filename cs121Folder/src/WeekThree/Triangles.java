package WeekThree;

import java.util.Scanner;

public class Triangles {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the side of the first triangle.");
        int tri_1 = keyboard.nextInt();

        System.out.println("Please enter the side of the second triangle.");
        int tri_2 = keyboard.nextInt();

        System.out.println("Please enter the side of the third triangle.");
        int tri_3 = keyboard.nextInt();


        if (tri_1 == tri_2 && tri_1 == tri_3 && tri_2 == tri_3) {

            System.out.println("This is an equilateral triangle");

        }else if (tri_1 == tri_2 || tri_1 == tri_3 || tri_2 == tri_3){
            System.out.println("This is a Isosceles triangle");
        }else {
            System.out.println("This is a Scalene triangle");
        }
    }
}


