package Java.C1_Collections.C1_Interface;

import java.util.*;
import java.util.Map.Entry;

//  Map Interface
public class MapInterface {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Cricket");
        map.put(2, "Hockey");
        map.put(3, "Chess");

        // iterate through keys only
        System.out.print("Keys: ");
        for (Integer key : map.keySet()) {
            System.out.print(key);
            System.out.print(", ");
        }

        // iterate through values only
        System.out.print("\nValues: ");
        for (String value : map.values()) {
            System.out.print(value);
            System.out.print(", ");
        }

        // iterate through key/value entries

        for (Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
             iterator.hasNext(); ) {

            Entry<Integer, String> m = iterator.next();

            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
