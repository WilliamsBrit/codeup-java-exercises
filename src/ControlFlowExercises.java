import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        ----Number 1: While loop

//        int i = 5;
//        while( i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//-----Number 2: Do While loop
//        int i =0;
//        do {
//            System.out.println(i += 2);;
//        } while (i < 100);

//        int i =100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i =2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//        refactor previous 2 exercises for |for loops|)

//        for(int i = 100; i >= -10; i -=5) {
//            System.out.println(i);
//        }


//        for (long i = 2; i < 1000000; i*=i){
//                System.out.println(i);
//
//        }

//
//        for (int i = 1; i < 100; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("fizzbuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//                Scanner scanner = new Scanner(System.in);
//                String userChoice;

//                do {
//                    System.out.print("Enter an integer: ");
//                    int userInput = scanner.nextInt();
//
//                    System.out.printf("%-5s %-5s %-5s%n", "Number", "Squared", "Cubed");
//                    for (int i = 1; i <= userInput; i++) {
//                        System.out.printf("%-10d %-10d %-10d%n", i, i * i, i * i * i);
//                    }
//                    System.out.print("Do you want to continue? (yes/no): ");
//                    userChoice = scanner.next().toLowerCase();
//
//                } while (userChoice.equals("yes"));
//
//                System.out.println("Ok, goodbye!");

                Scanner scanner = new Scanner(System.in);
                char choice;

                do {
                    System.out.print("Enter a numerical grade (0-100): ");
                    int numericalGrade = scanner.nextInt();

                    char letterGrade = convertToLetterGrade(numericalGrade);
                    System.out.println("Letter Grade: " + letterGrade);

                    System.out.print("Do you want to continue? (y/n): ");
                    choice = scanner.next().charAt(0);

                } while (choice == 'y' || choice == 'Y');

                System.out.println("Exit Grade Portal.");
                scanner.close();
            }

            private static char convertToLetterGrade(int numericalGrade) {
                char letterGrade;

                if (numericalGrade >= 88 && numericalGrade <= 100) {
                    letterGrade = 'A';
                } else if (numericalGrade >= 80 && numericalGrade <= 87) {
                    letterGrade = 'B';
                } else if (numericalGrade >= 67 && numericalGrade <= 79) {
                    letterGrade = 'C';
                } else if (numericalGrade >= 60 && numericalGrade <= 66) {
                    letterGrade = 'D';
                } else if (numericalGrade >= 0 && numericalGrade <= 59) {
                    letterGrade = 'F';
                } else {
                    letterGrade = 'I';  // 'I' for Invalid
                }

                return letterGrade;
            }
        }
