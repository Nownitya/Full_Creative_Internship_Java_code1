package Java.D1_OOPs.J1_Inheritance;

//  Simple Inheritance

public class Employe1 {
    float salary = 35000;
}

class Programmer extends Employe1 {
    int bonus = 10000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer Salary." + p.salary);
        System.out.println("Programmer Bonus."+p.bonus);

    }
}

