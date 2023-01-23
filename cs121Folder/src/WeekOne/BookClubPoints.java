//******************
//    Assignment 2
//    Jacob Bemis
//    CS121
//******************
package WeekOne;

import javax.swing.*;

public class BookClubPoints {
    public static void main (String[] args){

        // prompt for number of books
        int numBooks = Integer.parseInt(JOptionPane.showInputDialog("How many books have you bought?"));

        // this statement looks at the enter number and displays the appropriate response
        if(numBooks == 0){
            JOptionPane.showMessageDialog(null,"Sorry you earned 0 points");
        }
        else if(numBooks == 1){
            JOptionPane.showMessageDialog(null,"You earned 5 points!");
        }
        else if(numBooks == 2){
            JOptionPane.showMessageDialog(null,"You earned 15 points!");
        }
        else if(numBooks == 3){
            JOptionPane.showMessageDialog(null,"You earned 30 points!");
        }
        else if(numBooks > 3){
            JOptionPane.showMessageDialog(null,"You earned 60 points!");
        }
    }
}
