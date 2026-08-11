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

# Operators and Math
This section covers the core fundamentals of **Java Operators** and built-in **Math Methods**. It includes practical code snippets, explanations, and visual outputs for better understanding.

## Java Operators
Operators are special symbols in Java used to perform operations on variables and values.

### A. Arithmetic Operators

#### Addition (x + y)
Adds two values together.
```java
        System.out.println("Addition: " + (x + y));
```

#### Subtraction (x - y)
Subtracts one value from another.
```java
        System.out.println("Subtraction: " + (x - y));
```

#### Multiplication (x \* y)
Multiplies two values.
```java
        System.out.println("Multiplication: " + (x * y));
```

#### Division (x / y)
Divides one value by another.
>Note: Integer division truncates the decimal part unless float/double types are used.
```java
        System.out.println("Division: " + (x / y));
```

#### Modulus (x % y)
Returns the division remainder.
```java
        System.out.println("Modulus: " + (x % y));
```

#### Increment (++x)
Increases the value of a variable by 1 (Pre-increment).
```java
        System.out.println("Increment: " + (++x));
```

#### Decrement (--x)
Decreases the value of a variable by 1 (Pre-decrement).
```java
        System.out.println("Decrement: " + (--x));
```

![Output](img/1.jpg)

### B. Assignment Operators
Assignment operators are used to assign values to variables, often combined with arithmetic operations.
#### Assigns value (=)

```java
    int x = 5;
```

#### Addition assignment (+=)

```java
    x += 3;
```

#### Subtraction assignment (-=)

```java
    x -= 3;
```

#### Multiplication assignment (\*=)

```java
    x *= 3;
```

#### Division assignment (/=)

```java
    x /= 3;
```

#### Modulus assignment (%=)

```java
    x %= 3;
```

#### Bitwise AND assignment (&=)

```java
    x &= 3;
```

#### (|=)

```java
    x |= 3;
```

#### Bitwise XOR assignment (^=)

```java
    x ^= 3;
```

#### Right shift assignment (>>=)

```java
    x >>= 3;
```

#### Left shift assignment (<<=)

```java
    x <<= 3;
```

![Output](img/2.jpg)

---

### C. Logical Operators
Logical operators are used to determine the logic between variables or values, returning boolean values (`true` or `false`).

#### Logical And (&&)
Returns `true` if both statements are true.
```java
        System.out.println("Logical And Output: " + (x >= 10 && x <20));
```

#### Logical Or (||)
Returns `true` if at least one of the statements is true.
```java
        System.out.println("Logical Or Output: " + (x>30 || x ==10));
```

#### Logical Not (!)
Reverse the result, returns `false` if the result is true.
```java
        System.out.println("Logical Not Output: " + !(x>=10 && x<20));
```

![Output](img/3.jpg)

### D. Operator Precedence
Operator precedence determines the order in which operations are evaluated in an expression.

1. Parentheses ()
2. Unary Operators (++, --, !)
3. Multiplicative (*, /, %)
4. Additive (+, -)
5. Relational (<, >, <=, >=)
6. Equality (==, !=)
7. Logical AND (&&)
8. Logical OR (||)
9. Assignment (=, +=, -=, etc.)
---

## Java Math
The `java.lang.Math` class provides several built-in methods to perform mathematical tasks on numbers without creating an object.

### Math.max(x,y)
Finds the highest value between x and y.
```java
        System.out.println("\nMath.max(x,y): ");
        System.out.println(Math.max(10,45));
```

![Output](img/4.1.jpg)

### Math.min(x,y)
Finds the lowest value between x and y.
```java
        System.out.println("\nMath.min(x,y): ");
        System.out.println(Math.min(5,10));
```

![Output](img/4.2.jpg)

### Math.sqrt(x)
Returns the square root of x.
```java
        System.out.println("\nMath.sqrt(x): ");
        System.out.println(Math.sqrt(64));
```

![Output](img/4.3.jpg)

### Math.abs(x)
Returns the absolute (positive) value of x.
```java
        System.out.println("\nMath.abs(x): ");
        System.out.println(Math.abs(30));
```

![Output](img/4.4.jpg)

### Math.pow(x,y)
Returns the value of x raised to the power of y ($x^y$).
```java
        System.out.println("\nMath.pow(x,y): ");
        System.out.println(Math.pow(2,3));
```

![Output](img/4.5.jpg)

### Rounding Methods
- `Math.round(x)`: Rounds to the nearest integer.
- `Math.ceil(x)`: Rounds up to the nearest whole integer.
- `Math.floor(x)`: Rounds down to the nearest whole integer.
```java
        System.out.println("\nRounding Methods: ");
        System.out.println(Math.round(3.6));
        System.out.println(Math.ceil(35.4));
        System.out.println(Math.floor(2.6));
```

![Output](img/4.6.jpg)

### Random Numbers
`Math.random()` returns a random double value strictly greater than or equal to` 0.0` and less than `1.0`.
```java
        System.out.println("\nRandom Numbers: ");
        System.out.println(Math.random());
```

![Output](img/4.7.jpg)

---
