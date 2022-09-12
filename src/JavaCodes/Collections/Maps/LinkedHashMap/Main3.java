package JavaCodes.Collections.Maps.LinkedHashMap;

import java.util.LinkedHashMap;

public class Main3 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("LinkedHashMap: " + numbers);

        //  Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        //  Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        //  Using values()
        System.out.println("Values: " + numbers.values());

        //  Using get()
        int value1 = numbers.get("Three");
        System.out.println("Returned Number: " + value1);

        //  Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Returned Number: " + value2);

        //  remove method with single parameter
        int value3 = numbers.remove("Two");
        System.out.println("Remove value: " + value3);

        //  remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry three removed? " + result);

        System.out.println("Updated LinkedHashMap: "+numbers);
    }

}
