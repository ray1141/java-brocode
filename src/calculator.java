import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        double num1,num2,result=0;
        char operator;
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
        System.out.print("Enter operator(+,-,*,/,^): ");
        operator = sc.next().charAt(0); //next() method returns a string. We can use charAt() method to retrieve a char

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2!=0) result = num1 / num2;
                else{
                    flag=false;
                    System.out.println("Cannot divide by zero");
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> {
                flag=false;
                System.out.println("Invalid input");
            }
        }
        if(flag) System.out.println("Result is: " + result);
        sc.close();
    }
}
