package JavaCodes.Collections.Maps.TreeMap;

import sun.reflect.generics.tree.Tree;

import java.util.TreeMap;

public class Main5 {
    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        //  Using the pollFirstEntry method
        System.out.println("Using pollFirstEntry(): " + numbers.pollFirstEntry());

        //  Using the pollLastEntry() method
        System.out.println("Using pollLastEntry(): " + numbers.pollLastEntry());

        System.out.println("Updated Tree Map: "+numbers);
    }
}
