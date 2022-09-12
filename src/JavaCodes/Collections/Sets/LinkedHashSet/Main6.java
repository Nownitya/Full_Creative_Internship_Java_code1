package JavaCodes.Collections.Sets.LinkedHashSet;

import java.util.LinkedHashSet;

public class Main6 {
    public static void main(String[] args) {
        //  Intersection of Sets
        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("LinkedHashSet1: " + primeNumbers);

        LinkedHashSet<Integer> evenNumbers = new LinkedHashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("LinkedHashSet2: " + evenNumbers);

        //  Intersection of two sets
        evenNumbers.retainAll(primeNumbers);
        System.out.println("Intersection is: "+evenNumbers);

    }
}
