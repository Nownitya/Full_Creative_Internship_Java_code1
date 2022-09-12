package JavaCodes.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void main(String[] args) {

        //  Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        //  Add elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Sorted ArrayList: " + numbers);

        //  Using the shuffled() method
        Collections.shuffle(numbers);
        System.out.println("ArrayList Using shuffle: " + numbers);

    }
}
