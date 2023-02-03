package WeekThree;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {

        String userName = JOptionPane.showInputDialog("Please enter your user name");
        String password = JOptionPane.showInputDialog("Please enter your password");


        if (userName.equals("Seymor Buits") && password.equals("moestavern")) {
            JOptionPane.showMessageDialog(null, "Welcome to CS121!");
        } else if (userName.equals("Seymor Buits") && !password.equals("moestavern")) {
            JOptionPane.showMessageDialog(null, "Your password is incorrect");
        } else if (!userName.equals("Seymor Buits") && password.equals("moestavern")) {
            JOptionPane.showMessageDialog(null, "Your user name is incorrect");

        }  else {
                JOptionPane.showMessageDialog(null, "Your sign in is incorrect");
            }


        }
    }

