package Week11;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Enter 5 unsorted numbers");

        for (int i = 0; i < array.length; i++){

            array[i] = input.nextInt();
        }
        System.out.println("Unsorted Numbers:");
        System.out.print(Arrays.toString(array));

        Sorting.bubbleSort(array);
        System.out.println("Sorted Numbers:");
        System.out.print(Arrays.toString(array));

    }
}
