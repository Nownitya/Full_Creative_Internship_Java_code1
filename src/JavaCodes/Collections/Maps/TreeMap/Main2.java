package JavaCodes.Collections.Maps.TreeMap;

import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {
        //  Creating TreeMap of even numbers
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();

        //  Using put()
        evenNumbers.put("Second", 2);
        evenNumbers.put("Four", 4);
        evenNumbers.put("Six", 6);
        evenNumbers.put("Eight", 8);

        //  Using putIfAbsent()
        evenNumbers.putIfAbsent("Ten", 10);
        System.out.println("TreeMap of even numbers: " + evenNumbers);

        //  Creating TreeMap of numbers
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Three", 3);
        numbers.put("Fourth", 7);
        numbers.put("Fifth", 5);
        numbers.put("Sixth",4);

        //  Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("TreeMap of numbers: " + numbers);

        //  Using entrySet()
        System.out.println("Key/Values mappings: " + numbers);

        //  Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        //  Using values()
        System.out.println("Values: " + numbers.values());

        //  Using get()
        int values1 = numbers.get("Three");
        System.out.println("Using get(): " + values1);

        //  Using getOfDefault()
        int values2 = numbers.getOrDefault("Five", 5);
        System.out.println("Using getOrDefault(): " + values2);

        //  remove method with single parameter
        int values3 = numbers.remove("Fifth");
        System.out.println("Removed values: " + values3);

        //  remove method with two parameters
        boolean result1 = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} Removed? " + result1);

        System.out.println("Updated TreeMap: " + numbers);

        //  Using ReplaceAll()
        numbers.replace("Second", 22);
        numbers.replace("Third", 3, 33);
        System.out.println("TreeMap using replace: " + numbers);


        System.out.println("TreeMap: " + numbers);
        //  USing replaceAll()
        numbers.replaceAll((key, oldValue) -> oldValue + 2);
        System.out.println("TreeMap using replaceAll: " + numbers);


    }




}
