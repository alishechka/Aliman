package introduction;

import java.util.Scanner;

public class WelcomePage {

    private boolean running = true;

    public void intro() {
        System.out.println("\t###############################");
        System.out.println("\t###############################");
        System.out.println("\t###############################");
        System.out.println("\t##### WELCOME STRANGER ########");
        System.out.println("\t##### YOU ARE ABOUT TO ########");
        System.out.println("\t##### EMBARK ON JURNEY ########");
        System.out.println("\t##### OF EPIC PROPRTNS ########");
        System.out.println("\t###############################");
        System.out.println("\t###############################");
        System.out.println("\t###############################");
        System.out.println("\t>>> Select you Hero Class");
        System.out.println("\t>>> you must type this in");

        while (running) {
//        System.out.println("\t Assasin");
//        System.out.println("\t Warrior");
//        System.out.println("\t Mage");


            String[] hero = {"1: Assassin", "2: Warrior", "3: Mage"};

            for (int i = 0; i < hero.length; i++) {
                System.out.println(hero[i]);
            }
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("\t You have chosen the Agile and Stealthy Assassin Class");
            } else if (input.equals("2")) {
                System.out.println("\t You have chosen the a class of brutal Strength");
            } else if (input.equals("3")) {
                System.out.println("\t You have chosen one of great energies");
            } else if (input.equals("0")) {
                running = false;
            } else {
                System.out.println("\t INVALID COMMAND , TRY AGAIN");
            }
        }
    }
}
