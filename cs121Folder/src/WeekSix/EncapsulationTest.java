package WeekSix;

public class EncapsulationTest {

    public static void main(String[] args){
        //initialize object
        Encapsulation encapsulation = new Encapsulation("Jacob","Bemis",72,29);

        // test which variables can be accessed
        encapsulation.fName = "Jude";
        encapsulation.lName = "Michael";
        //encapsulation.heightInches = 36;
        //encapsulation.age = 4;

        //testing which method can be accessed
        encapsulation.printName();
        //encapsulation.printHeight();
        encapsulation.printAge();
        encapsulation.printRealHeight();
    }
}
