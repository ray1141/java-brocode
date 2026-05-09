import java.util.Scanner;
public class nestedLoops {
    public static void main(String[] args) {
        //creating matrix of symbol input by user
        int rows;
        int cols;
        char symbol;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = sc.nextInt();
        System.out.print("Enter the symbol: ");
        symbol = sc.next().charAt(0);
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
