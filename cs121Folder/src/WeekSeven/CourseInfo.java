package WeekSeven;

import java.util.ArrayList;

public class CourseInfo {
    private ArrayList<String> courseList = new ArrayList<>();
    private ArrayList<Double> gpaList = new ArrayList<>();
    private ArrayList<Integer> scoreList = new ArrayList<>();
    private ArrayList<Character> letterGradeList = new ArrayList<>();

    public void addCourse(String course){
        courseList.add(course);
    }
    public void addGPA (Double gpa){
        gpaList.add(gpa);
    }
    public void addScore(int score){
        scoreList.add(score);
    }
    public void addGrade (char grade){
        letterGradeList.add(grade);
    }

    public void table() {
        System.out.println("Course   GPA   Score  Grade");
        for(Object course: courseList){
            System.out.printf("%s", course);
        }
        for(Object gpa: gpaList){
            System.out.printf("%d", gpa);
        }
        for(Object score: scoreList){
            System.out.printf("%i", score);
        }
        for(Object grade: letterGradeList){
            System.out.printf("%c", grade);
        }
    }

}
