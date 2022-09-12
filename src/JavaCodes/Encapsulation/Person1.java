package JavaCodes.Encapsulation;

public class Person1 {
    //  private field
    private int age;

    //  getter method
    public int getAge() {
        return age;
    }

    //  setter method
    public void setAge(int age) {
        this.age = age;

    }
}

class Main2 {
    public static void main(String[] args) {

        //  create an object of Person
        Person1 p1 = new Person1();
        //  change age using setter
        p1.setAge(24);

        //  access age using getter
        System.out.println("Age is: " + p1.getAge());
    }


}
