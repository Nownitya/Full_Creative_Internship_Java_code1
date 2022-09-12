package JavaCodeExamples.Introduction;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class RoundUpNumber1 {
    //  Round a Number using format
    public void ex1() {
        double num = 1.34567;
        System.out.format("%.4f", num);
    }

    //  Round a Number using DecimalFormat
    public void ex2() {
        double num = 1.34567;
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(num));

    }
}

public class Main13 {
    public static void main(String[] args) {
        RoundUpNumber1 roundUp = new RoundUpNumber1();
        roundUp.ex1();
        System.out.println("");
        roundUp.ex2();

    }
}
