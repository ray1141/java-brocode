import java.util.Scanner;
public class userInputInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        sc.nextLine();
        //initialising an Array
        String[] fruits = new String[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the fruit: ");
            fruits[i] = sc.nextLine();
        }
        for(String fruit: fruits){
            System.out.println(fruit);
        }

    }
}
