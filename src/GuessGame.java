import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;  // fixed number for demo

        try {
            System.out.println("Welcome to the Guessing Game!");
            System.out.print("Guess a number between 1 and 10: ");
            int guess = scanner.nextInt();  // risky line
            System.out.println("\n----------------------------------\n");

            if (guess == secretNumber) {
                System.out.println("🎉 Correct! You win!");
            } else {
                System.out.println("❌ Wrong guess. Try again next time.");
            }

        } catch (Exception e) {
            System.out.println("-------------------------------------------");
            System.out.println("⚠️ Invalid input! Please enter a number.");
            System.out.println("-------------------------------------------\n");

        } finally {
            System.out.println("Thanks for playing the game! 👋");
        }

        scanner.close();
    }
}
