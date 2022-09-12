package Java.C1_Collections.C5_Set.S3_TreeSet;

import java.util.TreeSet;

public class TreeClass {

    TreeSet<Integer> evenNumber = new TreeSet<>();

    TreeSet<Integer> numbers = new TreeSet<>();

    //  Using the add() method
    public void addMethod() {

        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("TreeSet: " + evenNumber);
    }

    public void addAllMethod() {

        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New TreeSet: " + numbers);
    }

    //  Method for Navigation

    // Using the first() method
    public void firstMethod() {
        int first = numbers.first();
        System.out.println("First Number: " + first);
    }

    // Using the last() method
    public void lastMethod() {
        int last = numbers.last();
        System.out.println("Last Number: " + last);
    }

    // Using higher()
    public void higher() {
        System.out.println("Using higher: " + numbers.higher(4));
    }

    // Using lower()
    public void lower() {
        System.out.println("Using lower: " + numbers.lower(4));
    }

    // Using ceiling()
    public void ceiling() {
        System.out.println("Using ceiling: " + numbers.ceiling(4));
    }

    // Using floor()
    public void floor() {
        System.out.println("Using floor: " + numbers.floor(3));

    }

    // Using pollFirst()
    public void pollFirst() {
        System.out.println("Removed First Element: " + numbers.pollFirst());
    }

    // Using pollLast()
    public void pollLast() {
        System.out.println("Removed Last Element: " + numbers.pollLast());
    }


    public static void main(String[] args) {
        TreeClass tree = new TreeClass();
        tree.addMethod();
        tree.addAllMethod();
        tree.firstMethod();
        tree.lastMethod();
        tree.higher();
        tree.lower();
        tree.ceiling();
        tree.floor();


    }

}
