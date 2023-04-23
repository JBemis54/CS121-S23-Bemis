package Week13;
//import linklist
import java.util.LinkedList;

public class Student {
    // initialize variables
     String fName;
     String lName;
     String iD;
     String major;
     String classStanding;
     String gpa;
    //initialize linkList;

    LinkedList<String> courseList = new LinkedList<>();

    //constructor
    public Student(String fName, String lName, String iD, String major,String classStanding) {
        this.fName = fName;
        this.lName = lName;
        this.iD = iD;
        this.major = major;
        this.classStanding = classStanding;
    }

    public void addCourse(String course){
        courseList.add(course);
    }

    public void removeCourse(String course){
        courseList.remove(course);
    }

    public void getStudentInfo(){
        System.out.printf("Name: %s %s \n ID: %s \n Major: %s \n Class: %s\n",fName,lName,iD,major,classStanding);

    }
    public void displayStudentCourses(){
        System.out.println("Course List:" + courseList);
    }


}
