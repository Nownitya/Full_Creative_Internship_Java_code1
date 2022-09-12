package JavaCodeExamples.DecisionMakingAndLoop;

//  Check if a Number is Positive or Negative using if else

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        double number = reader.nextInt();

//        double number = 12.3;
        //  true if number is less than 0
        if (number < 0.0) {
            System.out.println(number + " is a negative number.");
        } else if (number > 0.0) {      //  true if number is greater than o
            System.out.println(number + " is a positive number.");
        } else {        //  id both test expression is evaluated to false
            System.out.println(number + " is 0.");
        }
    }
}
