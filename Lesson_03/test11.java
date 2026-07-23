package Lesson_03;

public class test11 {
    public static void main(String [] args) {

        /* NarrowingDemo.java */
        double myDouble = 9.78d;
        
        // Manual casting: double to int
        int myInt = (int) myDouble; 

        System.out.println("Original Double value: " + myDouble); // Outputs 9.78
        System.out.println("Narrowed Integer value: " + myInt);   // Outputs 9 (Fraction is lost!)
    }

}
