package JavaCodes.Collections.Sets.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Main14 {
    public static void main(String[] args) {
        //  Creating a tree set with a customized comparator
        TreeSet<String> animals = new TreeSet<>(new CustomComparator());
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Mouse");
        animals.add("Horse");
        System.out.println("TreeSet: " + animals);
    }

    //  Creating a comparator class
    public static class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String animal1, String animal2) {
            int value = animal1.compareTo(animal2);

            //  elements are sorted in reverse order
            //  return Integer.compare(0, value);
            if (value > 0) {
                return -1;
            } else if (value < 0) {
                return 1;
            } else {
                return 0;
            }


        }
    }

}
