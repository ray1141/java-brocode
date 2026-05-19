import java.util.Scanner;
import java.util.Random;
public class slotMachine {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        //JAVA SLOT MACHINE

        //declare variables
        String[] slotChoices = {"💐","😊","😂","❤️"};
        double balance = 100;
        double bet;
        char playAgain = 'y';

        //display welcome message
        System.out.println("Welcome to Slot Machine!");
        System.out.println("Your available slots are: ");
        for(String s: slotChoices){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("*************************");
        System.out.println("Your balance is: " + balance);

        do{
            //play if balance>0
            if(balance<=0){
                System.out.println("Insufficient balance.");
                break;
            }

            //bet amount input from user
            System.out.print("Enter your bet amount: ");
            bet = sc.nextDouble();

            //bet should be less than balance
            if(bet>balance){
                System.out.println("Bet should be less than or equal to balance.");
                break;
            }

            //bet should be greater than zero
            else if(bet<=0){
                System.out.println("Insufficient bet.");
                break;
            }
            else{
                //subtract bet from balance
                balance -= bet;

                //spin our row
                System.out.println("Spinning the wheel....");

                //print row
                String[] row = spinRow(slotChoices);

                //get payout
                double payout = getPayout(row,bet);
                if(payout == 0) System.out.println("You lost! Your balance is: " + balance);
                else{
                    balance += payout;
                    System.out.println("You win! your balance is: " + balance);
                }
                //ask to play again
                System.out.print("Do you want to play again?(y/n): ");
                playAgain = sc.next().charAt(0);
            }
        }while(playAgain=='y'||playAgain=='Y');

            //display exit message
        System.out.println("Thank you for playing.");
        sc.close();
    }
    static String[] spinRow(String[] slotChoices){
        int n = slotChoices.length;
        String[] wheel = new String[3];
        for(int i=0; i<3; i++){
            wheel[i] = slotChoices[rand.nextInt(slotChoices.length)];
        }
        for(String s: wheel){
            System.out.print(" | " + s);
        }
        System.out.print(" |\n");
        return wheel;
    }
    static double getPayout(String[] row, double bet){
        double payout = 0;
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            switch(row[0]){
                case "💐" -> payout = bet*2;
                case "😊" -> payout = bet*3;
                case "😂" -> payout = bet*4;
                case "❤️" -> payout = bet*5;
                default -> payout = 0;
            }
        }
        else if(row[0].equals(row[1]) || row[1].equals(row[2])){
            switch(row[0]){
                case "💐" -> payout = bet*1.5;
                case "😊" -> payout = bet*2;
                case "😂" -> payout = bet*2.5;
                case "❤️" -> payout = bet*3;
                default -> payout = 0;
            }
        }
        else payout = 0;
        return payout;
    }
}
