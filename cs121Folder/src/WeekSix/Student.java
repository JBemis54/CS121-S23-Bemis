package WeekSix;

public class Student {
    //initialize variable
    String name;
    String major;
    double gpa;
    int idNum;

    //constructor
    public Student (String name, String major, double gpa, int idNum){
        this.name = name;
        this.major = major;
        this.gpa = gpa;
        this.idNum = idNum;

    }
    // method that prints values initialized in the test class
    void printStudent() {
        System.out.println(name +"\n" + "Major: " + major +  "\n" + "GPA: " +
                gpa + "\nidNum: " + idNum);

    }
}
