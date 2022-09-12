package JavaCodes.Collections.Maps.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Main8 {
    public static void main(String[] args) {

        //  Creating a treeMap with a customized comparator
        TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());
        numbers.put("First", 1);
        numbers.put("Second", 1);
        numbers.put("Third", 1);
        numbers.put("Fourth", 1);
        System.out.println("TreeMap: " + numbers);
    }

    //  Creating a comparator class
    private static class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String number1, String number2) {
            int value = number1.compareTo(number2);

            //  element are sorted in reverse order
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
