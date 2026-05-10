public class overloadedMethods {
    public static void main (String[] args) {
        //methods should have unique signatures (name + parameters)
//        double result = add(2,3,4,5);
//        System.out.println(result);
        String pizza = bakePizza("Thin crust", "mozzarella");
        System.out.println(pizza);
    }
    static double add (double num1, double num2){
        return num1 + num2;
    }
    static double add (double num1, double num2, int num3){
        return num1 + num2 + num3;
    }
    static double add (double num1, double num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return bread + " " + cheese + " pizza";
    }
}
