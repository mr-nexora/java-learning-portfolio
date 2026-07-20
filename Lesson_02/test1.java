package Lesson_02;

public class test1 {
    public static void main(String[] args) {

        // 1. Using println() - Automatic line break
        System.out.println("--- 1. println() Demonstration ---");
        System.out.println("Hello,");
        System.out.println("Sahan!");

        // 2. Using print() - Stays on the same line
        System.out.println("\n--- 2. print() Demonstration ---");
        System.out.print("Hello, ");
        System.out.print("Sahan!");
        System.out.println(); // Just moves cursor to the next line

        // 3. Using printf() - Formatted text
        System.out.println("\n--- 3. printf() Demonstration ---");
        String name = "Mr. Nexora";
        int age = 22;
        double progress = 95.5;

        // %s = String, %d = Integer, %.1f = Double with 1 decimal place, %n = Newline
        System.out.printf("Developer: %s %nAge: %d %nProgress: %.1f%% %n", name, age, progress);

        // 4. Using System.err - Error output stream (Console displays this in Red)
        System.out.println("\n--- 4. System.err Demonstration ---");
        System.err.println("Warning: This is a standard error console message!");
    }
}