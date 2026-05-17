import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        String[] fruits = {"apple","mango","banana","pear"};
        System.out.println(fruits);
        System.out.println(fruits[0]);
        fruits[0] = "pineapple";
        System.out.println(fruits[0]);
        int len = fruits.length;
        for(int i=0; i<len; i++){
            System.out.println(fruits[i]);
        }
        //enhanced for
        for(String fruit: fruits){
            System.out.println(fruit);
        }
        //sorting
        Arrays.sort(fruits);
        for(String fruit: fruits){
            System.out.println(fruit);
        }
        //filling array
        Arrays.fill(fruits,"pomegranate");
        for(String fruit: fruits){
            System.out.println(fruit);
        }

    }
}
