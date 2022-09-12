package JavaCodeExamples.DecisionMakingAndLoop;

class MultiplicationTable1 {
    //  Generate Multiplication Table using for loop
    public void ex1() {
        int num = 5;
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }

    //  Generate Multiplication Table using while loop
    public void ex2() {
        int num = 9, i = 1;
        while (i <= 10) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}

public class Main6 {
    public static void main(String[] args) {
        MultiplicationTable1 table = new MultiplicationTable1();
        table.ex1();
        System.out.println("\n");
        table.ex2();
    }
}
