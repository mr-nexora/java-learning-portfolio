<div align="center">

# 🚀 Java Learning Portfolio

### Building My Full Stack Development Journey, One Lesson at a Time.

<img src="https://img.shields.io/badge/Status-In%20Progress-00C853?style=for-the-badge" />
<img src="https://img.shields.io/badge/Lessons-15%2B-2196F3?style=for-the-badge" />
<img src="https://img.shields.io/badge/Language-JAVA-E34F26?style=for-the-badge&logo=html5&logoColor=white" />

<br><br>

<a href="https://github.com/mr-nexora">
<img src="https://img.shields.io/badge/GitHub-mr--nexora-181717?style=for-the-badge&logo=github&logoColor=white"/>
</a>

<a href="https://www.linkedin.com/in/mrnexora/">
<img src="https://img.shields.io/badge/LinkedIn-Sahan%20Udara-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"/>
</a>

<a href="https://mr-nexora.github.io/mr-nexora-personal-portfolio/">
<img src="https://img.shields.io/badge/Portfolio-Visit%20Website-6C63FF?style=for-the-badge&logo=googlechrome&logoColor=white"/>
</a>

</div>

---

# 👋 Welcome

Welcome to my **Java Learning Repository**.

## This repository documents my complete learning journey in Java as part of my Full Stack Development roadmap. Every lesson includes well-organized source code, explanations, screenshots, practice exercises, and mini projects to strengthen my object-oriented programming, problem-solving, and application development skills.

# 📂 Repository Overview

| 📌 Information        | Details                                    |
| :-------------------- | :----------------------------------------- |
| 👨‍💻 Author             | **T.M.S.U. Thennakoon (Sahan Udara)**      |
| 🎓 Program            | Computer Science Undergraduate             |
| 💻 Technology         | Java                                       |
| 📚 Learning Method    | Daily Lessons & Hands-on Practice          |
| 🎯 Goal               | Become a Professional Full Stack Developer |
| 📅 Repository Started | 2026                                       |

---

# ✨ What's Inside

- 📖 Structured Lessons
- 💻 Source Code
- 📷 Output Screenshots
- 📝 Markdown Notes
- 🚀 Mini Projects
- 📚 Practice Exercises
- 📈 Continuous Progress Updates

---

# 🌍 Connect With Me

<div align="center">

<a href="https://github.com/mr-nexora">
<img src="https://img.shields.io/badge/GitHub-Follow-181717?style=for-the-badge&logo=github"/>
</a>

<a href="https://www.linkedin.com/in/mrnexora/">
<img src="https://img.shields.io/badge/LinkedIn-Connect-0077B5?style=for-the-badge&logo=linkedin"/>
</a>

<a href="https://mr-nexora.github.io/mr-nexora-personal-portfolio/">
<img src="https://img.shields.io/badge/Portfolio-Visit-6C63FF?style=for-the-badge&logo=googlechrome"/>
</a>

</div>

---

# 📚 Learning Resources

This repository is built through continuous practice using educational resources such as:

- W3Schools
- MDN Web Docs
- freeCodeCamp

---

# ⚖️ Copyright

> **© 2026 T.M.S.U. Thennakoon (Sahan Udara). All Rights Reserved.**
>
> This repository has been created for educational, portfolio, and personal learning purposes.
>
> You are welcome to explore the code and learn from it. However, copying, redistributing, or presenting this work as your own without permission is not allowed.

---

<div align="center">

⭐ If you find this repository useful, consider giving it a Star.

Happy Coding! 🚀

</div>

---

# ☕ L02: Java Syntax & Output

Welcome to the second lesson of your Java journey! In this lesson, we will dissect the structural grammar (Syntax) of a Java program and explore the various methods available to print outputs to the console.

---

## 📖 1. Java Syntax

Java syntax is the set of rules defining how a Java program is written and interpreted. Understanding this structure is essential for writing error-free code.



### Key Components of Java Syntax:

1. **The Class Declaration:**
   * Every line of code in Java must live inside a **Class**. 
   * In our example, `public class SyntaxDemo` defines a class named `SyntaxDemo`.
   * **Rule:** The class name *must* exactly match the physical file name (e.g., `SyntaxDemo.java`). Java is **case-sensitive**, so `syntaxdemo` and `SyntaxDemo` are different.

2. **The `main()` Method:**
   * The line `public static void main(String[] args)` is the absolute entry point of any execution.
   * **`public`**: Accessible from anywhere.
   * **`static`**: Can be run without creating an object of the class.
   * **`void`**: Does not return any value.
   * **`main`**: The exact method name the JVM looks for.
   * **`String[] args`**: Accepts parameters as an array of strings from the command line.

3. **Statements and Semicolons:**
   * Each executable instruction is called a **statement** and *must* end with a semicolon (`;`). Missing a semicolon is one of the most common syntax errors in Java.

4. **Curly Braces `{}`:**
   * Curly braces define the beginning and the end of a block of code (like a class or a method).

---

## 🖥️ 2. Java Output (System.out Methods)

To print text or values to the screen, Java uses the built-in `System` class. However, there isn't just one way to print. Depending on your requirement, you can use different stream methods.

### Output Methods Comparison:

| Method | Description | Behavior |
| :--- | :--- | :--- |
| `System.out.print()` | Prints text to the terminal. | Keeps the cursor on the **same line** for the next print. |
| `System.out.println()` | Prints text and inserts a newline. | Moves the cursor to the **next line** automatically. |
| `System.out.printf()` | Prints formatted strings (using specifiers). | Allows complex string formatting (like limiting decimal places). |
| `System.err.println()` | Prints to the standard error stream. | Typically outputs text in **red color** in most IDE consoles. |

---

## 💻 3. Code Implementation

### Source Code: `SyntaxDemo.java`
```java
    /* test1.java */

        // 1. Using println() - Automatic line break
        System.out.println("--- 1. println() Demonstration ---");
        System.out.println("Hello,");
        System.out.println("Sahan!");

        // 2. Using print() - Stays on the same line
        System.out.println("\n--- 2. print() Demonstration ---");
        System.out.print("Hello, ");
        System.out.print("Sahan!");
        System.out.println();

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
```
![Output](img/1.jpg)

## Java Comments
Comments are non-executable statements in a Java program. The Java compiler (`javac`) completely ignores comments during compilation, meaning they do not affect the execution speed or file size of your compiled bytecode.

### Why Use Comments?
* **Code Documentation:** Explains what the code does, making it readable for other developers or your future self.
* **Code Testing (Commenting Out):** Temporarily disables specific lines of code during debugging without deleting them.

---

### 🟢 Types of Comments in Java

Java supports three distinct types of comments: **Single-Line**, **Multi-Line**, and **Documentation** comments.

#### 1. Single-Line Comments
Single-line comments start with two forward slashes (`//`). Any text between `//` and the end of that specific line is completely ignored by Java.

```java
    // This is a Single-Line Comment
```
### 2. Multi Line Comment
Multi-line comments start with /* and end with */. Any text placed between these delimiters, spanning across multiple lines, is treated as a comment.

```java
    /* This 
    is 
    a 
    Multi-Line 
    Comment */    
```
---
