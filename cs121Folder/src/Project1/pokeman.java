package Project1;

import java.util.Random;
import java.util.Scanner;

public class pokeman {


        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            Random random = new Random();
            int wins1 = 0;
            int wins2 = 0;
            int rnd = 0;
            System.out.println("Enter odd number of rounds");
            int rounds = Integer.parseInt(input.nextLine());
            for (int i = 1; i <= rounds; i++) {

                rnd++;
                System.out.println("\nRound " + rnd);

                //Player 1
                System.out.println("\nPlayer 1, choose your Pokemon!");
                String Pokemon1 = input.nextLine();
                System.out.println("Enter HP");
                int HP1 = Integer.parseInt(input.nextLine());
                System.out.println("Enter skill");
                String move1 = input.nextLine();
                System.out.println("Enter skill power");
                int power1 = Integer.parseInt(input.nextLine());
                System.out.println("Enter attack speed");
                int speed1 = Integer.parseInt(input.nextLine());

                //Player 2
                System.out.println("\nPlayer 2, choose your Pokemon!");
                String Pokemon2 = input.nextLine();
                System.out.println("Enter HP");
                int HP2 = Integer.parseInt(input.nextLine());
                System.out.println("Enter skill");
                String move2 = input.nextLine();
                System.out.println("Enter skill power");
                int power2 = Integer.parseInt(input.nextLine());
                System.out.println("Enter attack speed");
                int speed2 = Integer.parseInt(input.nextLine());

                while(true){
                    if (speed1 == speed2){
                        int num = random.nextInt(2);
                        if (num == 1){
                            speed1 ++;
                        } else{
                            speed2 ++;
                        }
                    }
                    if (speed1 > speed2){
                        System.out.println("\nPlayer 1's turn");
                        System.out.println(Pokemon1 + " uses " + move1);
                        HP2 = HP2 - power1;
                        if (HP2 <= 0){
                            System.out.println(Pokemon1 + " wins!");
                            wins1++;
                            break;}
                        System.out.println("\nPlayer 2's turn");
                        System.out.println(Pokemon2 + " uses " + move2);
                        HP1 = HP1 - power2;
                        if (HP1 <= 0){
                            System.out.println(Pokemon2 + " wins!");
                            wins2++;
                            break;}
                    }
                    else{
                        System.out.println("\nPlayer 2's turn");
                        System.out.println(Pokemon2 + " uses " + move2);
                        HP1 = HP1 - power2;
                        if (HP1 <= 0){
                            System.out.println(Pokemon2 + " wins!");
                            wins2++;
                            break;}
                        System.out.println("\nPlayer 1's turn");
                        System.out.println(Pokemon1 + " uses " + move1);
                        HP2 = HP2 - power1;
                        if (HP2 <= 0){
                            System.out.println(Pokemon1 + " wins!");
                            wins1++;
                            break;}
                    }
                }
                System.out.println("\nPlayer 1 Wins: " + wins1);
                System.out.println("Player 2 Wins: " + wins2);
            }
            if (wins1 > wins2) {
                System.out.println("\nPlayer 1 wins the game!");
            }
            else{
                System.out.println("\nPlayer 2 wins the game!");
            }



        }
    }


