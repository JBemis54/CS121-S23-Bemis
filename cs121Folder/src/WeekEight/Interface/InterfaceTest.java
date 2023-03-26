package WeekEight.Interface;

public class InterfaceTest {
    public static void main (String[] args){

        Professor prof = new Professor("Ladelle","Diekhoff",2323);

        Student stud = new Student("Jacob","Bemis", 5454);

        String profName = prof.printName();
        String studName = stud.printName();

        System.out.println(profName);
        System.out.println(studName);
    }
}
