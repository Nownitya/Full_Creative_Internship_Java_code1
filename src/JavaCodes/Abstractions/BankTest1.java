package JavaCodes.Abstractions;

abstract class Bank1 {
    abstract double getRateOfInterest();
}
class SBI extends Bank1 {


    double getRateOfInterest() {

        return 8.0;
    }
}

class BOI extends Bank1 {

    double getRateOfInterest() {
        return 6.0;
    }
}


public class BankTest1 {
    public static void main(String[] args) {
        Bank1 bank;
        bank = new SBI();
        System.out.println("Rate of interest of SBI "+bank.getRateOfInterest()+"%");

        bank = new BOI();
        System.out.println("Rate of interest of SBI "+bank.getRateOfInterest()+"%");

    }
}
