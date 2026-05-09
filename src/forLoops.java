import java.util.Scanner;
public class forLoops {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc =  new Scanner(System.in);
//        System.out.print("How many times you want to loop?: ");
//        int n = sc.nextInt();
//        for(int i = 0; i<n; i++){
//            System.out.println(i);
//        }
        //countdown
        int countdown;
        System.out.print("Enter the number of seconds to countdown from: ");
        countdown = sc.nextInt();
        for(int i = countdown; i>0; i--){
            System.out.println("T-"+i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!");
        sc.close();
    }
}
