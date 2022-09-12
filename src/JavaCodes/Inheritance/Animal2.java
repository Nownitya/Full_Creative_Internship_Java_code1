package JavaCodes.Inheritance;

//  Method overriding in Java Inheritance
public class Animal2 {
    //  Method in superclass
    public void eat() {
        System.out.println("Eating...");
    }
}

//Dog inherits Animal
class Dog2 extends Animal2 {

    // Overriding the eat() method
    @Override
    public void eat() {
        System.out.println("Eating food...");
    }

    public void bark() {
        System.out.println("Barking...");
    }
}

class Main2 {
    public static void main(String[] args) {
        //create an object of the subclass
        Dog2 labrador = new Dog2();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }

}
