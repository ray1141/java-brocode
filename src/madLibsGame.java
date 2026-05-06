import java.util.Scanner;
public class madLibsGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the following:-");
        System.out.print("Enter an adjective: ");
        String adj1 = sc.nextLine();
        System.out.print("Enter an adjective again: ");
        String adj2 = sc.nextLine();
        System.out.print("Enter a noun(type of bird): ");
        String noun1 = sc.nextLine();
        System.out.print("Enter a noun(room in a house) again: ");
        String noun2 = sc.nextLine();
        System.out.print("Enter a verb(in past tense): ");
        String verb1 = sc.nextLine();
        System.out.print("Enter a verb again: ");
        String verb2 = sc.nextLine();
        System.out.print("Enter a noun(relative's name): ");
        String noun3 = sc.nextLine();
        System.out.print("Enter a noun again: ");
        String noun4 = sc.nextLine();
        System.out.print("Enter a noun(liquid): ");
        String noun5 = sc.nextLine();
        System.out.print("Enter a verb ending in -ing: ");
        String verb3 = sc.nextLine();
        System.out.print("Enter a noun(part of the body(plural)) again: ");
        String noun6 = sc.nextLine();
        System.out.print("Enter a plural noun: ");
        String noun7 = sc.nextLine();
        System.out.print("Enter a verb again(ending in -ing): ");
        String verb4 = sc.nextLine();
        System.out.print("Enter a noun finally: ");
        String noun8 = sc.nextLine();
        System.out.println("Your funny story is :D");
        System.out.println("It was a " + adj1 + ", cold November day. I woke up to the " + adj2 + " smell of " + noun1 + " roasting in the " + noun2 + " downstairs.");
        System.out.println("I " + verb1 + " down the stairs to see if I could help " + verb2 + " the dinner.");
        System.out.println("My mom said, \"See if " + noun3 + " needs a fresh " + noun4 + ".\"");
        System.out.println("So I carried a tray of glasses full of " + noun5 + " into the " + verb3 + " room.");
        System.out.println("When I got there, I couldn't believe my " + noun6 + "! There were\n " + noun7 + " " + verb4 + " on the " + noun8 + "!" );
        sc.close();
    }
}
