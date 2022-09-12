package JavaCodeExamples.DecisionMakingAndLoop;

import java.math.BigInteger;

class Factorial1 {
    //  Find Factorial of a number using for loop
    public void ex1() {
        int num = 10;
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            //  factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }

    //  Find Factorial of a number using BigInteger
    public void ex2() {
        int num = 30;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; ++i) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }

    //  Find Factorial of a number using while loop
    public void ex3() {
        int num = 5, i = 1;
        long factorial = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }

}

public class Main5 {
    public static void main(String[] args) {
        Factorial1 factorial = new Factorial1();
        factorial.ex1();
        System.out.println("\n");
        factorial.ex2();
        System.out.println("\n");
        factorial.ex3();
    }

}
