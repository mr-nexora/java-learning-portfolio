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

# Booleans and Decision Making

Conditional logic allows Java programs to make decisions based on changing conditions. This section covers **Boolean expressions**, conditional statements (**`if`**, **`else`**, **`else if`**), the **ternary operator**, **nested conditions**, and the **`switch`** statement.

## Java Booleans

A Java boolean data type can only take one of two values: `true` or `false`. They are most commonly evaluated using comparison and logical operators.

```java
    int x = 10;
        int y = 15;
        System.out.println("X > Y = " + (x>y));

        // Eg 02
        boolean isStudent = true;
        if (isStudent) {
            System.out.println("Your are Student");
        }
        else {
            System.out.println("You are NOT a Student");
        }
```

![Output](img/1.jpg)

---

## Java If...Else

- Java supports standard logical conditions:
- Less than: a < b
- Less than or equal to: a <= b
- Greater than: a > b
- Greater than or equal to: a >= b
- Equal to: a == b
- Not Equal to: a != b

### if Statement

Executes a block of Java code only if a specified condition evaluates to `true`.

```syntax
if (condition) {
// block of code to be executed if the condition is true
}
```

```java
    // test2.java
    boolean isRaining = true;

        if (isRaining) {
            System.out.println("Bring an umbrella!");
        }
```

![Output](img/2.1.jpg)

### else Statement

Executes a block of Java code if the same condition evaluates to `false`.

```syntax
if (condition) {
// block of code to be executed if the condition is true
} else {
// block of code to be executed if the condition is false
}
```

```java
    // test3.java
    boolean isRaining = true;

        if (isRaining) {
            System.out.println("Bring an umbrella!");
        }
```

![Output](img/2.2.jpg)

### else if Statement

Specifies a new condition to test if the first condition evaluates to `false`.

```syntax
if (condition1) {
// block of code to be executed if condition1 is true
} else if (condition2) {
// block of code to be executed if condition1 is false and condition2 is true
} else {
// block of code to be executed if both conditions are false
}
```

```java
    // test4.java
    int mark = 60;
        if (mark >= 75) {
            System.out.println("Your Grade is A");
        } else if (mark >= 65) {
            System.out.println("Your Grade is B");
        } else if (mark >= 65) {
            System.out.println("Your Grade is C");
        } else if (mark >= 55) {
            System.out.println("Your Grade is D");
        } else if (mark >= 45) {
            System.out.println("Your Grade is E");
        } else {
            System.out.println("You ar Fail");
        }
```

![Output](img/2.3.jpg)

### Short Hand if - else Statement

The ternary operator consists of three operands and is used as a concise alternative to simple `if...else` blocks.

```syntax
variable = (condition) ? expressionTrue: expressionFalse;
```

```java
    // test5.java

        String result = (isStudent) ? "You are Student" : "You are NOT Student";
        System.out.println(result);

```

![Output](img/2.4.jpg)

#### Nested Ternary

Multiple conditions can be chained sequentially using ternary expressions.

```java
    // test6.java
    int time = 20;
        String result = (time <12) ? "Good Morning"
                      : (time <18) ? "Good Afternoon"
                      : "Good Evening";

        System.out.println(result);
```

![Output](img/2.5.jpg)

### Nested if Statement

You can include an `if` block inside another `if` or `else` block to check multiple dependent layer conditions.

```syntax
if (condition1) {
// code to run if condition1 is true
if (condition2) {
// code to run if both condition1 and condition2 are true
}
}
```

```java
    // test7.java
    int age = 20;
        boolean isCitizen = true;

        if (age >= 18) {
            System.out.println("Old enough to vote");

            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote!");
            } else {
                System.out.println("But you must be a citizen to vote!");
            }

        } else {
            System.out.println("Not old enough to vote");
        }
```

## ![Output](img/2.6.jpg)

## Java Switch

Use the `switch` statement to select one of many code blocks to be executed based on matching values.

```syntax
    switch(expression) {
    case x:
        // code block
        break;
    case y:
        // code block
        break;
    default:
        // code block
    }
```

```java
    // test8.java
    int dayNo = 2;

        switch (dayNo) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please add the vaild Input");
        }
```
