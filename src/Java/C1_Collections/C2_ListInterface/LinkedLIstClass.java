package Java.C1_Collections.C2_ListInterface;

import java.util.List;
import java.util.LinkedList;
//  LinkedList Class
public class LinkedLIstClass {
    public static void main(String[] args) {
        //  Creating list using the linkedList Class
        List<Integer> numbers = new LinkedList<>();

        //  Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List : " + numbers);

        //Access elements from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element:" + number);

        //  Using the index() method
        int index = numbers.indexOf(2);
        System.out.println("Position of 3 is " + index);

        //Remove element from the list
        int removeNumber = numbers.remove(1);
        System.out.println("Removed element: "+removeNumber);
    }

}
