package JavaCodes.Collections.Maps.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map4 {
    public static void main(String[] args) {

        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        System.out.println("HashMap: " + numbers);

        //  get method to get value
        String value = numbers.get(1);
        System.out.println("Value at index 1: " + value);

        //  return set view of keys
        //  using keySets()
        System.out.println("Keys: " + numbers.keySet());

        //  return set view of values
        //  using values()
        System.out.println("Values: " + numbers.values());

        //  return set view of key/value pairs
        //  using entrySet()
        System.out.println("Keys/Value mapping: " + numbers);


        //  change element with key 2
        numbers.replace(2, "Two's");
        System.out.println("Hashmap using replace(): " + numbers);

        //   remove elements associated with key 2
        String value2 = numbers.remove(2);
        System.out.println("Removed value: " + value2);
        System.out.println("Update HashMap: " + numbers);

        //  iterate through keys only
        System.out.println("Keys: ");
        for (Integer key : numbers.keySet()) {
            System.out.print(key);
            System.out.print(", ");

        }

        //  iterate through values only
        System.out.println("\nValues: ");
        for (String value3 : numbers.values()) {
            System.out.print(value3);
            System.out.print(", ");

        }

        //  iterate through key/value entry
        System.out.println("\nEntries: ");
        for (Entry<Integer,String> entry : numbers.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");

        }
    }
}
