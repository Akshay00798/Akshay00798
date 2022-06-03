/**
 * Gues the  number
 */
import java.util.Scanner;
import java.util.Random;
public class Number_Game {

    public static void main(String[] args) {
        System.out.println("Welcome to Guess the Number Game !");

  /**
  * Next 2 lines for generating a random number from computer within a certain limit
   */
        Random num = new Random();
        int Computer_Move = num.nextInt(5 - 1) + 1;
        
        Scanner x = new Scanner(System.in);

        int Human_Move;
        System.out.println("Enter your Guess between 1 to 5");
        Human_Move = x.nextInt();

        if (Human_Move == Computer_Move) {
            System.out.println("You win ");
        } else {
            System.out.println("Computer chose: " + Computer_Move);
            System.out.println("You lose");
        }
    }
}
