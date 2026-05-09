import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name = "";
//        while(name.equals("")) {
//            System.out.print("Enter your name: ");
//            name = sc.nextLine();
//        }
//        System.out.println("Your name is: " + name);
//        String response = "";
//        while(!response.equalsIgnoreCase("Q")){
//            System.out.print("Press Q to exit:");
//            response = sc.nextLine();
//        }
        int age = 0;
//        System.out.print("Enter your age: ");
//        age = sc.nextInt();
//        while(age<0){
//            System.out.println("Age cannot be negative.");
//            System.out.print("Enter your age: ");
//            age = sc.nextInt();
//        }
//        do{
//            System.out.println("Age cannot be negative.");
//            System.out.print("Enter your age: ");
//            age = sc.nextInt();
//        }while(age<0);
        int num = 0;
//        while(num<1 || num>10){
//            System.out.println("Please enter a number between 1 and 10");
//            System.out.print("What is your number? ");
//            num = sc.nextInt();
//        }
        do{
            System.out.println("Please enter a number between 1 and 10");
            System.out.print("What is your number? ");
            num = sc.nextInt();
        }while(num<1 || num>10);
    }
}
