import java.util.Scanner;
import java.util.Random;
public class numberGuessingGame {
    public static void main(String[] args) {
        //number guessing game between 1 and 100
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int attempts;
        int max;
        int min;
        System.out.println("WELCOME TO NUMBER GUESSING GAME!");
        System.out.print("Enter min: ");
        min = sc.nextInt();
        System.out.print("Enter max: ");
        max = sc.nextInt();
        System.out.print("Enter number of attempts allowed: ");
        attempts = sc.nextInt();
        int randomNum = random.nextInt(min,max+1);
        while(attempts>0){
            System.out.printf("Enter guess between %d and %d: ",min,max);
            guess = sc.nextInt();
            if(guess<min || guess>max) System.out.println("Invalid guess");
            else if(guess==randomNum){
                System.out.println("Congratulations! You guessed it!");
                break;
            }
            else if(guess>randomNum) System.out.println("Too HIGH!");
            else System.out.println("Too LOW!");
            attempts--;
        }
        System.out.println("You are out of guesses!");
        sc.close();
    }
}
