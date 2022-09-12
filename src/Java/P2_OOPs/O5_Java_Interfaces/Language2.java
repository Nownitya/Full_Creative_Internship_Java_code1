package Java.P2_OOPs.O5_Java_Interfaces;




interface English11  {
    public static void speak() {
        System.out.println("Speaks in english ");
    }

    default void write() {
        System.out.println("Write in english");

    }

    void grammar();


}

//interface Hindi11  {
//    void speak();
//    void write();
//}

class Language11 implements English11 {


    @Override
    public void write() {
        English11.super.write();
    }


    public void grammar() {
        System.out.println("English Grammar");

    }
}
class Main {
    public static void main(String[] args) {
        Language11 language = new Language11();
        language.write();
        language.grammar();

        English11.speak();


    }
}
