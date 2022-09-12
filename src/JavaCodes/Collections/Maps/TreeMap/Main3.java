package JavaCodes.Collections.Maps.TreeMap;

import java.util.TreeMap;

public class Main3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("Tree Key: " + numbers);

        //  Using the firstKey() method
        String firstKey = numbers.firstKey();
        System.out.println("First Key: " + firstKey);

        //  using the lastKey() method
        String lastKey = numbers.lastKey();
        System.out.println("Last Key: " + lastKey);

        //  Using firstEntry() method
        System.out.println("First Entry: " + numbers.firstKey());

        //  Using the lastEntry() method
        System.out.println("Last Entry: " + numbers.lastEntry());


    }
}
