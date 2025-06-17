# [Java Instanceof Keyword](https://www.hackerrank.com/challenges/java-instanceof-keyword/problem)

## Problem Statement

The Java `instanceof` operator is used to test if an object is an instance of a specified type.

In this problem, you are given **three classes** in the editor:

- `Student` class  
- `Rockstar` class  
- `Hacker` class

In the `main` method, an `ArrayList` is populated with several instances of these classes. The `count` method is used to **calculate how many instances** of each type are present in the list.

The goal is to **complete the missing lines** of code so that the program prints **three integers**:  

- Number of instances of `Student`  
- Number of instances of `Rockstar`  
- Number of instances of `Hacker`

⚠️ You must **only modify specific lines** as indicated in the editor. Do **not** add, delete, or modify any other lines.

---

## Sample Input

5
Student
Student
Rockstar
Student
Hacker


## Sample Output

3 1 1



## Explanation

- Three instances of `Student` were added to the list.
- One instance of `Rockstar` was added.
- One instance of `Hacker` was added.
- The `instanceof` operator is used inside the `count` method to identify the type of each object in the list.

## Additional Java Resources

- [Java instanceof Operator – Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)
- [Java instanceof Explained – GeeksforGeeks](https://www.geeksforgeeks.org/java-instanceof-keyword/)
- [ArrayList in Java – JavaTPoint](https://www.javatpoint.com/java-arraylist)
- [Java Type Checking](https://www.w3schools.com/java/ref_keyword_instanceof.asp)
