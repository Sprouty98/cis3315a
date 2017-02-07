package week2;


import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Dan
 */
public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100);
        int tries = 0;
        Scanner sc = new Scanner(System.in);
        int guess;
        boolean win = false;
        
        while(win == false) {
            
            System.out.println("Guess a number between 1 and 100");
            guess = sc.nextInt();
            tries++;
            
            if(guess == num) {
                win = true;
            }
            else if(guess < num) {
                System.out.println("Your guess is too low");
            }
            else if(guess > num) {
                System.out.println("Your guess is too high");
            }
        }
        
        System.out.println("You win!");
        System.out.println("The number was " + num);
        System.out.println("It took you " + tries + " tries");
    }
}
