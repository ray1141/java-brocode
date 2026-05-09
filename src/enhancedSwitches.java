import java.util.Scanner;
public class enhancedSwitches {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = sc.nextLine();

//        switch(day){
//            case "Monday" -> System.out.println("Weekday");
//            case "Tuesday" -> System.out.println("Weekday");
//            case "Wednesday" -> System.out.println("Weekday");
//            case "Thursday" -> System.out.println("Weekday");
//            case "Friday" -> System.out.println("Weekday");
//            case "Saturday" -> System.out.println("Weekend");
//            case "Sunday" -> System.out.println("Weekend");
//            default -> System.out.println("Not a valid day");
//        }
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Not a valid day");
        }
    }
}
