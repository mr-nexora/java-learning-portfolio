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

# Working with Strings

In Java, a **String** is an object that represents a sequence of characters. This section covers string declaration, common built-in string methods, string concatenation, and special escape characters.

## Java Strings

A String variable contains a collection of characters surrounded by double quotes.

```java
    // Syntax
    String name = "Hello";
```

## String Methods

The java.lang.String class provides useful methods for manipulating and performing operations on strings.

### Length() Method

Returns the total number of characters in a string.

```java
    // test1.java
        String text = "ASDFGHJKLQWERTYUIOPZXCVBNM";
        System.out.println("Text Length: " + text.length());
```

![Output](img/1.jpg)

### Uppercase() Method

`toUpperCase()`: Converts all characters to uppercase.

```java
    // test2.java
    System.out.println(txt.toUpperCase());
```

### Lowercase() Method

`toLowerCase()`: Converts all characters to lowercase.

```java
    // test2.java
    System.out.println(txt.toLowerCase());
```

## ![Output](img/2.jpg)

### IndexOf() Method

Returns the zero-based index position of the first occurrence of a specified text in a string (including whitespace). Returns `-1` if the target is not found.

```java
    // test3.java
    String txt = "My name is John Doe";
    System.out.println("Index is: " + txt.indexOf("John"));
```

![Output](img/3.jpg)

### CharAt() Method

Returns the character at the specified index position within the string.

```java
    // test4.java
    System.out.println(txt.charAt(0));
    System.out.println(txt.charAt(3));
```

![Output](img/4.jpg)

### equals() Method

Compares two strings for literal equality and returns a boolean value (`true` or `false`).

```java
    // test5.java
    String txt1 = "Hello";
        String txt2 = "Hello";
        String txt3 = "User";

    System.out.println(txt1.equals(txt2));
    System.out.println(txt1.equals(txt3));
```

![Output](img/5.jpg)

### trim() Method
Removes leading and trailing whitespace from both ends of a string.
```java
    // test6.java
    String txt = "   Hello World!   ";
        System.out.println("Before: [" + txt + "]");
        System.out.println("After: [" + txt.trim() + "]");
```

![Output](img/6.jpg)

## Java String Concatenation
String concatenation combines multiple strings together. This can be achieved using the + operator or the `.concat()` method.

### The concat() Method
Appends one string to the end of another, and can be chained to join multiple strings sequentially.
```java
    // test7.java
    String firstName = "John ";
        String lastName = "Doe";

        String txt1 = "Java ";
        String txt2 = " is";
        String txt3 = " fun";
        String txt4 = " language.";

        System.out.println(firstName.concat(lastName));
        System.out.println(txt1.concat(txt2).concat(txt3).concat(txt4));
```

![Output](img/7.jpg)

## Java Special Characters

    Escape character	Result	Description
    \'	'	Single quote
    \"	"	Double quote
    \\	\	Backslash


---
