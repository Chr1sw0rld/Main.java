
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        String playAgain;

        do {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Total: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lose!");
            }
            else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win!");
            }
            else {
                int point = sum;
                boolean gameOver = false;

                System.out.println("Point is: " + point);

                while (!gameOver) {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    sum = die1 + die2;

                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Total: " + sum);

                    if (sum == point) {
                        System.out.println("Made point! You win!");
                        gameOver = true;
                    }
                    else if (sum == 7) {
                        System.out.println("Got a seven! You lose!");
                        gameOver = true;
                    }
                    else {
                        System.out.println(
                                "Trying for point: " + point
                        );
                    }
                }
            }

            System.out.println("Play again? (yes/no)");
            playAgain = input.nextLine();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        input.close();
    }
}

