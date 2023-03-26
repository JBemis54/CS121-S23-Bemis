package WeekSeven;

public class ArrayDemo2 {
     public static void main(String[] args){

         int[][] array = new int[4][3];

         array [0][0] = 1;
         array [0][1] = 2;
         array [0][2] = 3;
         array [1][0] = 4;
         array [1][1] = 5;
         array [1][2] = 6;
         array [2][0] = 7;
         array [2][1] = 8;
         array [2][2] = 9;
         array [3][0] = 1;
         array [3][1] = 2;
         array [3][2] = 3;

         for (int row = 0; row < array.length; row++){
             for (int column = 0; column < array[row].length; column++){
                 System.out.printf("%d ", array[row][column]);

             }
             System.out.println();
         }


     }

}
