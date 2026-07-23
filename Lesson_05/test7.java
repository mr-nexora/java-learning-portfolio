package Lesson_05;

public class test7 {
    public static void main(String[] args) {

        // The concat() Method
        String firstName = "John ";
        String lastName = "Doe";

        String txt1 = "Java ";
        String txt2 = " is";
        String txt3 = " fun";
        String txt4 = " language.";

        System.out.println(firstName.concat(lastName));
        System.out.println(txt1.concat(txt2).concat(txt3).concat(txt4));

    }

}
