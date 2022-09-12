package JavaCodes.Collections.Sets.TreeSet;

import java.util.TreeSet;

public class main9 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        //  Using subset() with default boolean value
        System.out.println("Using subset without boolean value: " + numbers.subSet(4, 6));

        //  Using subSet() with specified boolean value
        System.out.println("Using subset with boolean value: " + numbers.subSet(4, false, 6, true));
    }
}
