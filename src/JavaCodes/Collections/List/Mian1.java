package JavaCodes.Collections.List;

//  Implementing the arrayList Class

import java.util.ArrayList;
import java.util.List;

public class Mian1 {
    public static void main(String[] args) {
        //  Creating list using the ArrayList class
        List<Integer> numbers = new ArrayList<>();

        //  Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        //  Accessing element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        //  Remove element from the list
        int removeNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removeNumber);
        System.out.println("Remained elements: "+ numbers);

    }
}
