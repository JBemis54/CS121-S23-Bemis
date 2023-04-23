package Week11;

public class Sorting {



    public static void bubbleSort(int[] array){

        int temp;

        for (int i = 0; i < array.length-1; i++){
            for (int index = 0; index < array.length -i-1; index++){
                if (array[index] > array[index + 1]){
                    temp = array[index];
                    array[index] = array[index +1];
                    array[index + 1] = temp;
                }
            }

        }

    }
}
