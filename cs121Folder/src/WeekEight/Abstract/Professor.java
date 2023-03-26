package WeekEight.Abstract;

public class Professor extends UniversityMember {

    protected String department;

    public Professor(String name, String lname, int id,String department) {
        super(name, lname, id);
        this.department = department;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s\nLast Name: %s\n ID:%d\nDepartment: %s\n", fName, lName, id, department);
    }

    public String loneInfo()
    {
        return String.format("Professor works in the %S department", department);
    }
}
