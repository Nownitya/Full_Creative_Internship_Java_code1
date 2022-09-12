package JavaCodes.Collections.Sets.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main3 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("LinkedHashSet Using Iterator");

        //  Calling the iterator() method
        Iterator<Integer> iterator = numbers.iterator();

        System.out.print("LinkedHashSet Using Iterator: ");
        //  Accessing elements
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println(", ");

        }
    }
}
