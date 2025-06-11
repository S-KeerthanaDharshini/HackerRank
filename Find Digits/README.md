# [Find Digits](https://www.hackerrank.com/challenges/find-digits/problem)

## 📌 Problem Statement

An integer `d` is a **divisor** of an integer `n` if `n % d == 0`.

Given a positive integer `n`, determine how many of its digits **evenly divide** `n`.  
Return the **count** of such digits.

❗ Digits **equal to 0** should be skipped, as division by zero is undefined.

---

## 💡 Example

### Example 1:
n = 124
Digits = [1, 2, 4]
All digits divide 124 
Output: 3

### Example 2:
n = 10
Digits = [1, 0]
Only 1 divides 10 → 
Output: 1


---

## 🔧 Function Description

### `findDigits(n)`

#### Parameters:
- `int n`: the integer to analyze

#### Returns:
- `int`: number of digits in `n` that divide `n` evenly

---

## 📝 Input Format

- The first line contains a single integer, `t`, the number of test cases.
- Each of the following `t` lines contains a single integer `n`.





##  Sample Input
2
12
1012

##  Sample Output
2
3



##  Explanation

### For `n = 12`:
- Digits: 1 and 2
- 12 % 1 == 0 → ✅  
- 12 % 2 == 0 → ✅  
→ Output: 2

### For `n = 1012`:
- Digits: 1, 0, 1, 2
- 1012 % 1 == 0 → ✅  
- 1012 % 0 → ❌ (skip)  
- 1012 % 1 == 0 → ✅  
- 1012 % 2 == 0 → ✅  
→ Output: 3



## 📚 Additional Resources

- [📺 YouTube: Find Digits HackerRank Solution Walkthrough](https://www.youtube.com/results?search_query=find+digits+hackerrank+solution)
- [📘 GeeksforGeeks: Count Digits that Divide a Number](https://www.geeksforgeeks.org/count-digits-divide-number/)
