import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            // Throwing an exception manually
            throw new ArithmeticException("Access denied - You are not old enough");
        } else {
            System.out.println("Access granted - You are old enough!");
        }

        scanner.close();
    }
}
