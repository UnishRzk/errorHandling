import java.util.Scanner;

public class BattleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerHealth = 100;
        int enemyHealth = 80;

        try {
            System.out.println("⚔️ Battle Start!");
            System.out.println("Enemy Health: " + enemyHealth);

            System.out.print("Choose your move (1 = Slash, 2 = Fireball): ");
            int move = scanner.nextInt(); // risky input

            int damage = 0;

            if (move == 1) {
                damage = 20;
                System.out.println("You used SLASH! 🗡️");
            } else if (move == 2) {
                damage = 30;
                System.out.println("You cast FIREBALL! 🔥");
            } else {
                throw new IllegalArgumentException("Invalid move chosen!");
            }

            enemyHealth -= damage;
            System.out.println("You dealt " + damage + " damage!");

        } catch (Exception e) {
            System.out.println("⚠️ Error during your turn: " + e);
            System.out.println("⚠️ Make sure to choose a valid move next turn.");
        } finally {
            System.out.println("🔁 Turn ended. Checking game state...");
            System.out.println("Player Health: " + playerHealth);
            System.out.println("Enemy Health: " + enemyHealth);

        }

        scanner.close();
    }
}
