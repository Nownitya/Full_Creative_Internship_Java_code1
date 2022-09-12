package Java.P2_OOPs.O7_Java_Encapsulation;

//  Data hiding using the private specifier
class Person1 {
    //  Private field
    private int age;

    //  Getter method
    public int getAge() {
        return age;
    }

    //  Setter method
    public void setAge(int age) {
        this.age = age;
    }
}

class Main2 {
    public static void main(String[] args) {

        //  Create an object of person
        Person1 p1 = new Person1();
        p1.setAge(24);

        //  access age using getter
        System.out.println("My age is " + p1.getAge());

    }
}
