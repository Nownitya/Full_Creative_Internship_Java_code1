package JavaCodeExamples.ObjectAndClass;

//  Create custom unChecks exception class

import java.util.ArrayList;
import java.util.Arrays;

//  Create a unChecked exception class
class CustomException2 extends RuntimeException {
    public CustomException2(String message) {
        //  call the constructor of RuntimeException
        super(message);
    }
}

public class Main6_2 {
    ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Kotlin", "Python", "JavaScript"));

    //  check the exception condition
    public void checkLanguage2(String language) {
        //  throw exception if language already present in ArrayList
        if (languages.contains(language)) {
            throw new CustomException2(language + " already exists");
        } else {
            //  insert language to ArrayList
            languages.add(language);
            System.out.println(language + " is added to the ArrayList");
        }
    }

    public static void main(String[] args) {

        //  create object of Main class
        Main6_2 obj1 = new Main6_2();

        //  check if language already present
        obj1.checkLanguage2("Swift");
        obj1.checkLanguage2("Java");

    }


}
