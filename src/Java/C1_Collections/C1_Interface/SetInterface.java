package Java.C1_Collections.C1_Interface;

import java.util.*;
//  Set Interface

/**
 * A set Interface cannot store duplicate/redundant elements in it.
 */
public class SetInterface {
    public static void main(String[] args) {
        int count[] = {21, 23, 34, 18, 57, 84, 65};

        Set<Integer> set = new HashSet<Integer>();
        try {
            for (int i = 0; i <= 6; i++) {
                set.add(count[i]);
            }
            System.out.println("set");
            TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);

            System.out.println("The sorted list is. ");
            System.out.println(sortedSet);

            System.out.println("FIrst element of the set is: " + (Integer) sortedSet.first());
            System.out.println("Last of the set is: " + (Integer) sortedSet.last());

        } catch (Exception e) {

        }
    }


}
