package JavaCodes.Collections.Sets.TreeSet;

import java.util.TreeSet;

public class Main11 {
    public static void main(String[] args) {
        TreeSet<Integer> evenNumbers = new TreeSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("TreeSet1: " + evenNumbers);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("TreeSet2: " + numbers);

        //Interaction of two sets
        numbers.retainAll(evenNumbers);
        System.out.println("Interaction is: " + numbers);

    }
}
