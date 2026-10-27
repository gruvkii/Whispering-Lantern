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
            if (choice < min || choice > max) {
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
        //Pre Story Printing Needs Here
        input.nextLine(); // Press Enter to Continue

        while (oil > 0 && minutesLeft > 0 && distanceToTravel > 0) {
            int clockMinutes = 15 + (45 - minutesLeft);
            String clock;
            if (clockMinutes >= 60) {
                clock = "3:00 AM";
            } else {
                clock = "2" + clockMinutes + " AM";
            }
            System.out.println("Clock: " + clock);
            System.out.println("Lantern oil:" + oil + "%");
            System.out.println("Minutes left:" + minutesLeft);
            System.out.println("Steps to Home: " + distanceToTravel);
            if (oil <= 25){
                System.out.println("The Flame shrinks to a treambling baed, Shadows lean Closer." + RESET);
            }
            if (minutesLeft <= 10){
                System.out.println(AMBER+ "High above the fog , the bell tower groans, getting ready." + RESET);
            }

            System.out.println();
        }
    }

}