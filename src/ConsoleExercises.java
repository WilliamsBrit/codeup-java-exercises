import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        Copy this code into your main method:
        double pi = 3.14159;
        System.out.printf("The value of pie is approximately %.2f %n",pi);

//       Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.printlnf("Your new integer: is %d%n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 words: ");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();
        System.out.printf("The words you entered are : %n %s %n %s %n %s %n", word1,word2,word3);
//

//        System.out.println("Enter a sentence: ");
//        String sentence =scanner.next();
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("Here is your sentence %n %s%n", sentence);


        System.out.println("Enter a length: ");
        double length = scanner.nextInt();
        System.out.println("Enter a width: ");
        double width = scanner.nextInt();
        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        System.out.printf("The area of the room is: %n %s%n", area);
        System.out.printf("The perimeter is %n %s%n", perimeter);


    }
}
