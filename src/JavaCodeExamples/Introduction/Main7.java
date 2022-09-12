package JavaCodeExamples.Introduction;

import java.util.Scanner;

class CheckNum1 {
    //  Check whether a number is even or odd using if...else statement
    public void ex1() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    //  Check whether a number is even number is even or odd using ternary operator
    public void ex2() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);


    }
}
public class Main7 {
    public static void main(String[] args) {
        CheckNum1 check = new CheckNum1();
        check.ex1();
        check.ex2();
    }
}
