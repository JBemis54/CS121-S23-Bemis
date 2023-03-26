package WeekSeven;
import java.util.Scanner;
public class CourseInfoTest {

    public static void main(String[] args){

        String flag = "a";
        Scanner input = new Scanner(System.in);
        CourseInfo info = new CourseInfo();


        while (!flag.equalsIgnoreCase("q")){
            System.out.println("Enter the letter q when finished");

            System.out.println("Enter course name:");
            info.addCourse(input.nextLine());

            System.out.println("Enter GPA:");
            info.addGPA(input.nextDouble());

            System.out.println("Enter score:");
            info.addScore(input.nextInt());

            System.out.println("Enter grade:");
            info.addCourse(input.next());
        }
        info.table();
    }

}
