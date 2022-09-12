package JavaCodeExamples.Introduction;

class Largest1 {
    //  Find Largest Among three numbers using if...else statement
    public void ex1() {
        double n1 = -4.5, n2 = 3.9, n3 = 2.5;

        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is the largest number.");

        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is the largest number.");
        } else {
            System.out.println(n3 + " is the largest number.");
        }
    }

    //  Find the largest number among three using nested if...else statement
    public void ex2() {
        double n1 = -4.5, n2 = 3.9, n3 = 5.5;

        if (n1 >= n2) {
            if (n1 >= n3) {
                System.out.println(n1 + " is the largest number.");
            } else {
                System.out.println(n3 + " is the largest number.");
            }
        } else {
            if (n2 >= n3) {
                System.out.println(n2 + " is the largest number.");
            } else {
                System.out.println(n3 + " is the largest number.");
            }
        }
    }
}

public class Main9 {
    public static void main(String[] args) {
        Largest1 largest = new Largest1();
        largest.ex1();
        largest.ex2();
    }
}
