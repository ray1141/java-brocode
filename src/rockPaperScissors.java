import java.util.Scanner;
import java.util.Random;
public class rockPaperScissors {
    public static void main(String[] args){
        //ROCK PAPER SCISSORS GAME

        //declare variables
        Scanner sc =  new Scanner(System.in);
        Random rand = new Random();
        String choices[] = {"Rock", "Paper", "Scissor"};
        boolean playAgain = true;

        //get choice from user
        System.out.println("Welcome to Rock Paper Scissors!");
        while(playAgain){
            System.out.print("Enter your choice: ");
            String userChoice = sc.nextLine();

            //get random choice for the computer
            String ComputerChoice = choices[rand.nextInt(0,3)];
            System.out.println("Computer's choice: " + ComputerChoice);

            //check win conditions
            if(userChoice.equals(ComputerChoice)){
                System.out.println("It's a TIE!");
            }
            else if(userChoice.equals("Rock")){
                if(ComputerChoice.equals("Paper")){
                    System.out.println("Computer Wins!");
                }
                else System.out.println("User Wins!");
            }
            else if(userChoice.equals("Paper")){
                if(ComputerChoice.equals("Rock")){
                    System.out.println("User Wins!");
                }
                else System.out.println("Computer Wins!");
            }
            else if(userChoice.equals("Scissor")){
                if(ComputerChoice.equals("Paper")){
                    System.out.println("User Wins!");
                }
                else System.out.println("Computer Wins!");
            }
            else{
                System.out.println("Invalid choice.");
            }

            //ask to play again
            System.out.print("Do you want to play again?(true/false): ");
            playAgain = sc.nextBoolean();
            sc.nextLine();
        }

        //good bye message
        System.out.println("Thanks for playing!");
        sc.close();
    }
}
