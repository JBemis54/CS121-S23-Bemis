package Week11;

import java.util.Arrays;

public class MainTwo {

    public static void main(String[] args){
        int[] array = SortingTwo.getArray();

        System.out.println(Arrays.toString(array));

        SortingTwo.insertionSort(array);

        System.out.println(Arrays.toString(array));
    }
}
