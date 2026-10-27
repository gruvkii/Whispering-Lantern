import java.util.Random;
import java.util.Scanner;

public class WhisperingLantern {
    // COLORS FOR DIFFERENT Environment
    static final String RESET = "\u001B[0m";
    static final String TEAL = "\u001B[38;5;37m";
    static final String AMBER = "\u001B[38;5;214m";
    static final String RED = "\u001B[38;5;196m";
    static final String GREEN = "\u001B[38;5;78m";
    static final String DIM = "\u001B[2m";

    static int askChoice(Scanner input, int min, int max) {
        int choice = -1;
        while (choice < min || choice > max) {
            System.out.print("> ");
            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                input.next();
            }
            if (choic < min || choice > max) {
                System.out.println(DIM + "(Please choose a number from" + min + "to" + max + ".)" + RESET);
            }
        }
        System.out.println();
        return choice;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int oil = 100;
        int minutesLeft = 45;
        int distanceToTravel = 6;

        int ghostTrust = 0;
        int ghostTalks = 0;
        boolean helpedChild = false;
        boolean tookKey = false;
        boolean childSceneDone = false;

        System.out.println();
        input.nextLine(); // Press Enter to Continue


    }

}