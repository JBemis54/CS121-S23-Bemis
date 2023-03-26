package WeekEight;

public class UniversityMember {
    protected String fName;
    protected String lName;
    protected int id;

    public UniversityMember(String name, String lname, int id) {
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

    public String toSting(){
        return String.format("First Name: %s\nLast Name: %s\n ID:%d",fName,lName,id);
    }

}
