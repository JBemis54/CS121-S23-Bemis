package WeekSeven;

import java.util.Scanner;


public class ArrayFromInput {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String[] name = new String[3];
        int[] gradePercent = new int[3];
        String[] favoriteSubject = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Name:");
            name[i] = console.nextLine();
            System.out.println("Grade Percent:");
            gradePercent[i] = Integer.parseInt(console.nextLine());
            System.out.println("Favorite Subject:");
            favoriteSubject[i] = console.nextLine();
        }
        System.out.printf("%-10s %-10s %20s\n", "Name" , "Grade Percent", "Favorite Subject");
        for (int i = 0; i < name.length; i++) {
            System.out.printf("%-10s %-10d %12s\n",name[i],gradePercent[i],favoriteSubject[i]);
        }
    }
    }


