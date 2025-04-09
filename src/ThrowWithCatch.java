import java.util.Scanner;

public class ThrowWithCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 18) {
                throw new ArithmeticException();
            } else {
                System.out.println("Access granted - You are old enough!");
            }

        } catch (ArithmeticException e) {
            System.out.println("⚠️ Exception caught: " + e);
        } finally {
            System.out.println("Program ended.");
            scanner.close();
        }
    }
}
