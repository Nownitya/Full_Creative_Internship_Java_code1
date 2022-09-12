package JavaCodes.Collections.Sets.TreeSet;

import java.util.TreeSet;

public class Main6 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        //  Using pollFirst()
        System.out.println("Removed First Element: "+numbers.pollFirst());

        // Using pollLast()
        System.out.println("Remove Last Element: " + numbers.pollLast());

        System.out.println("New TreeSet: " + numbers);
    }
}
