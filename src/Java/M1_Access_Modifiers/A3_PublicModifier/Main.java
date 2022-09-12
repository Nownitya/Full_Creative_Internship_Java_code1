package Java.M1_Access_Modifiers.A3_PublicModifier;

public class Main {
    public static void main(String[] args) {
        // accessing the public class
        Animal animal = new Animal();

        // accessing the public variable
        animal.legCount = 4;
        // accessing the public method
        animal.display();
    }

}
