package Java.C1_Collections.C5_Set.S1_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInterface {

    HashSet<Integer> evenNumber = new HashSet<>();
    HashSet<Integer> allNumber = new HashSet<>();

    //Using add() method
    public void addMethod() {
        HashSet<Integer> number = evenNumber;

        number.add(2);
        number.add(4);
        number.add(6);
        number.add(8);
        System.out.println("HashSet: " + number);
    }

    //   // Using addAll() method
    public void addAllMethod() {
        HashSet<Integer> number = allNumber;
        number.addAll(evenNumber);
        number.add(5);

        System.out.println("New HashSet: " + number);
    }

    public void accessElement() {
        HashSet<Integer> number = allNumber;

        // Calling iterator() method
        Iterator<Integer> iterator = number.iterator();
        System.out.println("Hashset using Iterator: ");

        //Access elements
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(", ");
        }
        System.out.println();

    }

    //  Remove Elements
    public void removeElements() {
        HashSet<Integer> number = allNumber;
        boolean value1 = number.remove(5);
        System.out.println("Is 5 Removed: " + value1);

        boolean value2 = number.removeAll(number);
        System.out.println("Are all element removed: " + value2);
    }

}

class Main {
    public static void main(String[] args) {

        HashSetInterface hash = new HashSetInterface();
        hash.addMethod();
        hash.addAllMethod();
        hash.accessElement();
        hash.removeElements();

    }
}
