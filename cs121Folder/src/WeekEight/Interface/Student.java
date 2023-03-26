package WeekEight.Interface;

public class Student implements printInfo {
    protected String fName;
    protected String lName;
    protected int id;

    public Student(String fName, String lName, int id) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String printName(){
        return (lName);
    }
}
