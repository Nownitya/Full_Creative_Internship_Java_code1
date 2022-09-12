package JavaCodes.Collections.Sets.LinkedHashSet;

import java.util.LinkedHashSet;

public class Main2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> evenNumbers = new LinkedHashSet<>();

        //  Using add() method
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("LinkedHashSet: " + evenNumbers);

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        //  Using addAll() method
        numbers.addAll(evenNumbers);
        numbers.add(5);
        System.out.println("New LinkedHashSet: "+numbers);
    }
}
