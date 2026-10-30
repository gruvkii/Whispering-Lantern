import java.util.Random;
import java.util.Scanner;

public class WhisperingLantern {

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
                System.out.println("(Please choose a number from" + min + "to" + max + ".)");
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
        boolean keySceneDone = false;
        boolean relit = false;

        System.out.println();
        System.out.println("THE WHISPERING LANTERN");
        System.out.println();
        System.out.println("Last week you found a tarnished silver locket sewn into the lining");
        System.out.println("of your late grandmother's coat. Inside, a faded photograph and three");
        System.out.println("engraved words: \"E. Marlowe. Wait for me.\"");
        System.out.println();
        System.out.println("Everyone told you to leave it in a drawer. You couldn't.");
        System.out.println("So now it's 2:15 AM, the cemetery gates are locked behind you, and");
        System.out.println("your old lantern is already coughing. Eleanor Marlowe's resting place");
        System.out.println("is six steps away through the fog. Get her locket home before the bell");
        System.out.println("tolls 3:00, because whoever is still inside when it rings... stays.");
        System.out.println();
        System.out.println("Press Enter to begin...");
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
                System.out.println("The Flame shrinks to a treambling baed, Shadows lean Closer.");
            }
            if (minutesLeft <= 10) {
                System.out.println("High above the fog , the bell tower groans, getting ready.");
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
                System.out.println("One step Closer. The flame drank 18% of the oil.");
            } else if (choice == 2) {
                oil = oil + 12;
                if (oil > 100) {
                    oil = 100;
                }
                minutesLeft = minutesLeft - 5;
                System.out.println("You Kneel on the cold ground and steady you shaking Hands!");
                System.out.println("The flame steadies and turns a warmer gold (+12% oil ) ");
                System.out.println("But the minutes keep going, and they never look Back.");
            } else {
                minutesLeft = minutesLeft - 5;
                if (ghostTalks == 0) {
                    ghostTalks = ghostTalks + 1;
                    ghostTrust = ghostTrust + 1;
                    System.out.println("The shape drifts closer: an old man in a threadbare coat approaches,");
                    System.out.println("So pale you can see the gravestone through him");
                    System.out.println();
                    System.out.println("Arthur the Ghost: A living soul? After all these years? Forgive me, ");
                    System.out.println("I've forgotten how to be starting");
                    System.out.println();
                    System.out.println("His Eyes fell into your locket you were wearing!");
                    System.out.println();
                    System.out.println("Arthur the Ghost: That's hers, That's my Eleanor's. I gave it to her");
                    System.out.println("The day we  married. I died first, you see , and she was buried");
                    System.out.println("In circles for 90 years trying to find her :sob: ");
                    System.out.println("He doesn't ask you for anything. That's somehow the hardest part.");
                    System.out.println("(Arthur trusts you a little more now)");
                } else {
                    ghostTalks = ghostTalks + 1;
                    int roll = random.nextInt(3);
                    if (roll == 0) {
                        distanceToTravel = distanceToTravel - 1;
                        int tip = random.nextInt(2);
                        if (tip == 0) {
                            System.out.println("Arthur the Ghost: The cold spots, dear. Follow the cold spots !");
                            System.out.println("I've worn this whole place looking for her");
                        } else {
                            System.out.println("Arthur the Ghost: There is a gap behind the tree. Her house is ");
                            System.out.println("Just past it . I .... I always lose my nerve at that gap");
                        }
                        System.out.println("He Drifts ahead of you , and the fog parts away!");
                    } else if (roll == 1) {
                        System.out.println("Arthur the ghost : She hummed when she cooked.");
                        System.out.println("always happy, I'd give anything to hear it badly again :sob: ..........");
                        System.out.println();
                        System.out.println("His voice thins out. He looks very small");
                        System.out.println();
                        System.out.println("1. Stay with him and let him remember (costs 5 more minutes) ");
                        System.out.println("2. Gently say you're running out of time ");
                        int reaction = askChoice(input, 1, 2);
                        if (reaction == 1) {
                            minutesLeft = minutesLeft - 5;
                            ghostTrust = ghostTrust + 1;
                            System.out.println("You sit beside him until the memory settles. he nods once/");
                            System.out.println("Arthur the Ghost trusts you more. the clock ticks another 5 minutes");
                        } else {
                            System.out.println("Arthur the Ghost: of Course, Please forgive and Old MAN ");
                            System.out.println("He smiles, but something in it dims");
                        }
                    } else {
                        oil = oil -15;
                        System.out.println("Arthur the Ghost: Is that FIRE? oh, dear, I could never ....");
                        System.out.println("You lose 15% of your oil");
                    }
                }
            }
            System.out.println();
            if (distanceToTravel <= 4 && distanceToTravel >0 && !childSceneDone && oil > 0 && minutesLeft > 0)
            {
                childSceneDone = true;
                System.out.println("A tiny light flickers between two headstones. A little girl in a");
                System.out.println("nightgown is holding a candle stub that has almost burned out.");
                System.out.println();
                System.out.println("Wren the Child: Please... it keeps going out. I can't find my mama in dark");
                System.out.println();
                System.out.println("1. Tilt your lantern and share some of your oil (-10% oil)");
                System.out.println("2. Tell her you're sorry, but you can't spare any, and walk on");
                int wrenChoice = askChoice(input, 1, 2);

                if (wrenChoice == 1){
                    helpedChild = true;
                    if (oil > 10 ){
                        oil = oil - 10;
                        System.out.println("You tip a few precious drops onto her wick. her candles blooms in the dark");
                    }else{
                        System.out.println("You own flame is so low that she shakes her head, closes your");
                        System.out.println("fingers back around the lantern and smiles anyway.");

                    }
                    System.out.println("Wren the Child: I won't forget. If you light dies, I'll come to find you.");
                    System.out.println("(Something small and warm has been promised to you.)");
                }
                else  {
                    System.out.println("You walk on Belind you, her little light goes out");
                    System.out.println("You tell yourself you had no choice. Mostly it works");
                }
                System.out.println();
            }

            if (distanceToTravel <= 2 && distanceToTravel > 0 && !keySceneDone && oil > 0 && minutesLeft > 0)
            {
                keySceneDone = true;
                System.out.println("Your light catches a sagging shed. Through the broken window, an iron");
                System.out.println("key hangs on a hook, tagged MAIN GATE. With it, you could leave this");
                System.out.println("place no matter what happens ahead.");
                System.out.println();
                System.out.println("1. Reach through and take the key");
                System.out.println("2. Leave it hanging. You didn't come here to leave");
                int keyChoice = askChoice(input, 1, 2);
                if (keyChoice == 1) {
                    tookKey = true;
                    System.out.println("The key is colder than it has any right to be.");
                } else {
                    System.out.println("You step back from the window. The shed seems to breathe out.");
                }
                System.out.println();
            }

            if (oil <= 0 && helpedChild && !relit && distanceToTravel > 0 && minutesLeft > 0)
            {
                relit = true;
                oil = 15;
                System.out.println("Your flame dies. Total darkness. Then a small gold glow floats toward you.");
                System.out.println("Wren the Child: I told you I'd come.");
                System.out.println("She touches your wick with her candle, and the lantern wakes up again. (+15% oil)");
                System.out.println();
            }
        }

        System.out.println("===================================");
        if (distanceToTravel <= 0) {
            System.out.println("The chapel rises out of the mist, and there, half hidden in moss, a");
            System.out.println("small stone: ELEANOR MARLOWE. SHE WAITED.");
            System.out.println("Arthur drifts up beside you, trembling. The locket is warm in your hand.");
            System.out.println();
            System.out.println("1. Lay the locket on her grave and say a few words");
            System.out.println("2. Open the locket and let Arthur say goodbye himself");
            System.out.println("3. Keep the locket and run for the gate");
            int finale = askChoice(input, 1, 3);

            if (finale == 2 && ghostTrust >= 2) {
                System.out.println("You open the locket. The photograph glows, and for one moment Arthur's");
                System.out.println("hand is solid.");
                System.out.println("Arthur the Ghost: Hello, my love. Sorry I'm late.");
                System.out.println("A woman in a pale dress waits at the chapel door, humming badly,");
                System.out.println("wonderfully out of tune. She takes his hand, and they walk into the light.");
                if (helpedChild) {
                    System.out.println("Nearby, Wren runs to her mama, candle blazing, and never looks back.");
                }
                System.out.println("The bell tolls three, and it sounds almost like singing.");
                System.out.println("*** ENDING: THE LANTERN BURNS FOR EVERYONE ***");
            } else if (finale == 3 && tookKey) {
                System.out.println("You run. Arthur's cry follows you, thin and broken. The iron key turns,");
                System.out.println("and you tumble into the road, free. But the locket never warms again,");
                System.out.println("and some nights you hear someone calling a name through the fog.");
                System.out.println("*** ENDING: THE ESCAPE THAT FOLLOWED YOU HOME ***");
            } else if (finale == 3) {
                System.out.println("You run, but the gate is locked and you have no key. When you turn");
                System.out.println("around, Arthur is standing very still behind you.");
                System.out.println("Arthur the Ghost: I was so close to her. And you were going to take her away.");
                System.out.println("*** ENDING: THE CEMETERY KEEPS WHAT YOU TRIED TO KEEP ***");
            } else {
                System.out.println("You lay the locket against the stone and tell her she was waited for,");
                System.out.println("and that someone remembered. Arthur hovers at the edge of the light.");
                if (finale == 2) {
                    System.out.println("Arthur the Ghost: I'm afraid. We never really talked, did we?");
                }
                System.out.println("The bell tolls three, and the gate opens, just wide enough for you.");
                System.out.println("*** ENDING: THE LOCKET RETURNED ***");
                System.out.println("(Arthur still walks the fog. Maybe next time, stay and listen.)");
            }
        } else if (oil <= 0) {
            System.out.println("The flame gutters, flickers, and goes out.");
            System.out.println("Whatever is whispering in the fog is much closer now.");
            System.out.println("*** ENDING: LOST TO THE DARK ***");
        } else {
            System.out.println("BONG. BONG. BONG.");
            System.out.println("The gates dissolve into mist, and the cemetery quietly makes room for one more.");
            System.out.println("*** ENDING: TRAPPED AT THREE ***");
        }
        System.out.println("===================================");

        input.close();
    }
}
