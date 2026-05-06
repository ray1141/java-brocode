import java.util.Scanner;
public class mathClassEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //HYPOTENUSE
//        double base;
//        double height;
//        double hypotenuse;
//        System.out.print("Enter the base: ");
//        base = sc.nextDouble();
//        System.out.print("Enter the height: ");
//        height = sc.nextDouble();
//        hypotenuse = Math.sqrt(Math.pow(base,2) + Math.pow(height,2));
//        System.out.println("Hypotenuse is: " + hypotenuse + " units");
        //PERIMETER AND AREA OF CIRCLE + VOLUME OF SPHERE
        double radius;
        double perimeter;
        double area;
        double volume;
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        perimeter = 2*(Math.PI)*radius;
        area = (Math.PI)*(Math.pow(radius,2));
        volume = (4/3.0)*(Math.PI)*Math.pow(radius,3);
        System.out.println("Perimeter of circle = " + perimeter + " units");
        System.out.println("Area of circle = " + area + " sq units");
        System.out.println("Volume of sphere = " + volume + " cubic units");
        sc.close();
    }
}
