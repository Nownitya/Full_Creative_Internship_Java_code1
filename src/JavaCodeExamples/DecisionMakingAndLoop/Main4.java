package JavaCodeExamples.DecisionMakingAndLoop;

class SumNatural1 {
    //  Sum of Natural Numbers using for loop
    public void ex1() {
        int num = 100, sum = 0;

        for (int i = 1; i <= num; ++i) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }

    //  Sum of Natural Numbers using while loop
    public void ex2() {
        int num = 50, i = 1, sum = 0;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);

    }
}
public class Main4 {
    public static void main(String[] args) {
        SumNatural1 sumNatural = new SumNatural1();
        sumNatural.ex1();
        sumNatural.ex2();
    }
}
