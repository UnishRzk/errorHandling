import java.util.Scanner;

//RuntimeException // super(message); //String message


class AafnoException extends Exception {
    public AafnoException(String message)  {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 18) {
                throw new AafnoException("Access denied - You must be at least 18 years old.");
            } else {
                System.out.println("Access granted - You are old enough!");
            }

        } catch (AafnoException e) {
            System.out.println("⚠️ Exception caught: " + e);
        }
    }
}
