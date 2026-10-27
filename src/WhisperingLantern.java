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
            if (oil <= 25) {
                System.out.println("The Flame shrinks to a treambling baed, Shadows lean Closer." + RESET);
            }
            if (minutesLeft <= 10) {
                System.out.println(AMBER + "High above the fog , the bell tower groans, getting ready." + RESET);
            }

            System.out.println();

            System.out.println("What will you do ? ");
            System.out.println("  1. Press on through the scary fog Forest ! ");
            System.out.println(" 2. Cut the burnt end of a candle’s wick so it burns properly ");
            if (ghostTalks == 0) {
                System.out.println(" 3. Call out to the pale shape drifting between the stones");
            } else {
                System.out.println(" 3. Talk to Arthur the ghost ");
            }
            int choice = askChoice(input, 1, 3);

            if (choice == 1) {
                distanceToTravel = distanceToTravel - 1;
                oil = oil - 10;
                minutesLeft = minutesLeft - 5;
                int flavor = random.nextInt(3);
                if (flavor == 0) {
                    System.out.println("Wet grass drags at your boots! A crooked angel watches you pass away -_-");
                } else if (flavor == 1) {
                    System.out.println("You count your steps aloud, Just to hear human voice and Scared af !");
                } else {
                    System.out.println("Something small crawl away from the light. you decided not to look!");
                }
                System.out.println(DIM + "One step Closer. The flame drank 18% of the oil." + RESET);
            } else if (choice == 2 ){
                oil = oil + 12 ;
                if (oil > 100 ){
                    oil = 100;
                }
                minutesLeft = minutesLeft - 5;
                System.out.println("You Kneel on the cold ground and steady you shaking Hands!");
                System.out.println("The flame steadies and turns a warmer gold (+12% oil ) ");
                System.out.println(DIM + "But the minutes keep going, and they never look Back."+ RESET);
            }
            else {
                minutesLeft = minutesLeft - 5;
                if (ghostTalks == 0 ){
                    ghostTalks = ghostTalks+1;
                    ghostTrust = ghostTrust +1;
                    System.out.println("The shape drifts closer: an old man in a threadbare coat approaches,");
                    System.out.println("So pale you can see the gravestone through him");
                    System.out.println();
                    System.out.println("Arthur the Ghost: A living soul? After all these years? Forgive me, ");
                    System.out.println("I've forgotten how to be starting" + RESET);
                    System.out.println();
                    System.out.println("His Eyes fell into your locket you were wearing!");
                    System.out.println();
                    System.out.println("Arthur the Ghost: That's hers, That's my Eleanor's. I gave it to her");
                    System.out.println("The day we  married. I died first, you see , and she was buried");
                    System.out.println("In circles for 90 years trying to find her :sob: ");
                    System.out.println("He doesn't ask you for anything. That's somehow the hardest part.");
                    System.out.println("(Arthur trusts you a little more now)");

                }
            }
        }
    }

}