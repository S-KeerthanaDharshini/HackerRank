# [The Hurdle Race](https://www.hackerrank.com/challenges/the-hurdle-race/problem)
`Implementation` | `Easy`

## 📝 Problem Statement
A video game character competes in a hurdle race. Each hurdle has a different height, and the character can naturally jump up to a certain height `k`.

The character can take doses of a magic potion to increase their jump height by 1 unit per dose. Your task is to calculate the **minimum number of doses** required for the character to be able to jump all the hurdles.

If the character can already jump all hurdles, return 0.

## 📊 Example

### Input
n = 5, k = 4
heights = [1, 6, 3, 5, 2]

### Output
2


**Explanation:** The tallest hurdle is of height `6`, but the character can only jump up to `4`.  
So, `6 - 4 = 2` doses of the potion are needed.


## Additional Resources 
- [Java Collections.max()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#max-java.util.Collection-)

- [Math.max()](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#max-int-int-)

