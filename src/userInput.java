import java.util.Scanner;

public class userInput {
    public static void main(String[] args){
        //creating scanner object
        Scanner sc = new Scanner (System.in);

//        //input string
//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.println("Hello " + name);
//
//        //input integer
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        System.out.println("Your age is " + age);
//
//        //input double
//        System.out.print("What is your CGPA? ");
//        double cgpa = sc.nextDouble();
//        System.out.println("Your cgpa is " + cgpa);
//
//        //input boolean
//        System.out.print("Are you a student currently?(true/false): ");
//        boolean isStudent = sc.nextBoolean();
//        if(isStudent) System.out.println("You are currently a student");
//        else System.out.println("You are currently not a student");

        //COMMON ISSUES
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); //to read extra "\n" after hitting enter key while inputting age
        System.out.print("Enter your favourite colour: ");
        String colour = sc.nextLine();
        System.out.println("Age is: " + age);
        System.out.println("Colour is : "  + colour);

        sc.close();

    }
}
