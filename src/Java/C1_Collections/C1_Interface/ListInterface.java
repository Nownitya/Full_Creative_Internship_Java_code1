package Java.C1_Collections.C1_Interface;

import java.util.*;

//  List Interface
/**
 * the list enables the user to maintain an ordered collection of elements
 * with the help of indexing methods and can perform data manipulation
 * operations such as insert, uodate, delete, many more.
 */
public class ListInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Ram");
        list.add("Mohan");
        list.add("Sohan");
        list.add("Ramesh");

        for (String Students : list) {
            System.out.println(Students);
        }
    }

}
