package Weekfive;
// import objects needed
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileRead {
    public static void main(String[]args)throws FileNotFoundException{
        // make file  object
        File inputFile = new File("course.txt");
        // make scanner object
        try {
            //make scanner object read file
            Scanner input = new Scanner(inputFile);

            //read and print header
            String header = input.nextLine();
            System.out.println(header);

            // read values and print values
            while(input.hasNextLine()){
                String course = input.next();
                int credits = Integer.parseInt(input.next());
                int score = Integer.parseInt(input.next());
                System.out.printf("%-7s %3d d%7d\n", course, credits, score);

            }
            input.close();
        }catch(FileNotFoundException e) {
            System.out.println("File Not Found!");
        }


    }
}
