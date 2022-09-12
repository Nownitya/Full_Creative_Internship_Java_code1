package JavaCodes.Collections.Sets.LinkedHashSet;

import java.util.LinkedHashSet;

public class Main5 {
    public static void main(String[] args) {
        //  Set Operations
        //  Union of sets
        LinkedHashSet<Integer> evevNumbers = new LinkedHashSet<>();
        evevNumbers.add(2);
        evevNumbers.add(4);
        System.out.println("LinkedListHashSet1: " + evevNumbers);

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("LinkedHashSet2: " + numbers);

        //  Union of two set
        numbers.addAll(evevNumbers);
        System.out.println("Union is "+numbers);
    }
}
