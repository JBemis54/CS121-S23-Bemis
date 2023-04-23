package WeekSeven;
import java.util.Scanner;
public class CourseInfoTest {

    public static void main(String[] args) {

        String flag = "a";
        Scanner input = new Scanner(System.in);
        CourseInfo info = new CourseInfo();


        while (true) {
            System.out.println("Enter course name or the letter q when finished");
            String value = input.nextLine();
            if (value.equals("q")) {
                break;
            } else {
                info.addCourse(value);

                System.out.println("Enter GPA:");
                info.addGPA(Double.parseDouble(input.nextLine()));

                System.out.println("Enter score:");
                info.addScore(Integer.parseInt(input.nextLine()));

                System.out.println("Enter grade:");
                info.addGrade(input.next().charAt(0));
                input.nextLine();
            }
        }
        info.table();

    }
}
