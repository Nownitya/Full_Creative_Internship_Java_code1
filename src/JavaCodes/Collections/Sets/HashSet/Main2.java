package JavaCodes.Collections.Sets.HashSet;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {

        //  Using add() method
        HashSet<Integer> numbers = new HashSet<>();

        //  Using addAll() method
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println("HashSet: " + numbers);

        //  Using remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? "+value2);
    }

}
