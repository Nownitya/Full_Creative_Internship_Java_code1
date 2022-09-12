package JavaCodeExamples.Introduction;

class QuadraticEquation {
    //  Java Program to Find Roots of a Quadratic Equation
    public void ex1() {
        //  value a,b and c
        double a = 2.3, b = 4, c = 5.6;
        double root1, root2;

        //  Calculate the determinate (b^2 - 4ac)
        double determination = b * b - 4 * a * c;

        //  Check if determinant is greater than 0
        if (determination > 0) {
            //  Two real and distinct roots
            root1 = (-b + Math.sqrt(determination)) / (2 * a);
            root2 = (-b - Math.sqrt(determination)) / (2 * a);

            System.out.println("root1 = %.2f and root2 = %.2f " + root1 + " " + root2);
        } else if (determination == 0) {        //  Check if determinant is equal to 0

            //  two real and equal roots determinant is equal to 0 so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.println("root1 = root2 = %.2f;" + root1);
        } else {        //  if determinant is less than zero
            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determination) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }

    }
    public void ex2() {

    }
}
public class Main10 {
    public static void main(String[] args) {
        QuadraticEquation quadEquation = new QuadraticEquation();
        quadEquation.ex1();
        quadEquation.ex2();

    }
}
