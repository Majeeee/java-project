package se.majid.project;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("Enter Player 1");
        Scanner playerObject1 = new Scanner(System.in); // Create a Scanner object
        String playerName1 = playerObject1.nextLine();
        Player player1 = new Player(playerName1);

        System.out.println("Enter Player 2");
        Scanner playerObject2 = new Scanner(System.in); // Create a Scanner object
        String playerName2 = playerObject2.nextLine();

        int roll1 = random.nextInt(6) + 1; // Ger ett tal mellan 1 och 6
        System.out.println(playerName1 + "! " + " Du kastade: " + roll1);

        int roll2 = random.nextInt(6) + 1; // Ger ett tal mellan 1 och 6
        System.out.println(playerName2 + "! " + "Du kastade: " + roll2);

        if (roll1 > roll2) {
            System.out.println("Grattis " + playerName1 + "! Du är vinnare!");
        } else if (roll2 > roll1) {
            System.out.println("Grattis " + playerName2 + "! Du är vinnare!");
        } else {
            System.out.println("Vi har ingen vinnare, Försök igen! ");
        }


    }
}

