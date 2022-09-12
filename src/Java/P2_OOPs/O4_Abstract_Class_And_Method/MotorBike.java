package Java.P2_OOPs.O4_Abstract_Class_And_Method;

//  Java Abstraction
abstract class MotorBike1 {
    abstract void brake();
}

class SportsBike1 extends MotorBike1 {

    //  implementation of abstract method
    public void brake() {
        System.out.println("Sports Bike Brake");
    }
}

class MountainBike1 extends MotorBike1 {

    //  implementation of abstract method
    public void brake() {
        System.out.println("Mountain Bike Brake");
    }
}

class Main3 {
    public static void main(String[] args) {
        MountainBike1 m1 = new MountainBike1();
        m1.brake();

        SportsBike1 s1 = new SportsBike1();
        s1.brake();
    }
}
