package JavaCodes.Collections.Sets.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        //  Access TreeSet Elements
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        //  Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.println("TreeSet using Iterator: ");
        //  Accessing element
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }


    }
}
