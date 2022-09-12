package JavaCodes.Collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        //  Created a set using the hashSet class
        Set<Integer> set1 = new HashSet<>();

        //  Add elements to the set1
        set1.add(2);
        set1.add(3);
        System.out.println("Set: " + set1);

        //  Creating another set using the HashSet class
        Set<Integer> set2 = new HashSet<>();

        //  Add elements
        set2.add(1);
        set2.add(2);
        System.out.println("Set: " + set2);

        //  Union of Two sets
        set2.addAll(set1);
        System.out.println("Union is: "+set2);


    }
}
