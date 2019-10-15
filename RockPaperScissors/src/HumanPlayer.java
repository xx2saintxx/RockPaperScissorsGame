import java.util.Scanner;

public class HumanPlayer implements RPSinterface {
    private final Scanner scanner;

    public HumanPlayer(Scanner scanner) {
        this.scanner = scanner;
    }

    public String play() {
        System.out.println("PRESS: 1 for Rock, 2 for Paper, or 3 for Scissors");
        int choice = this.scanner.nextInt();
        return CHOICES[choice - 1];
    }
}