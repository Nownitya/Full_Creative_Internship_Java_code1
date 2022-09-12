package JavaCodeExamples.ObjectAndClass;

//  Java program to create custom checked exception class

import java.util.ArrayList;
import java.util.Arrays;

//  create a checked exception class
class CustomException extends Exception {
    public CustomException(String message) {
        //  call the constructor of Exception class
        super(message);
    }
}

public class Main6_1 {
    ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Kotlin", "Python", "JavaScript"));

    //  check the exception condition
    public void checkLanguage(String language) throws CustomException {
        //  throw exception if language already present in ArrayList
        if (languages.contains(language)) {
            throw new CustomException(language + " already exist");
        } else {
            //  insert language to ArrayList
            languages.add(language);
            System.out.println(language + " is added to the ArrayList");
        }
    }

    public static void main(String[] args) {
        //  create object of Main class
        Main6_1 obj1 = new Main6_1();

        // exception is handled using try...catch
        try {
            obj1.checkLanguage("Swift");
            obj1.checkLanguage("Java");

        } catch (CustomException e) {
            System.out.println("[" + e + "] Exception Occurred");
        }
    }


}
