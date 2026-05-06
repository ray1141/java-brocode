import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args){
        int age;
        String name;
        boolean isStudent;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Are you a student (true/false): ");
        isStudent = sc.nextBoolean();

        //GROUP 1
        if(name.isEmpty()) System.out.println("You have not entered your name!");
        else System.out.println("Hello " + name + "!");

        //GROUP 2
        if(age>=18){
            System.out.println("You are an adult!");
        }
        else if(age==0){
            System.out.println("You are a baby!");
        }
        else if(age<0) {
            System.out.println("You are not born yet!");
        }
        else{
            System.out.println("You are a child!");
        }

        //GROUP 3
        if(isStudent) System.out.println("You are a student!");
        else System.out.println("You are not a student!");

        sc.close();
    }
}
