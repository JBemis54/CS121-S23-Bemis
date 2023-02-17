package Project1;
import java.util.Scanner;
import java.util.Random;
public class PokemonBattle {

    public static void main(String[] args) {
        //create scanner class
        Scanner keyboard = new Scanner(System.in);
        //create random class
        Random random = new Random();
        int currentRound = 1;
        int playOne = 0;
        int playTwo = 0;


        System.out.println("POKEMON BATTLE");
        System.out.println("Enter battle round");
        int battleRound = keyboard.nextInt();
        while (currentRound <= battleRound) {


            System.out.println("Enter the pokemon you would like to battle with:");
            String pokeOne = keyboard.next();


            System.out.println("Enter " + pokeOne + " hit points:");
            int pokeOneHP = keyboard.nextInt();

            System.out.println("Enter " + pokeOne + " move:");
            String pokeOneMove = keyboard.next();

            System.out.println("Enter " + pokeOneMove + "'s power:");
            int pokeOnePower = keyboard.nextInt();

            System.out.println("Enter " + pokeOne + " attack speed:");
            int pokeOneSpeed = keyboard.nextInt();


            System.out.println("Enter the second pokemon you would like to battle with:");
            String pokeTwo = keyboard.next();

            System.out.println("Enter " + pokeTwo + " hit points:");
            int pokeTwoHP = keyboard.nextInt();

            System.out.println("Enter " + pokeTwo + " move:");
            String pokeTwoMove = keyboard.next();

            System.out.println("Enter " + pokeTwoMove + "'s power:");
            int pokeTwoPower = keyboard.nextInt();

            System.out.println("Enter " + pokeTwo + " attack speed:");
            int pokeTwoSpeed = keyboard.nextInt();


            System.out.print("Pokemon: " + pokeOne + "\n" +
                    "Hit Points:" + pokeOneHP + "\n" +
                    "Move:" + pokeOneMove + "\n" +
                    "Move Power:" + pokeOnePower + "\n" +
                    "Attack Speed:" + pokeOneSpeed + "\n");

            System.out.print("_______________________________________________\n");

            System.out.print("Pokemon: " + pokeTwo + "\n" +
                    "Hit Points:" + pokeTwoHP + "\n" +
                    "Move:" + pokeTwoMove + "\n" +
                    "Move Power:" + pokeTwoPower + "\n" +
                    "Attack Speed:" + pokeTwoSpeed + "\n");
            while (pokeOneHP != 0 || pokeTwoHP != 0) {
                if (pokeOneSpeed > pokeTwoSpeed) {
                    pokeTwoHP = pokeTwoHP - pokeOnePower;
                    if (pokeTwoHP == 0) {
                        playOne = playOne + 1;
                        System.out.println(playOne);
                        break;
                    }
                }
                if (pokeTwoSpeed > pokeOneSpeed) {
                    pokeOneHP = pokeOneHP - pokeTwoPower;
                    if (pokeOneHP == 0) {
                        playTwo = playTwo + 1;
                        System.out.println("-------------------");
                        System.out.println("WINS\n" + "Player One: " + playOne + "\n" + "Player Two: " + playTwo);
                        System.out.println("-------------------");
                        break;
                    }
                }
                if (pokeTwoSpeed == pokeOneSpeed) {
                    int roll = random.nextInt((10 - 1) + 1);
                    if (roll % 2 == 0) {
                        pokeOneHP = pokeOneHP - pokeTwoPower;
                        if (pokeOneHP == 0) {
                            playTwo = playTwo + 1;
                            System.out.println("-------------------");
                            System.out.println("WINS\n" + "Player One: " + playOne + "\n" + "Player Two: " + playTwo);
                            System.out.println("-------------------");
                            break;
                        } else {
                            pokeTwoHP = pokeTwoHP - pokeOnePower;
                            if (pokeTwoHP == 0) {
                                playOne = playOne + 1;
                                System.out.println("-------------------");
                                System.out.println("WINS\n" + "Player One: " + playOne + "\n" + "Player Two: " + playTwo);
                                System.out.println("-------------------");
                                break;
                            }
                        }
                    }

                }

            }
            }
            if (playOne > playTwo) {
                System.out.print("Play one wins");
            }
            if (playTwo > playOne) {
                System.out.print("Play two wins");
            }
            if (playTwo == playOne) {
                System.out.print("You didn't enter a odd number of rounds as instructed!!!");
            }


        }
    }
