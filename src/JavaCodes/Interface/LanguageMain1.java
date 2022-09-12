package JavaCodes.Interface;

interface Language1 {
    void getName(String name);

}

class ProgrammingLanguage1 implements Language1{

    @Override
    public void getName(String name) {
        System.out.println("Programming Language " + name);
    }
}
public class LanguageMain1 {
    public static void main(String[] args) {
        ProgrammingLanguage1 language = new ProgrammingLanguage1();
        language.getName("java");
    }
}
