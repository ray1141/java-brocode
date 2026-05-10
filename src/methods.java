public class methods {
    public static void main(String[] args) {
        String name = "Anshika";
        int age = 10;
//        happyBirthday(name,age);
        double num = 3;
//        double result = squareNum(num);
//        double result = cubeNum(num);
//        System.out.println(result);
//        String firstName = "Anshika";
//        String lastName = "Kumar";
//        String fullName = fullName(firstName, lastName);
//        System.out.println(fullName);
        System.out.println(ageChecker(age));
    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy birthday " + name + "!");
        System.out.println("You are " + age + " years old!");
    }
    static double squareNum(double num){
        return num*num;
    }
    static double cubeNum(double num){
        return Math.pow(num,3);
    }
    static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    static boolean ageChecker (int age){
        return age >= 18;
    }
}
