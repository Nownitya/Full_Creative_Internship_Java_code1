package Java.M1_Access_Modifiers.A3_Protected;

public class Animal {
    //  protected method
    protected void display() {
        System.out.println("This is animal Class");

    }
}

class Dog extends Animal {
    public static void main(String[] args) {
        //  create an object of dog class
        Dog dog = new Dog();
        //  access protected method
        dog.display();
    }
}
