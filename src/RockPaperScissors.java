import java.util.Scanner;
public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String playAgain = "";
        boolean done = false;
        boolean done2 = false;
        do {
            done = false;
            done2 = false;
            do {
                System.out.print("Player A what is your move (R, P, or S): ");
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                    done = true;
                } else {
                    System.out.println("Invalid move, please enter R P or S");
                }
            } while (!done);
            do {
                System.out.print("Player B what is your move (R, P or S): ");
                playerB = in.nextLine();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                    done2 = true;
                } else {
                    System.out.println("Invalid move, please enter R P or S");
                }
            } while (!done2);
            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock it's a tie!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock, Player B wins!");
                } else {
                    System.out.println("Rock breaks Scissors, Player A wins!");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock, Player A wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper, it's a tie!");
                } else {
                    System.out.println("Scissors cuts Paper, Player B wins!");
                }
            } else if (playerA.equalsIgnoreCase("S")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors, Player B wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper, Player A wins!");
                } else {
                    System.out.println("Scissors vs Scissors, it's a tie!");
                }
            }
            System.out.print("Would you like to play again? [Y/N]: ");
            playAgain = in.nextLine();
        } while (playAgain.equalsIgnoreCase("Y"));
    }
}
