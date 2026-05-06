import java.util.Scanner;
public class nestedIfStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isStudent;
        boolean isSenior;
        double price = 500;
        System.out.print("Are you a student? (true/false): ");
        isStudent = sc.nextBoolean();
        System.out.print("Are you a senior? (true/false): ");
        isSenior = sc.nextBoolean();
        if(isStudent){
            if(isSenior){
                System.out.println("Total discount is 30%, so final price is " + price*0.7);
            }
            else{
                System.out.println("Total discount is 10%, so final price is " + price*0.9);
            }
        }
        else if(isSenior){
            System.out.println("Total discount is 10%, so final price is " + price*0.8);
        }
        else{
            System.out.println("Total discount is 0%, so final price is " + price);
        }
    }
}
