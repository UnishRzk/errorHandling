import java.util.Scanner;

public class ExampleCode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try{
            int result = 10/0;
        } catch (ArithmeticException err){
            System.out.println(err.getMessage());
        } finally {
            System.out.println("Always executed");
        }
    }
}
