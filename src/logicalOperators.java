import java.util.Scanner;
public class logicalOperators {
    public static void main(String[] args) {
        //valid username check
        //username must be 4-12 chars long
        //not contain spaces or underscores
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = sc.nextLine();
        int len = username.length();
        if(len>=4 && len<=12 && !username.contains(" ") && !username.contains("_")) System.out.println("Valid username");
        else {
            System.out.println("Invalid username. The username should be 4-12 characters long and it should not contain any spaces or underscores.");
        }
        sc.close();
    }
}
