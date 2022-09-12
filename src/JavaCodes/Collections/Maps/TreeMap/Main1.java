package JavaCodes.Collections.Maps.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main1 {
    public static void main(String[] args) {

        //  Creating Map using TreeMap
        Map<String, Integer> values = new TreeMap<>();

        // Insert elements to map
        values.put("Three", 3);
        values.put("Second", 2);
        values.put("First", 1);
        System.out.println("Map using TreeMap: " + values);

        //  Replacing the values
        values.replace("First", 11);
        values.replace("Second", 22);
        values.replace("Third", 33);
        System.out.println("New Map: " + values);

        //  Remove elements from the map
        int removedValue = values.remove("First");
        System.out.println("Removed value: " + removedValue);

    }
}
