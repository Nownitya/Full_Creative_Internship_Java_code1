package JavaCodes.Collections.Maps.LinkedHashMap;

import java.util.LinkedHashMap;

public class Main2 {
    public static void main(String[] args) {
        //  creating LinkedHashMap of even numbers
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();

        //  Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        evenNumbers.put("Six", 6);
        System.out.println("Original LinkedHashMap(): " + evenNumbers);

        //  Using putIfAbsent()
        evenNumbers.putIfAbsent("Eight", 8);
        System.out.println("Updated LinkedHashMap(): " + evenNumbers);

        //  creating LinkedHashMap of numbers
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
        numbers.put("One", 1);

        //  Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("New LinkedHashMap: " + numbers);
    }
}
