package Java.C1_Collections.C2_ListInterface;

import java.util.List;
import java.util.ArrayList;

// ArrayList class
public class ArrayListClass {
    public static void main(String[] args) {
        //  Creating list using the ArrayList Class
        List<Integer> numbers = new ArrayList<>();

        //  Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("List: " + numbers);

        //  Access elements from the lis
        int number = numbers.get(2);
        System.out.println("Access Element: " + number);

        //  Remove element from the list
        int removeNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removeNumber);

        System.out.println(numbers);
    }

}
