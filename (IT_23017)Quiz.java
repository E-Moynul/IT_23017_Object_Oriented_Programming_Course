///IT_23017
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "1. Who wrote 'Introduction to Java' Book?",
            "2. What is the use of Fast Fourier Transform?",
            "3. Which one is String Algorithm?",
            "4. What is Time Complexity of Ternary Search?",
            "5. Who is Highest Ranked in Codeforces from BD?"
        };

        String[] options = {
            "a) Charles\nb) Liang\nc) Rowling\nd) Twain",
            "a) CP\nb) Signal Processing\nc) Gaming\nd) a,b",
            "a) Suffix array\nb) KMP/Z\nc) Aho/Corasick\nd) All",
            "a) log3(n)\nb) n\nc) log2(n)\nd) n*n",
            "a) Dominater\nb) Shohag\nc) Upobir\nd) Tourist"
        };

        char[] answers = {'b', 'd', 'd', 'a', 'c'};
        int score = 0;

        System.out.println("Welcome to the High School General Knowledge Quiz!");
        System.out.println("Please enter the letter of your choice (a, b, c, d):\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.print("Your answer: ");
            char userAnswer = scanner.next().toLowerCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + answers[i] + "\n");
            }
        }

        System.out.println("Quiz Over!");
        System.out.println("Your final score: " + score + " out of " + questions.length);

        scanner.close();
    }
}
