package JavaCodeExamples.ObjectAndClass;

//  Java program to create an enum class

import com.sun.glass.ui.Size;

enum Size1 {
    //  enum constants
    SMALL, MEDIUM, LARGE, EXTRALARG;

    public String getSize() {
        //  this will refer to the object SMALL
        switch (this) {
            case SMALL:
                return "small";
            case MEDIUM:
                return "medium";
            case LARGE:
                return "large";
            case EXTRALARG:
                return "extra large";

            default:
                return null;
        }
    }


}

public class Main4 {
    public static void main(String[] args) {
        //  call the method getSize()
        //  using the object SMALL
        System.out.println("The size of Pizza I get is " + Size1.SMALL.getSize());

        //  call the method getSize()
        //  using the object Large
        System.out.println("The size of Pizza I want is " + Size1.LARGE.getSize());

    }


}
