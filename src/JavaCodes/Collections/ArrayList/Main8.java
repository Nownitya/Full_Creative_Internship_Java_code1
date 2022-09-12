package JavaCodes.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main8 {
    public static void main(String[] args) {
        //  Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //  Using min()
        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);

        //  Using max()
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);


    }
}
