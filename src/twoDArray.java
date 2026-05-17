public class twoDArray {
    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "orange"};
        String[] veggies = {"tomato", "onion", "potato"};
        String[] meats = {"chicken", "pork", "beef"};

        //2D array
        String[][] groceries = {fruits,veggies,meats};
        groceries[0][0] = "pineapple";
        groceries[1][0] = "celery";
        groceries[2][1] = "eggs";
//        for(String[] foods: groceries) {
//            for(String food: foods) {
//                System.out.print(food + " ");
//            }
//            System.out.println();
//        }
        //building a number pad
        char[][] numPad = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'}};
        for(char[] num: numPad){
            for(char c: num){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
