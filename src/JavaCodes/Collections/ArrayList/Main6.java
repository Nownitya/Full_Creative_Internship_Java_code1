package JavaCodes.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main6 {
    public static void main(String[] args) {
        //  Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //  Using binarySearch()
        int position = Collections.binarySearch(numbers, 3);
        System.out.println("The position of 3 is "+position);


    }
}
