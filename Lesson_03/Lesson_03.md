# Variables and Data Types

## Java Variables

```syntax
type variableName = value;
```

#### String Variables

```java
    // test1.java
    String myName = "John Doe";
    System.out.println("Name: " + myName);
```

![Output](img/1.1.jpg)

#### Int Variables

```java
    // test1.java
    int myAge = 23;
    System.out.println("Age: " + myAge);
```

![Output](img/1.2.jpg)

#### Float Variables

```java
    // test1.java
    float myGpa = 53.45f;
    System.out.println("GPA: " + myGpa);
```

![Output](img/1.3.jpg)

#### Char Variables

```java
    // test1.java
    char myGrade = 'A';
    System.out.println("Grade: " + myGrade);
```

![Output](img/1.4.jpg)

#### Boolean Variables

```java
    // test1.java
    boolean isStudent = true;
        if (isStudent) {
            System.out.println("Yor are student");
        }
```

## ![Output](img/1.5.jpg)

#### Final Variables

```java
    // test2.java
    final int myNum = 15;
    System.out.println("Number: " + myNum);
```

## ![Output](img/2.jpg)

---

### Java Print Variables

#### Display Variables

```java
    // test3.java
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
```

![Output](img/3.jpg)

### Java Declare Multiple Variables

#### Declare Many Variables

```java
    // test4.java
    int p = 3;
        int q = 5;
        int r = 10;
        int sum = p+q+r;

        System.out.println("Sum of Numebers: " + sum);
```

![Output](img/4.1.jpg)

### One Value to Multiple Variables

```java
    // test5.java
    int x, y, z;
        x = y = z = 10;
        System.out.println("Sum of Numbers: " + (x + y + z));
```

![Output](img/4.2.jpg)

---

### Identifiers

```java
     // Good
        int minutesPerHour = 60;

    // OK, but not so easy to understand what m actually is
        int m = 60;
```

![Output](img/5.jpg)

#### Invalid Identifiers

```java
    int 3rdNumber = 10;
    int my num = 15;
    int int = 40;
```

![Output](img/6.jpg)

---
## Java Data Types

```java
    int myNum = 5; // Integer (whole number)
    float myFloatNum = 5.99f; // Floating point number
    char myLetter = 'D'; // Character
    boolean myBool = true; // Boolean
    String myText = "Hello"; // String
```

![Output](img/7.jpg)

### Primitive Data Types

    - byte
    - short
    - int
    - long
    - float
    - double boolean
    - char

### The var Keyword

```java
    var myNum = 5; // Integer (whole number)
    var myFloatNum = 5.99f; // Floating point number
    var myLetter = 'D'; // Character
    var myBool = true; // Boolean
    var myText = "Hello"; // String
```

![Output](img/8.jpg)

#### Important Notes
1. var only works when you assign a value at the same time (you can't declare var x; without assigning a value):

```java
var x; // Error
var x = 5;  // OK
```
2. Once the type is chosen, it stays the same. See example below:

```java
var x = 5;  // x is now an int
x = 10;     // OK - still an int
x = 9.99;   // Error - can't assign a double to an int
```
## Type Casting

---

## ⚖️ Copyright & Licensing

**Copyright © 2026 T.M.S.U. Thennakoon (Sahan Udara). All rights reserved.**

This documentation, code implementations, structured syllabus, and associated assets are part of the **Java Zero to Hero** learning roadmap, independently curated, structured, and maintained by **Sahan Udara (Mr. Nexora)** under the umbrella brand **SU Nexora**.

- **Author Profiles:** [GitHub](https://github.com/mr-nexora) | [LinkedIn](https://www.linkedin.com/in/mrnexora/)
- **Permitted Use:** This material is strictly intended for personal education, reference, and open-source project showcasing. You are welcome to study, reference, and fork this repository for non-commercial educational purposes.
- **Restrictions:** Unauthorized duplication, plagiarism, re-hosting, or redistribution of these compiled notes, structural curriculum design, and step-by-step explanations on other websites, courses, or commercial media without explicit prior written consent from the author is strictly prohibited.

_All structural updates, code solutions, and verified execution screenshots belong to the author's personal portfolio assets._
