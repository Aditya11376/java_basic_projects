import java.util.Random;
import java.util.Scanner;

class game {
    private int userChoice;
    private int computerChoice;
    int numberOfGuesses;

    // getter ad the setter;
    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    public int getUserChoice() {
        return this.userChoice;
    }

    public void setComputerChoice(int computerChoice) {
        this.computerChoice = computerChoice;
    }

    public int getComputerChoice() {
        return this.computerChoice;
    }

    // initializing the method 1;
    public int check1(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            numberOfGuesses++;

        } else {
            numberOfGuesses = check2(getUserChoice(), getComputerChoice());
        }
        return numberOfGuesses;
    }

    // method 2
    public int check2(int userChoice, int computerChoice) {
        int invalidity = 0;
        if (userChoice > computerChoice) {
            invalidity = 1;
            numberOfGuesses++;
            System.out.println("\nYou choosed a number greater than computer choose.");
        } else if (userChoice < computerChoice) {
            invalidity = 1;
            numberOfGuesses++;
            System.out.println("\nYou choosed a number less than computer choose.");
        }
        if (invalidity == 1) {
            System.out.print("\nChoose again a new number : ");
            Scanner sc = new Scanner(System.in);
            setUserChoice(sc.nextInt());
            numberOfGuesses = check1(getUserChoice(), getComputerChoice());
        }
        return numberOfGuesses;
    }

}

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // creating an object;
        game game = new game();
        int max = 101;
        int min = 1;

        System.out.println("Welcome to the Game");
        System.out.print("Press Y(yes)/N(no) to play : ");
        String playerChoice = sc.nextLine();

        switch (playerChoice) {
            case "Y":
                // userChoice
                System.out.print("Enter your choice here (Range => 1-100) : ");
                game.setUserChoice(sc.nextInt());

                // computerChoice
                game.setComputerChoice(rand.nextInt(max - min) + min);

                // printing the choice of user;
                System.out.println("Your choice is " + game.getUserChoice());
                // printng the choice of computer;
// --->>>       System.out.println("Computer choice is " + game.getComputerChoice());

                // calling the method;
                int guess = game.check1(game.getUserChoice(), game.getComputerChoice());

                // result;
                System.out.println();
                System.out.println("\nWow ! you guessed the right number choose by computer\n");
                System.out.println("Result:\n");

                System.out.println("(1). Computer choice was " + game.getComputerChoice());
                System.out.println(("(2). Your choice was " + game.getUserChoice()));
                System.out.println("Total number of guess is "+game.numberOfGuesses);
                break;

            case "N":
                System.out.println("Thank you for playing!\nPlease visit again.");
                break;

            default:
                System.out.println("Invalid input\nPlease try again.");
        }
    }
}