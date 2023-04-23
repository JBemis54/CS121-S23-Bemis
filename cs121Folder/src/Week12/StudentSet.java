package Week12;

import java.awt.List;
import java.util.*;

public class StudentSet {


    public void addStudents(){

        Scanner input = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        String[] array = new String[0];
        while(true){
        System.out.println("Enter a list of students names: \n Enter the letter 'q' when done");
               String name =input.next();

        if (input.equals("q")) {
            break;
        } else{

            set.add(name);


            }
        }
    }

    public void displayStudents(){
      //  ListIterator<String> iter = set

    }
}
