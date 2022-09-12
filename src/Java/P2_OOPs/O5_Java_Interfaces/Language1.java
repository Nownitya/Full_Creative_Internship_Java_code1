package Java.P2_OOPs.O5_Java_Interfaces;

//  Java Interface
interface Language1 {
    void getName(String name);
}

//  class implements interface
class ProgrammingLanguage1 implements Language1 {

    public void getName(String name) {
        System.out.println("Programming Language: " + name);
    }
}

class Main2 {
    public static void main(String[] args) {
        ProgrammingLanguage1 language = new ProgrammingLanguage1();

        language.getName("Java "+"\nKotlin ");
    }
}


