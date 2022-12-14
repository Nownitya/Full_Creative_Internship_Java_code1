package JavaCodes.Collections.Sets.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();

        //  Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(5);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();

        //  Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);

        //  Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.println("HashSet using Iterator: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }

}
