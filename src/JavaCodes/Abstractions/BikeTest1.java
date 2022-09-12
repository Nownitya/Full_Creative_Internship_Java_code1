package JavaCodes.Abstractions;

abstract class Bike1 {
    Bike1(){
        System.out.println("Bike is called");
    }

    abstract void run();

    void changeGear() {
        System.out.println("gear Changed");

    }
}

class Honda1 extends Bike1 {

    void run() {
        System.out.println("Running Safely...");
    }
}

public class BikeTest1 {
    public static void main(String[] args) {
        Bike1 bike = new Honda1();
        bike.run();
        bike.changeGear();
    }
}
