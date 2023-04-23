package Week15;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        TotalCalories calories = new TotalCalories();

        System.out.println("Enter amount of calories per day:");
        int caloriesPerDay = Integer.parseInt(input.nextLine());

        System.out.println("Enter start date as mm/dd/yyyy:");
        String startDate = input.nextLine();

        System.out.println("Enter end date as mm/dd/yyyy:");
        String endDate = input.nextLine();

        int totCalories = calories.caloriesCount(caloriesPerDay,startDate,endDate);
        System.out.println(totCalories + " calories consumed from start date to end date.");

    }
}
