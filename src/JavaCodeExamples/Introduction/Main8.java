package JavaCodeExamples.Introduction;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;
import java.util.Scanner;

class CheckAlphabet {
    //  Check whether an alphabet is vowel or consonant using if...else statement
    public void ex1() {
        char ch = 'i';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is vowel");
        } else {
            System.out.println(ch + " is constant");
        }
    }

    //  Check whether an alphabet is vowel or consonant using switch statement
    public void ex2() {
        char ch = 'z';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}

public class Main8 {
    public static void main(String[] args) {
        CheckAlphabet checkAlpha = new CheckAlphabet();
        checkAlpha.ex1();
        checkAlpha.ex2();
    }
}
