import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,9,2,8,3,5,4};
        String[] fruits = {"apple", "mango", "banana"};
        boolean foundNum = false;
        boolean foundFruit = false;
        System.out.print("Enter the number to search: ");
        int targetNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the fruit to search: ");
        String targetFruit = sc.nextLine();
        int n =  nums.length;
        int m = fruits.length;

        //linear search
        for(int i=0; i<n; i++){
            if(targetNum==nums[i]){
                System.out.println("Element found at index " + i);
                foundNum = true;
                break;
            }
        }
        if(!foundNum) System.out.println("Element not found");

        for(int i=0; i<m; i++){
            if(targetFruit.equals(fruits[i])){
                System.out.println("Element found at index " + i);
                foundFruit = true;
                break;
            }
        }
        if(!foundFruit) System.out.println("Element not found");
        sc.close();
    }
}
