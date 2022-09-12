package JavaCodeExamples.Introduction;

import java.util.Scanner;

class WhiteSpace1 {
    //  Program to Remove All whiteSpaces
    public void ex1() {
        String sentence = "T    his is b  ett       er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: "+sentence);
    }

    //  Take String from users and remove the white space
    public void ex2() {
        //  Create an object of Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        //  take the input
        String input = sc.nextLine();
        System.out.println("Original String" + input);

        //  Remove white spaces
        input = input.replaceAll("\\s", "");
        System.out.println("Final String: " + input);
        sc.close();
    }
}

public class Main12 {
    public static void main(String[] args) {
        WhiteSpace1 whitespace = new WhiteSpace1();
        whitespace.ex1();
        System.out.println("----------------------");
        whitespace.ex2();
    }
}
