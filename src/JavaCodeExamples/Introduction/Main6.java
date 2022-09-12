package JavaCodeExamples.Introduction;

import com.sun.org.apache.bcel.internal.generic.SWAP;

class Swap1 {
    //  Swap two numbers using temporary variable
    public void ex1() {
        float first = 1.2f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        //  Value of first is assigned to temporary
        float temporary = first;

        //  Value of first id assigned to temporary
        first = second;

        //  Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }

//  Swap two numbers without using temporary variable
    public void ex2() {
        float first = 12.0f, second = 24.5f;

        System.out.println("-- Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("--After Swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
public class Main6 {
    public static void main(String[] args) {
        Swap1 swap = new Swap1();
        System.out.println("Swap two numbers using temporary variable");
        swap.ex1();
        System.out.println("Swap two numbers without using temporary variable");
        swap.ex2();
    }
}
