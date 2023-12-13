import java.util.Scanner;

public class ControlStatementsLoops {
    public static void main(String[] args){
//        ----------Boolean Expressions -----------------
//        void means it will not return anything.
//        main (name of the method) Almost same as function name
        System.out.println(10 > 5);
        System.out.println(5 == 5);
        System.out.println(true == false);
        System.out.println();
        System.out.println(2 <= 2);

        //---------------- Logical Operators ----------------
        boolean isLoggedIn = true;
        boolean isAdmin = true;
        if (isLoggedIn && isAdmin) {
            System.out.println("admin page");
        }
        System.out.println((true == true) || true == false);

//        ------String Comparison------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/n]");
//        String userInput = sc.next();
//
////        boolean confirmation = userInput == "y"; (DO NOT USE!)
////        anytime you initiate a string, it is a different object
//
//        System.out.println(userInput == "y");

//        ------Control Structure ------

        boolean lectureTime = true;
        if (lectureTime) {
            System.out.println("learning something");
        } else {
            System.out.println("this will always run");
        }

        boolean learningJava = true;
        boolean learningJavascript = false;
        boolean learningHTML = false;

        if (learningJava){
            System.out.println("Learning Java");
        } else if (learningJavascript){
            System.out.println("learning Javascript");
        } else if (learningHTML) {
            System.out.println("learning html");
        }else {
            System.out.println("learning something else");
        }

    }
}


