import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args){

        double length = 0;
        double breadth = 0;
        double area = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
        area = length*breadth;
        System.out.println("The area of rectangle is " + area + " sq units.");
        sc.close();
    }
}
