import java.util.Scanner;
import java.util.Random;
public class diceRollerProgram {
    public static void main(String[] args) {

        //declare the variables
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numOfDice;
        int total=0;

        //user inputs number of dice roll
        System.out.print("Enter the number of dice: ");
        numOfDice = sc.nextInt();

        //check if number of dice > 0
        if(numOfDice>0){

            //roll all the dice
            for(int i=0; i<numOfDice; i++){
                int roll = rand.nextInt(1,7);
                System.out.println("You rolled a " + roll);
                displayDice(roll);
                //get the total
                total += roll;
            }
            System.out.println("Your total of all the roles is: " + total);
        }
        else System.out.println("Number of dice must be greater than 0");
        sc.close();

    }
    //display ASCII art
    static void displayDice(int roll){
        String dice1 = """
                -------
               |       |
               |   ●   |
               |       |
                -------
                """;
        String dice2 = """
                -------
               | ●     |
               |       |
               |     ● |
                -------
                """;
        String dice3 = """
                -------
               | ●     |
               |   ●   |
               |     ● |
                -------
                """;
        String dice4 = """
                -------
               | ●   ● |
               |       |
               | ●   ● |
                -------
                """;
        String dice5 = """
                -------
               | ●   ● |
               |   ●   |
               | ●   ● |
                -------
                """;
        String dice6 = """
                -------
               | ●   ● |
               | ●   ● |
               | ●   ● |
                -------
                """;
        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println();
        }
    }
}
