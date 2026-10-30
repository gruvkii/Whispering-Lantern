# The Whispering Lantern

A text-based survival story, written in plain Java.
You're alone in a locked, foggy cemetery at 2:15 AM with a failing lantern and a silver locket that doesn't belong to you and goal is to reach Eleanor's grave before the bell tolls or the lantern dies. 
There are around 6 different ending according to the decision you take on the story. 

---
## Screenshots
<img width="1089" height="318" alt="image" src="https://github.com/user-attachments/assets/63eb4f69-fe8f-47bf-a9a7-a34f0fd0b106" />
<img width="672" height="466" alt="image" src="https://github.com/user-attachments/assets/ab6e534e-70bb-4a4e-a624-91015407decc" />
<img width="661" height="358" alt="image" src="https://github.com/user-attachments/assets/759eb0c5-b236-47fb-8cec-d9a1f6d87da7" />
---

## Tech Stack

| Tool | Version |
|------|---------|
| Language | **Java 25+** |
| IDE | **IntelliJ IDEA** |
| Libraries | None. Only the standard library (`java.util.Scanner`, `java.util.Random`) |

### Written the whole program on IF ELSE Condition and While Loops ! 

---

## How It Works

The game is a turn-based loop that tracks three resources:

| Resource | Starts at | What happens |
|----------|-----------|--------------|
| **Lantern oil** | 100% | If it reaches 0, the dark takes you |
| **Minutes left** | 45 (2:15 AM to 3:00 AM) | If it reaches 0, the bell tolls and you're trapped |
| **Steps to home** | 6 | If it reaches 0, you arrive at Eleanor's grave |

The loop keeps running as long as all three are still in your favor:

```java
while (oil > 0 && minutesLeft > 0 && distanceToTravel > 0) { ... }
```

### Your actions each turn

1. **Press on through the fog.** Moves you one step closer, but costs oil and 5 minutes.
2. **Trim the wick.** Gets you some oil back (+12%), but costs 5 minutes.
3. **Talk to Arthur.** A gamble you need to checkout to know what will happen !

### Story moments

These are secrets Check out the Game to Know ! 

### Endings

| Ending | How you get it |
|--------|----------------|
| The Lantern Burns for Everyone | Earn Arthur's trust, then let him say goodbye himself |
| The Locket Returned | Lay the locket down gently |
| The Escape That Followed You Home | Run with the key |
| The Cemetery Keeps What You Tried to Keep | Run without the key |
| Lost to the Dark | The lantern burns out |
| Trapped at Three | The bell tolls before you arrive |

### Programming concepts practiced

- **`Scanner`** for reading the player's choices
- **`while` loop** for the main game loop
- **`if / else if / else`** for menus, scenes and endings
- **`Random`** for unpredictable ghost encounters
- **Variables and `boolean` flags** (`oil`, `ghostTrust`, `helpedChild`, `tookKey`) for remembering the player's choices
- **A small method** (`askChoice`) that keeps asking until the player types a valid number
---

## How to Use It

### Requirements

- [JDK 25 or newer](https://www.oracle.com/java/technologies/javase/jdk25-archive-downloads.html)

Download the  WhisperingLantern.java File from the releases of this repo and run the following command while being on the same folder as the file in the terminal of your choice 

```bash
java -jar  Whispering.Lantern.jar
```
### Controls

Type the **number** of the option you want and press **Enter**. If you type something invalid, the game will simply ask again.

---
## Ideas for Next Time

- Add color to the text with ANSI escape codes
- Add a "play again?" option
- Add more scenes between the gate and the chapel
- Add a hidden ending that needs a very specific mix of choices


