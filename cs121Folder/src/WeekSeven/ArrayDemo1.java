package WeekSeven;

public class ArrayDemo1 {

    public static void main(String[] args){

        //create four dimensional array
        int [][] array ={{1,2,3},{4,5,6},{7,8,9},{1,2,3}};

        for (int[] row : array){
            for(int column: row){
                System.out.printf("%d ", column);
            }
            System.out.println();
        }
    }
}
