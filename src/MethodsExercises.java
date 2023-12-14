import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {

//        System.out.println("Addition: " + addition(1, 3));
//        System.out.println("Subtraction: " + subtraction(3, 6));
//        System.out.println("Multiplication: " + multiplication(6, 7));
//        System.out.println("Division: " + division(8, 4));
//        System.out.println("Modulus: " + modulus(8, 4));

//        System.out.println(getInteger(0,10));

//        do{
//            long result =factorial();
//            System.out.println("Factorial result: " + result);
//        }while (confirm());
//        do {
//            System.out.println(dice());
//        } while (confirm());
    }

//    public static int addition(int sum1, int sum2) {
//        return sum1 + sum2;
//    }
//
//    public static int subtraction(int sub1, int sub2) {
//        return sub1 - sub2;
//    }
//
//    public static int multiplication(int mul1, int mul2) {
//        return mul1 * mul2;
//    }
//
//    public static double division(double div1, int div2) {
//        {
//            return div1 / div2;
//        }
//
//    }
//    public static int modulus(int mod1, int mod2) {
//        {
//            return mod1 % mod2;
//        }
//
//    }
////    public static int multiply(int x, int y) {
////        int result = 0;
////        for (int i = 0; i < Math.abs(y); i++) {
////            result += x * (y > 0 ? 1 : -1);
////        }
////        return result;
////    }

//        public static int getInteger ( int min, int max){
//            Scanner scanner = new Scanner(System.in);
//            int userInput;
//
//            do {
//                System.out.print("Enter a number between " + min + " and " + max + ": ");
//                while (!scanner.hasNextInt()) {
//                    System.out.println("Invalid input. Please enter a valid integer.");
//                    System.out.print("Enter a number between " + min + " and " + max + ": ");
//                    scanner.next();
//                }
//                userInput = scanner.nextInt();
//
//                if (userInput < min || userInput > max) {
//                    System.out.println("Invalid number. Please enter a different number.");
//                }
//
//            } while (userInput < min || userInput > max);
//
//            return userInput;
//        }

//        public static int getInteger(int min,int max) {
//            System.out.println("Enter a number between " + min + " and " + max );
//            Scanner scanner = new Scanner(System.in);
//            int userInput = scanner.nextInt();
//
//            if(userInput >= min && userInput <= max) {
//                return userInput;
//            }
//            return getInteger(min,max);
//        }

//    public static long factorial() {
//        int num = getInteger(1,10);
//        long currentSum = 1;
//
//        for (int i = 1; i <= num; i++) {
//            currentSum *= i;
//
//        }
//        return currentSum;
//    }
//
//    public static boolean confirm() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Continue [y/n]");
//        String answer =scanner.nextLine();
//        return answer.equalsIgnoreCase("y");
//
//    }

public static String dice() {
        Scanner scanner = new Scanner(System.in);
    System.out.println("How many sides does your dice have?");
    int  sides = scanner.nextInt();
    int dice1 = (int) ((Math.random() * sides) + 1);
    int dice2 = (int) ((Math.random() * sides) + 1);

    return "dice #1 = " + dice1 + " dice #2 = " + dice2;
}


}
