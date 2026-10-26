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
            if (choic < min || choice > max){
                System.out.println(DIM + "(Please choose a number from" + min + "to" + max + ".)"+ RESET);
            }
            System.out.println();
            return choice;
        }
    }
}