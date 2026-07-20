package Lesson_03;

public class test3 {
    public static void main (String[] args) {

        // Print Variables
        String firstName = "John";
        String lastName = "Doe";
        int myAge = 23;
        double myGpa = 3.45;
        char myGrade = 'A';
        int mark1 = 20, mark2 = 45, mark3 = 50;

        System.out.println("My name is " + firstName + " " + lastName);
        System.out.println("I'm " + myAge + " years old.");
        System.out.println("My GPA is " + myGpa + " and my grade is " + myGrade);
        System.out.println("My exam marks are " + mark1 + ", " + mark2 + " and " + mark3);
        System.out.println("Total mark: " + (mark1+mark2+mark3));
        System.out.println("Average mark: " + (mark1+mark2+mark3)/3);

    }
    
}
