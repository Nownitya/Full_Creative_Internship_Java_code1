package JavaCodes.Collections.Maps.TreeMap;

import java.util.TreeMap;

public class Main7 {
    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);

        System.out.println("\nUsing tailMap() Method: ");
        //  Using tailMap() with default booleanValue
        System.out.println("Without boolean value: " + numbers.tailMap("Second"));

        //  Using tailMap() with specified booleanValue
        System.out.println("With boolean value: " + numbers.tailMap("Second", false));

        System.out.println("\nUsing subMap() Method: ");
        //  Using subMap() with default booleanValue
        System.out.println("Without boolean value: " + numbers.subMap("Fourth", "Third"));

        //  Using subMap() with specified booleanValue
        System.out.println("With boolean value: " + numbers.subMap("Fourth", false, "Third", true));
    }
}
