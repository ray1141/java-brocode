import java.util.Scanner;
public class quizGame {
    public static void main(String[] args){
    //JAVA QUIZ GAME

    //questions array
    String[] questions = {"What is the capital of India?",
            "Which planet is known as the Red Planet?", "How many days are there in a week?",
            "Which animal is called the King of the Jungle?",
            "What do bees make?"
    };

    //options array
    String[][] options = {
            {"1. Mumbai", "2. New Delhi", "3. Kolkata", "4. Chennai"},
            {"1. Venus", "2. Jupiter", "3. Mars", "4. Saturn"},
            {"1. 5", "2. 6", "3. 7", "4. 8"},
            {"1. Tiger", "2. Elephant", "3. Lion", "4. Bear"},
            {"1. Milk", "2. Honey", "3. Bread", "4. Butter"}
    };

    //variables
    int[] answers = {2, 3, 3, 3, 2};
    int total = 0;
    int guess;
    Scanner sc = new Scanner(System.in);

    //welcome message
		System.out.println("********WELCOME TO JAVA QUIZ GAME!********");
		System.out.println("******************************************");
		System.out.println("Answer the following questions and know your total score at the end.");

    //list questions in a loop -
    int n = questions.length;
    for(int i = 0; i<n;i++) {
        System.out.println(questions[i]);

        //list options
        for(String option: options[i] ){
            System.out.println(option);
        }

        //check guess
        System.out.print("Enter your guess: ");
        guess = sc.nextInt();
        if(guess==answers[i]){
            System.out.println("Congratulations! You guessed it!");
            total+=1;
        }
        else{
            System.out.println("Wrong guess!");
        }
    }

    //display final score
        System.out.println("Your final score is: " + total + " out of " + n);
		sc.close();
}
}
