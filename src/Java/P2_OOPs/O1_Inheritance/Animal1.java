package Java.P2_OOPs.O1_Inheritance;

public class Animal1 {
    //  Field and Method of the parent class
    String name;

    public void eat() {
        System.out.println("Eating...");
    }
}


//  Use of extended keyword to perform inheritance.
//  Inherit from Animal
class Dog1 extends Animal1 {
    //New method in subclass
    public void display() {
        System.out.println("My name is " + name);
    }
}

class Main1 {
    public static void main(String[] args) {
        //  create an object of the subclass
        Dog1 labrodor = new Dog1();

        //  access field of superclass
        labrodor.name = "Tommy";
        labrodor.display();

        // call method of superclass
        // using object of subclass
        labrodor.eat();
    }
}
