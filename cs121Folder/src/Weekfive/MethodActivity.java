package Weekfive;
import java.util.Scanner;

public class MethodActivity {
    static Scanner input = new Scanner(System.in);

    public static void main(String[]args) {
       double length = getLength();
        double width = getWidth();
        double area = getArea(length,width);
        displayData(length,width,area);

    }

        public static double getLength() {
            System.out.println("Enter the length of the rectangle.");
            int length = input.nextInt();
            return length;
    }

        public static double getWidth() {
            System.out.println("Enter the width of the rectangle.");
             int width = input.nextInt();
            return width;
         }

    public static double getArea(double length, double width) {
        double area = length * width;
        return area;
    }
    public static void displayData(double length, double width, double area){
        System.out.println("Rectangle length: " + length);
        System.out.println("Rectangle width: " + width);
        System.out.println("Rectangle area: " + area);

    }
    }

