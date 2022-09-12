package JavaCodeExamples.DecisionMakingAndLoop;

class GDC {
    //  Find GDC of two numbers using for loop and if statement
    public void ex1() {
        //  Find GDC between n1 and n2
        int n1 = 81, n2 = 153;

        //  initially set to GDC
        int gdc = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {
            //  Check if i perfectly divides both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {
                gdc = i;
            }
            System.out.println("GDC of " + n1 + " and " + n2 + " is " + gdc);
        }
    }

    //  Find GDC of two numbers using while loop and if else statement
    public void ex2() {
        //  find GDC between n1 and n2
        int n1 = 81, n2 = 153;
        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }
        System.out.println("GDC: " + n1);
    }

    //  GDC for both positive and negative numbers
    public void ex3() {

        int n1 = 81, n2 = -153;

        //  Always set to positive
        n1 = (n1 > 0) ? n1 : -n1;
        n2 = (n2 > 0) ? n2 : -n2;

        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }
        System.out.println("GDC: " + n1);
    }
}

public class Main8 {
    public static void main(String[] args) {
        GDC gdc = new GDC();
        gdc.ex1();
        System.out.println();
        gdc.ex2();
        System.out.println();
        gdc.ex3();

    }

}
