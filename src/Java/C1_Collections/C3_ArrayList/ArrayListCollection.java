package Java.C1_Collections.C3_ArrayList;

import java.util.ArrayList;

public class ArrayListCollection {

    //  Create Integer type arraylist
    ArrayList<Integer> arrayListInt = new ArrayList<>();

    //  Create String type arraylist
    ArrayList<String> arrayListString = new ArrayList<>();

    //  Add Elements to an ArrayList
    public void addElement() {
        ArrayList<String> languages = arrayListString;

        languages.add("Java");
        languages.add("Python");
        languages.add("Kotlin");
        System.out.println(languages);

    }

    //   Access ArrayList Elements
    public void accessElements() {
        ArrayList<String> language = arrayListString;

        String str = language.get(2);
        System.out.println("Element at index of 2: " + str);
    }

    //  Change ArrayList Elements
    public void changeElement() {
        ArrayList<String> language = arrayListString;

        language.set(1, "JavaScript");
        System.out.println(language);
    }

    // Remove ArrayList Elements
    public void removeElement() {
        ArrayList<String> language = arrayListString;

        String str = language.remove(1);
        System.out.println("Update Arraylist: " + language);
        System.out.println("Removed element: " + str);
    }

    public void iterateList() {
//        ArrayList<String> language = arrayListString;

        System.out.println("Accessing Individual elements");
        //  Iterate using for-each loop
        for (String language : arrayListString) {
            System.out.print(language+",");
            System.out.println("");
        }
    }

}

class Main {
    public static void main(String[] args) {
        ArrayListCollection arrayList = new ArrayListCollection();
        arrayList.addElement();
        arrayList.accessElements();
        arrayList.changeElement();
        arrayList.removeElement();
        arrayList.iterateList();
    }
}

