package JavaCodeExamples.ObjectAndClass;

//  Java program to create immutable class

//  class is declared final
final class Immutable1 {
    //  private class members
    private String name;
    private int date;

    Immutable1(String name, int date) {
        this.name = name;
        this.date = date;
    }

    //getter method returns the copy of class members
    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }
}

public class Main7 {
    public static void main(String[] args) {
        //  Create object of Immutable
        Immutable1 obj1 = new Immutable1("Rohan", 2011);

        System.out.println("Name: " + obj1.getName());
        System.out.println("Date: " + obj1.getDate());

    }
}
