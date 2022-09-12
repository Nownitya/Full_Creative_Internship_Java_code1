package JavaCodeExamples.DecisionMakingAndLoop;

class Fibonacci {
    //  Display Fibonacci Series Using for Loop
    public void ex1() {
        int n = 10, firstTerm= 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + "terms:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            //  Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    //  Display Fibonacci Series using while loop
    public void ex2() {
        int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        while (i <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            i++;
        }
    }

    public void ex3() {
        int n = 100, firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series Upto " + n + ": ");

        while (firstTerm <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
}

public class Main7 {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.ex1();
        System.out.println("");
        fibonacci.ex2();
        System.out.println("");
        fibonacci.ex3();

    }

}
