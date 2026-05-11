import java.util.Scanner;
public class bankingProgram {
    static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
        //BEGINNER FRIENDLY JAVA BANKING PROGRAM
        //declare variables
        double balance=0;
        boolean isRunning = true;
        char choice;

        //display menu
        while(isRunning){
            System.out.println("**** BANKING PROGRAM ****");
            System.out.println("List of choices available:");
            System.out.println("1 - Show balance");
            System.out.println("2 - Deposit amount");
            System.out.println("3 - Withdraw amount:");
            System.out.println("Press any other key to exit.");
            System.out.print("Enter your choice: ");

            // get and process user input
            choice = sc.next().charAt(0);
            switch(choice){
                case '1' -> showBalance(balance);
                case '2' -> balance += deposit(balance);
                case '3' -> balance -= withdraw(balance);
                default -> isRunning = false;
            }
        }
        sc.close();
        //exit message
        System.out.println("Thank you for using our banking program.");
    }

    //method of showBalance
    static void showBalance(double balance){
        System.out.printf("Your account balance = %.2f\n", balance);
    }

    //method of deposit
    static double deposit(double balance){
        double amount;
        System.out.print("Enter amount to deposit: ");
        amount = sc.nextDouble();
        if(amount<0){
            System.out.println("Invalid amount");
            return 0;
        }
        else{
            System.out.printf("%.2f has been deposited\n", amount);
            return amount;
        }
    }

    // method of withdraw
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = sc.nextDouble();
        if(amount<0) System.out.println("Invalid amount");
        else if(amount>balance) System.out.println("Not sufficient balance");
        else{
            System.out.printf("%.2f amount has been withdrawn\n", amount);
            return amount;
        }
        return 0;
    }
}
