package JavaCodeExamples.DecisionMakingAndLoop;

class Alphabet1 {
    //  Check Alphabet using if else
    public void ex1() {
        char c = '*';

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is an alphabet.");
        } else {
            System.out.println(c + " is not an alphabet.");
        }
    }

    //  Check Alphabet using ternary operator
    public void ex2() {
        char c = 'A';

        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";

        System.out.println(output);
    }

    //  checks if c is an alphabet
    public void ex3() {

        //  declare a variable
        char c = 'a';

        //  checks if c is an alphabet
        if (Character.isAlphabetic(c)) {
            System.out.println(c + " is an alphabet");
        } else {
            System.out.println(c + " is not an alphabet.");
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Alphabet1 alphabet = new Alphabet1();
        alphabet.ex1();
        alphabet.ex2();
        alphabet.ex3();
    }
}
