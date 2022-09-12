package Java.C1_Collections.C5_Set.S2_LinkedHashSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

    //  Creating an array list of even number
    ArrayList<Integer> evenNumberAL = new ArrayList<>();

    public void addArrayList() {
        evenNumberAL.add(2);
        evenNumberAL.add(4);
        evenNumberAL.add(6);
        System.out.println("ArrayList: " + evenNumberAL);
    }

    // Creating a LinkedHashSet from an ArrayList
    public void hashLinkedList() {
        LinkedHashSet<Integer> number = new LinkedHashSet<>(evenNumberAL);

        System.out.println("LinkedHashSet: " + number);
    }

    LinkedHashSet<Integer> evenNumber = new LinkedHashSet<>();
    LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

    //  add() Method
    public void addMethod() {
        LinkedHashSet<Integer> number = evenNumber;
        number.add(2);
        number.add(4);
        number.add(6);
        System.out.println("Even LinkedHashSet: " + number);
    }

    //  addAll() Method
    public void addAllMethod() {
        LinkedHashSet<Integer> number = numbers;
        number.addAll(evenNumber);
        number.add(5);
    }

    public void accessing() {
        // Calling the iterator() method
        Iterator<Integer> iterate = numbers.iterator();

        System.out.println("LinkedHashSet using Iterator: ");

        // Accessing elements
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }

    public void removeAll() {

        // Using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
    }


}

class Main {
    public static void main(String[] args) {
        LinkedHashSetClass linkedHash = new LinkedHashSetClass();
        linkedHash.addArrayList();
        linkedHash.hashLinkedList();
        linkedHash.addMethod();
        linkedHash.accessing();
    }
}
