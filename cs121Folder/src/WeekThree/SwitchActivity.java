package WeekThree;

import javax.swing.*;

public class SwitchActivity {
    public static void main (String[]args){

        String mascot = null;
        String famousStudent = null;
        String founder = null;

        String input = JOptionPane.showInputDialog("Enter a Hogwarts House.");

        switch(input)
        {
            case"Gryffindor":
                 mascot = "lion";
                 famousStudent = "Harry Potter";
                 founder = "Godric Gryffindor";
                break;

            case"Slytherin":
                mascot = "Snake";
                famousStudent = "Horace Slughorn";
                founder = "Salazar Slytherin";
                break;

            case"Ravenclaw":
                mascot = "eagle";
                 famousStudent = "Gilderoy Lockheart";
                 founder = "Rowena RavenClaw";
                break;

            case"Hufflepuff":
                 mascot = "Badger";
                 famousStudent = "Newt Scamander";
                 founder = "Helga Hufflepuff";
                break;

            default:
                mascot = null;
                famousStudent = null;
                founder = null;


        }

        if (mascot == null) {
            JOptionPane.showMessageDialog(null," You have entered an invalid house.");
        }else{
            JOptionPane.showMessageDialog(null, "The " + input + " house mascot is a " + mascot + " and was founded by " + founder + "." +
                    " One well known " + input + " student is " + famousStudent + ".");
        }
    }
}
