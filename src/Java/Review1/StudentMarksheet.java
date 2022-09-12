package Java.Review1;

import java.util.Scanner;

public class StudentMarksheet {
//    int maths;
//    int sciences;
//    int englishs;
//    int hindis;

    public void sub(int math, int science,int english,int hindi) {


//        int add = math + science + english + hindi;
        int add = math + science + english + hindi;
        int per = (add * 100) / 400;
        System.out.println("Total Percentage: "+per+"%");

    }



}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your name");
        String name = input.nextLine();

        System.out.println("Enter Roll Number");
        int rollNo = input.nextInt();

        System.out.println("Maths Mark (Out of 100): ");
        int math = input.nextInt();
        System.out.println("Science Mark (Out of 100): ");
        int science = input.nextInt();
        System.out.println("English Mark (Out of 100): ");
        int english = input.nextInt();
        System.out.println("Hindi Mark (Out of 100): ");
        int hindi = input.nextInt();

        StudentMarksheet marks = new StudentMarksheet();
        marks.sub(math, science, english, hindi);
        System.out.println("Student name: " + name);
        System.out.println("Roll No.: " + rollNo);
        marks.sub(math,science,english,hindi);
    }
}