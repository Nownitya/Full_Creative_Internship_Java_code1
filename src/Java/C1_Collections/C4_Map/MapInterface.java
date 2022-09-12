package Java.C1_Collections.C4_Map;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        //  Creating map using hash map
        Map<String, Integer> number = new HashMap<>();

        //  Inserting elements to the map
        // put() method to add elements
        number.put("One", 1);
        number.put("Two", 2);
        number.put("Three", 3);
        number.put("Four", 4);

        //  Access keys of the map
        System.out.println("Keys: " + number.keySet());

        // get() method to get value
        Integer intValue = number.get(1);
        System.out.println("Value at index 1: "+intValue);

        // return set view of keys
        // using keySet()
        System.out.println("Keys: " + number.keySet());

        // return set view of values
        // using values()
        //  Access value of the map
        System.out.println("Value: " + number.values());

        // return set view of key/value pairs
        // using entrySet()
        //  Access entries of the map
        System.out.println("Entries: " + number.entrySet());

        // change element with key 2
        number.replace("Two's", 2);
        System.out.println("Replaced value: " + number);
        //  Remove Elements from the map
        int removeValue = number.remove("Two");
        System.out.println("Removed Value: " + removeValue);

        System.out.println("\n"+number.entrySet());
    }
}
