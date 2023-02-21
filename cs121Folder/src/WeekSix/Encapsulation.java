package WeekSix;


public class Encapsulation {
    //initialize variables
    public String fName;
    public String lName;
    private int heightInches;
    private int age;

    private double accurateHeight;

    //constructor
    public Encapsulation (String fName, String lName, int heightInches, int age){
        this.fName = fName;
        this.lName = lName;
        this.heightInches = heightInches;
        this.age = age;
        this.accurateHeight = accurateHeight;
    }

    // prints  name
    public void printName(){
        System.out.println("Your name is" + fName + lName);
    }
    // print last height
    private void printHeight(){
        System.out.println("Your height is " + heightInches + "inches");
    }
    // print age
    protected void printAge(){
        System.out.println("Your age is " + age);
    }

    // calculate and print height in feet as a double
    void printRealHeight(){
        accurateHeight = heightInches / 12;
        System.out.println("Your height in feet is " + accurateHeight);

    }


}
