package Project1;
import java.util.Scanner;
import java.util.Random;
public class PokemonBattle {

    public static void main(String[]args){
        //create scanner class
        Scanner keyboard = new Scanner(System.in);
        //create random class
        Random random = new Random();

        System.out.print("Enter the pokemon you would like to battle with:");
        String pokeOne = keyboard.nextLine();

        System.out.print("Enter " + pokeOne + " hit points:");
        String pokeOneHP = keyboard.nextLine();

        System.out.print("Enter " + pokeOne + " move:");
        String pokeOneMove = keyboard.nextLine();

        System.out.print("Enter " + pokeOneMove + "'s power:");
        String pokeOnePower = keyboard.nextLine();

        System.out.print("Enter " + pokeOne + " attack speed:");
        String pokeOneSpeed = keyboard.nextLine();



        System.out.print("Enter the second pokemon you would like to battle with:");
        String pokeTwo = keyboard.nextLine();

        System.out.print("Enter " + pokeTwo + " hit points:");
        String pokeTwoHP = keyboard.nextLine();

        System.out.print("Enter " + pokeTwo + " move:");
        String pokeTwoMove = keyboard.nextLine();

        System.out.print("Enter " + pokeTwoMove + "'s power:");
        String pokeTwoPower = keyboard.nextLine();

        System.out.print("Enter " + pokeTwo + " attack speed:");
        String pokeTwoSpeed = keyboard.nextLine();



        System.out.print ("Pokemon: " + pokeOne + "\n" +
                "Hit Points:" + pokeOneHP + "\n"+
                "Move:" + pokeOneMove + "\n" +
                "Move Power:" + pokeOnePower + "\n"+
                "Attack Speed:" + pokeOneSpeed + "\n");

        System.out.print("_______________________________________________\n");

        System.out.print("Pokemon: " + pokeTwo + "\n" +
                "Hit Points:" + pokeTwoHP + "\n"+
                "Move:" + pokeTwoMove + "\n" +
                "Move Power:" + pokeTwoPower + "\n"+
                "Attack Speed:" + pokeTwoSpeed + "\n");



    }
}
