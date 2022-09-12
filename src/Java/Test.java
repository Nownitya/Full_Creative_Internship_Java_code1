package Java;

import java.util.*;
public class Test {

    public static void main(String args[])
    {
//        int[] a=new int[6];
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Please enter elements...");
//        for(int j=0;j<6;j++)
//            a[j]=sc.nextInt();
//        System.out.println("Array elements are : ");
//        for (int i=0;i<a.length;i++)
//            System.out.println(a[i]);

        ArrayList<String> _name = new ArrayList<>();
        _name.add("Ramesh");
        _name.add("Ram");
        _name.add("Mohan");
        _name.add("Sohan");
        ArrayList<Integer> _roll = new ArrayList<>();
        _roll.add(1);
        _roll.add(2);
        _roll.add(3);
        _roll.add(4);


//        int ind = _roll.indexOf(2);
//        int len = _roll.toArray().length;
//        System.out.println(len);
        String a = "hdf 668";
        System.out.println(a.length());
        check(a);
        System.out.println(check(a));
//        for (int i = 0; i <= a.length(); i++) {
//            if (isNumeric(a)) {
//                return true;
//            }
//            if (!isNumeric(a)) {
//
//            }
//        }
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean check(String a) {

        for (int i = 0; i <= a.length(); i++) {
            if (isNumeric(a)) {
                return true;
            }else if (!isNumeric(a)) {
                return true;

            }

            System.out.println(a);
        }
        System.out.println("1");
        System.out.println("2");
        return false;
    }

}
