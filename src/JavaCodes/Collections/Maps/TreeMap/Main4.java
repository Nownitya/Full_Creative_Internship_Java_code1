package JavaCodes.Collections.Maps.TreeMap;

import java.util.TreeMap;

public class Main4 {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 5);
        numbers.put("Third", 4);
        numbers.put("Fourth", 6);

        //  Using higher()
        System.out.println("Using higherKey(): " + numbers.higherKey("Fourth"));
        System.out.println("Using higherEntry(): " + numbers.higherEntry("Fourth"));

        //  using lower()
        System.out.println("\nUsing lowerKey(): " + numbers.lowerKey("Fourth"));
        System.out.println("\nUsing lowerEntry(): " + numbers.lowerEntry("Fourth"));

        //  Using ceiling()
        System.out.println("\nUsing ceilingKey(): " + numbers.ceilingKey("Fourth"));
        System.out.println("\nUsing ceilingEntry(): " + numbers.ceilingEntry("Fourth"));

        //  Using floor()
        System.out.println("\nUsing floorKey(): " + numbers.floorKey("Fourth"));
        System.out.println("\nUsing floorEntry(): " + numbers.floorEntry("Fourth"));
    }
}
