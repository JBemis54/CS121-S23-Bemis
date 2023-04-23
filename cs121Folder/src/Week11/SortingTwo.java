package Week11;

import java.util.Scanner;

public class SortingTwo {

    public static int[] getArray() {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Enter 5 unsorted numbers");

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();

        }
        return array;
    }

    public static void insertionSort(int[] array) {

        int temp;

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

    }
}