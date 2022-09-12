package Java.P1_OOPs.O1_Java_Class_And_Objects;

public class Bicycle {

    // State or field
    int gear = 5;

    //  Behavior or method
    public void braking() {
        System.out.println("Working of Break");
    }

}

class Main1 {
    public static void main(String[] args) {

        //  creating object of a Class
        Bicycle sportsBicycle = new Bicycle();

        //  Access field and method
        int gear = sportsBicycle.gear;
        System.out.println(gear);
        sportsBicycle.braking();
    }
}


