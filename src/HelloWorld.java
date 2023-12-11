import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");

//        1.Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoritenumber = 26;
        System.out.println(myFavoritenumber);

//        Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "My favorite number is:";
        System.out.println(myString);

//        Change your code to assign a character value to myString. What do you notice?
        myString = "T";
        System.out.println(myString);

//        Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        change your code to assign the value 123 to myNumber.
        double myNumber = 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        String class ="";

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        System.out.println(o);
//        int three = (int) o;
//        System.out.println(three);

//        int x = 4;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;


        String name = "codeup";
        String greeting = "Salutations";
        System.out.printf("%s,%s. %n", greeting,name);

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter something: ");
//        String userInput =scanner.next();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput =scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }
}

