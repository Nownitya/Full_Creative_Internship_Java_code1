package JavaCodes.Abstractions;

abstract class MotorBike1 {
    MotorBike1() {
        System.out.println("MotorBike class is called...");
    }

    abstract void brake();

    public static void changeGear() {
        System.out.println("Brake applied");
    }
}

class SportsBike extends MotorBike1 {

    @Override
    void brake() {
        System.out.println("SportsBike brake applied");
    }
}

class MountainBike extends MotorBike1 {

    @Override
    void brake() {
        System.out.println("MountainBike Break applied");
    }
}

public class MotorBikeMain1 {
    public static void main(String[] args) {
        MotorBike1 bike1 = new SportsBike();
        bike1.changeGear();
        bike1.brake();

        MotorBike1 bike2 = new MountainBike();
        MotorBike1.changeGear();
        bike2.brake();


    }
}
