package WeekEight.Abstract;

public class test {

    public static void main(String[] args){
        Student student1 = new Student("Jacob","Bemis",5454,3.5);
        Professor professor1 = new Professor("Ladelle","Diekhoff",4545,"CS");

        System.out.println(student1.loneInfo());
        System.out.print(professor1.loneInfo());

    }
}
