import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        int numToGuess = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int userGuess;
        do {
            System.out.println("Guess a number between 1 and 100.");
            userGuess = scanner.nextInt();

            if(userGuess < numToGuess) {
                System.out.println("Higher");
            }else if(userGuess > numToGuess) {
                System.out.println("Lower");
            }else {
                System.out.println("Good guess!");
            }

        }while (userGuess != numToGuess);
    }
}
