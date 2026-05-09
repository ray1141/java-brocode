import java.util.Scanner;
public class tempConverter {
        public static void main(String[] args) {
            //temperature converter
            Scanner sc = new Scanner(System.in);
            double temp;
            double convertedTemp;
            String unit;

            System.out.print("Enter the temperature: ");
            temp = sc.nextDouble();
            // sc.nextLine();
            System.out.print("Convert to Celcius or Fahrenheit(C/F): ");
            unit = sc.next();

            convertedTemp = (unit.equalsIgnoreCase("C")) ? ((temp - 32) * (5 / 9)) : ((temp * 1.8) + 32);

            System.out.printf("Converted temperature is %.1f %s", convertedTemp, unit.toUpperCase());

            sc.close();

        }
}
