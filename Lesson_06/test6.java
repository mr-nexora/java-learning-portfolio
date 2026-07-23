package Lesson_06;

public class test6 {
    public static void main(String [] args) {

        // Nested Ternary 
        int time = 20;
        String result = (time <12) ? "Good Morning"
                      : (time <18) ? "Good Afternoon"
                      : "Good Evening";

        System.out.println(result);

        }
    }