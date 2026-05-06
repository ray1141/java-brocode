public class Variables {
    public static void main(String[] args){
        //        2. VARIABLES
        int age = 22;
        int year = 2026;
        int quantity = 1;
        System.out.println("My age is " + age);
        System.out.println("We are currently in year " + year);
        System.out.println("Please give me " + quantity + " packet of milk");
        double price = 23100000.00;
        double cgpa = 8.5;
        double temperature = -16.5;
        char grade = 'A';
        char symbol = '!';
        char currency = '₹';
        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = false;
        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }
        String name = "Anshika";
        String food = "chowmein";
        String email = "haha1608@gmail.com";
        String car = "range rover";
        String colour = "blue";
        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your final cgpa is " + cgpa);
        System.out.println("Your average grade is " + grade);
        System.out.println("Your choice is a " + colour + " " + year + " " + car);
        System.out.println("The price is " + currency + " " + String.format("%.2f", price));
        if(forSale) System.out.println("The car is for sale.");
        else System.out.println("The car is not for sale.");
    }
}
