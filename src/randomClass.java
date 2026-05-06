import java.util.Random;
public class randomClass {
    public static void main(String[] args){
        Random random = new Random();
        int dice1;
        int dice2;
        int dice3;
        //rolling three dice
        dice1 = random.nextInt(1,7);
        dice2 = random.nextInt(1,7);
        dice3 = random.nextInt(1,7);
        System.out.println(dice1);
        System.out.println(dice2);
        System.out.println(dice3);

        //random with double
        double number = random.nextDouble();
        System.out.println(number);

        //random with boolean
        boolean isHeads = random.nextBoolean();
        if(isHeads) System.out.println("Heads");
        else System.out.println("Tails");
    }
}
