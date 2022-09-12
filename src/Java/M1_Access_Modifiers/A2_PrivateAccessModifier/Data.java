package Java.M1_Access_Modifiers.A2_PrivateAccessModifier;

public class Data {
    //  private variable
    private String name;

    //  getter method
    public String getName() {
        return this.name;
    }

    //  setter method
    public void setName(String name) {
        this.name = name;
    }

    String name2;


}

class Main {
    public static void main(String[] args) {

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
//        d.name = "Full Creative";
        d.setName("Full Creative");
        d.name2 = "Full Creative";
    }
}

