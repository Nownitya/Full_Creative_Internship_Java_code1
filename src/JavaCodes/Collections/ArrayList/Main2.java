package JavaCodes.Collections.ArrayList;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        //  Create ArrayList
        ArrayList<String> language = new ArrayList<>();
        //  Add elements to ArrayList
        //  add() method without the index parameter
        language.add("Java");
        language.add("Kotlin");
        language.add("Python");

        System.out.println("Array List: " + language);

        //  get the element from the ArrayList
        String str = language.get(1);
        System.out.println("Element at index1 : " + str);

        //  change the element of the ArrayList
        language.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + language);

        //  remove element from index 2
        language.remove(2);
        System.out.println("Updated ArrayList: " + language);
        System.out.println("Removed  Element: " + str);

        //  Iterate using for-each loop
        System.out.println("Accessing individual elements: ");

        for (String code : language) {
            System.out.print(code);
            System.out.print(", ");

        }
    }
}
