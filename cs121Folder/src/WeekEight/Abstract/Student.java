package WeekEight.Abstract;

public class Student extends UniversityMember {
    protected double gpa;

    public Student(String fname, String lName,int id, double gpa){
        super(fname,lName,id);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s\nLast Name: %s\n ID:%d\nGPA: %.2f\n",fName,lName,id,gpa);
    }

    public String loneInfo()
    {
        return String.format("Student GPA is: %.2f", gpa);
    }

    }

