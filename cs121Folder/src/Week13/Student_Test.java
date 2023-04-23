package Week13;

public class Student_Test {

    //main function
    public static void main(String[] args){

        Student student1 = new Student("Jacob", "Bemis", "1234","Computer Science","Freshmen");

        // add 3 courses
        student1.addCourse("Discrete Structures");
        student1.addCourse("Data Structure & OOP");
        student1.addCourse("Probability and Stat");

        //printStudent info
        student1.getStudentInfo();

        //print Student course list
        student1.displayStudentCourses();

        //remove course
        student1.removeCourse("Discrete Structures");

        // print course list again
        student1.displayStudentCourses();


        //creating space
        System.out.println("-------------------------------------------------");

        Student student2 = new Student("Jude", "Bemis", "2019","Potty Training","Freshmen");

        // add 3 courses
        student2.addCourse("Napping");
        student2.addCourse("Potty Training");
        student2.addCourse("Manners");

        //printStudent info
        student2.getStudentInfo();

        //print Student course list
        student2.displayStudentCourses();

        //remove course
        student2.removeCourse("Manners");

        // print course list again
        student2.displayStudentCourses();
    }
}
