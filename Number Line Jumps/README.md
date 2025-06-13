# [Number Line Jumps](https://www.hackerrank.com/challenges/kangaroo/problem)

## Problem Description

You are choreographing a circus act with two kangaroos on a number line.  
Each kangaroo makes jumps in the positive direction.

- Kangaroo 1 starts at position `x1` and makes jumps of distance `v1`.
- Kangaroo 2 starts at position `x2` and makes jumps of distance `v2`.

You need to determine whether **both kangaroos can land on the same location at the same time** after making the same number of jumps.

If so, return `YES`; otherwise, return `NO`.

---

## Example

### Input
 0 3 4 2
 
### Output
YES

### Explanation

- Kangaroo 1 starts at 0 and jumps 3 meters per jump → 0, 3, 6, 9...
- Kangaroo 2 starts at 4 and jumps 2 meters per jump → 4, 6, 8, 10...

At the second jump, both are at position 6.


## Input Format

A single line containing four space-separated integers:
x1 v1 x2 v2

## Function Description

### `kangaroo(x1, v1, x2, v2)`

#### Parameters:
- `x1`: starting position of kangaroo 1
- `v1`: jump distance of kangaroo 1
- `x2`: starting position of kangaroo 2
- `v2`: jump distance of kangaroo 2

#### Returns:
- `string`: "YES" if they meet at the same location after the same number of jumps, otherwise "NO"



## Additional Resources

- [📘 GeeksforGeeks: Mathematical explanation of meeting point](https://www.geeksforgeeks.org/find-if-two-trains-meet-or-not/)
- [📺 YouTube: Number Line Jumps HackerRank Solution](https://www.youtube.com/results?search_query=kangaroo+number+line+jumps+hackerrank+solution)

