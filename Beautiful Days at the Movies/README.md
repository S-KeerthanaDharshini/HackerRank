# [Beautiful Days at the  Movies](https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem)
`Easy` | `Reverse`
## Problem Description
Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse.

For instance:
- Given number **12**, its reverse is **21**. Difference = `|12 - 21| = 9`
- Number **120** reversed is **21**, Difference = `|120 - 21| = 99`

She will look at a numbered range of days and only go to a movie on a beautiful day.

## Input Format:
- A range of numbered days `[i...j]`
- A number `k`

A **beautiful day** is defined where:  
`|i - reverse(i)| % k == 0`

Return the **number of beautiful days** in the range.

## Sample Input

20 23 6
## Sample Output

2

## 📚 Additonal Resources

-  [Java Math.abs()](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#abs-int-)

-  [HackerRank Java Practice Problems](https://www.hackerrank.com/domains/tutorials/10-days-of-java)