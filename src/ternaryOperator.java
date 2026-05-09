public class ternaryOperator {
    public static void main(String[] args) {
        //ternary operator
        int score = 55;
        String passOrFail = (score>=60) ? "Pass" : "Fail";
        System.out.println(passOrFail);

        int num = 6;
        String evenOrOdd = ((num&1)==1) ? "Odd" : "Even";
        System.out.println(evenOrOdd);

        int hours = 21;
        String timeOfDay = (hours<12) ? "AM" : "PM";
        System.out.println(timeOfDay);

        double income = 70000;
        double taxRate = (income>=50000) ? 0.35 : 0.25;
        System.out.println(taxRate);
    }
}
