package Java;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        String str = "abcdy 123";
        ArrayList<String> aa = new ArrayList<>();
        ArrayList<Integer> bb = new ArrayList<>();
        aa.add("now");
        aa.add("now");
        bb.add(2);
        bb.add(3);
        bb.add(4);

        System.out.println(bb);
        System.out.println(bb.size());
        System.out.println(bb.get(1));
        for (int i = 0; i <= bb.size()-1; i++) {
            System.out.println(bb.get(i));
        }

        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine() ;
        System.out.println(a);
//        String b = (String) a;
//        System.out.println(a);
        if (a.contains(" ")) {
            String[] part = a.split("(?<=\\D)(?=\\d)");
            System.out.println(part[0]);
            System.out.println(part[1]);
            if (aa.contains(part[0])) {
                System.out.println("Matched");
            } else {
                System.out.println("Not Matched");
            }
        } else {
            System.out.println("2");
        }


    }




//        public static void main(String[] args) {
//            Scanner myObj = new Scanner(System.in);
//            System.out.println("Enter username");
//            String userName = myObj.nextLine();
//
//            System.out.println("Username is: " + userName);
//        }

}
