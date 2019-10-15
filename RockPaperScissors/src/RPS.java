import java.util.Random;
import java.util.Scanner;

public class RPS {

    private static boolean playAgain(Scanner scanner) {
        System.out.println("Would you like to go again? Y(9), N(0)?");

        switch(scanner.nextInt()) {
            default:
                System.out.println("Thanks for playing! Cred: Toussaint Turnier");
                return false;

            case 9:
                System.out.println("Rock, Paper, Scissors SHOOT!");
                return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RPSinterface computer = new CPU(new Random());
        RPSinterface human = new HumanPlayer(scanner);

        System.out.println("Rock Paper Scissors");
        do {
            String comp = computer.play();
            String user = human.play();
            System.out.printf("%s vs. %s", comp, user);

            if (user.equals(comp)) {
                System.out.println("TIE");
            }

            else if ( ("Rock".equals(user) && "Scissors".equals(comp)) ||
                    ("Scissors".equals(user) && "Paper".equals(comp)) ||
                    ("Paper".equals(user) && "Rock".equals(comp)) ) {
                System.out.println("! You win!");
            } else {

                assert (("Scissors".equals(user)) && "Rock".equals(comp)  ||
                        ("Paper".equals(user)) && "Scissors".equals(comp) ||
                        "Rock".equals(user) &&("Paper".equals(comp)));
                System.out.println("! You lose!");
            }
        } while (playAgain(scanner));
    }
}
