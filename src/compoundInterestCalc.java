import java.util.Scanner;
public class compoundInterestCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notional;
        double rate;
        double tenor;
        double frequency;
        double amount;
        System.out.print("Enter notional amount: ");
        notional = sc.nextDouble();
        System.out.print("Enter rate of interest per year(in %): ");
        rate = sc.nextDouble();
        System.out.print("Enter compounding frequency: ");
        frequency = sc.nextDouble();
        System.out.print("Enter tenor: ");
        tenor = sc.nextDouble();
        amount = notional*(Math.pow((1+rate/(100.0*frequency)),(tenor*frequency)));
        System.out.printf("Total settled amount is Rs. %,.2f\n", amount);
        sc.close();

    }
}
