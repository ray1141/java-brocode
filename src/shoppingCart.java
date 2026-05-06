import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args){
        String itemName;
        double price;
        int quantity;
        Scanner sc = new Scanner(System.in);
        System.out.print("What item would you like to buy?: ");
        itemName = sc.nextLine();
        System.out.print("What is the price for each?: ");
        price = sc.nextDouble();
        System.out.print("How many would you like?: ");
        quantity = sc.nextInt();
        double total = price * quantity;
        System.out.println("\nYou have brought " + quantity + " " + itemName + "/s");
        System.out.println("Your total is Rs. " + total);
        sc.close();
    }
}
