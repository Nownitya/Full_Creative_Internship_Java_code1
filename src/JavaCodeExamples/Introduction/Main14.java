package JavaCodeExamples.Introduction;

class CheckString1 {
    //  Check if String is Empty or Null
    public void ex1() {
        //  Create null, empty, and regular strings
        String str1 = null;
        String str2 = "";
        String str3 = " ";

        //  Check if str1 is null or empty
        System.out.println("str1 is " + isNullEmpty1(str1));

        //  Check if str2 is null or empty
        System.out.println("str2 is " + isNullEmpty1(str2));

        //  Check if str3 is null or empty
        System.out.println("str3 is " + isNullEmpty1(str3));

    }

    public void ex2() {
        //  create a string with white spaces
        String str = "    ";

        //  check if str1 is null or empty
        System.out.println("str is " + isNullEmpty2(str));

    }

    //  method check if string is null or empty
    private String isNullEmpty1(String str) {
        //  check if string is null
        if (str == null) {
            return "NULL";
        } else if (str.isEmpty()) {        //  check if string is empty
            return "EMPTY";
        } else {
            return "neither NULL nor EMPTY";
        }
    }
    private String isNullEmpty2(String str) {
        //  check if string is null
        if (str == null) {
            return "NULL";
        } else if (str.trim().isEmpty()) {        //  check if string is empty
            return "EMPTY";
        } else {
            return "neither NULL nor EMPTY";
        }
    }
}

public class Main14 {
    public static void main(String[] args) {
        CheckString1 checkString = new CheckString1();
        checkString.ex1();
        System.out.println("--------------------------------------------------");
        checkString.ex2();
    }

}
