# [Sales by Match](https://www.hackerrank.com/challenges/sock-merchant/problem)

## Problem Description

You are given a pile of socks. Each sock is labeled with an integer representing its color.  
Your task is to count how many **matching pairs** of socks are there.

A pair is two socks of the **same color**.


## Example

### Input
n = 7
ar = [1, 2, 1, 2, 1, 3, 2]

### Output
2

### Explanation

- There are:
  - Three socks of color 1 → 1 pair, 1 leftover
  - Three socks of color 2 → 1 pair, 1 leftover
  - One sock of color 3 → no pair

→ Total number of matching pairs = **2**



## Function Description

### `sockMerchant(n, ar)`

#### Parameters:
- `int n`: the number of socks in the pile
- `int ar[n]`: the colors of the socks

#### Returns:
- `int`: the total number of matching pairs



## Input Format

- The first line contains a single integer, `n`, the number of socks.
- The second line contains `n` space-separated integers `ar[i]`, the color of each sock.



### Explanation

- Colors and counts:
  - 10 → 4 socks → 2 pairs
  - 20 → 3 socks → 1 pair
  - 30, 50 → 1 sock each → no pairs

→ Total pairs = **3**



## Additional Resources

- [📘 GeeksforGeeks: Count Pairs in Array](https://www.geeksforgeeks.org/count-pairs-with-given-sum/)
- [📺 YouTube: Sock Merchant HackerRank Solution](https://www.youtube.com/results?search_query=sock+merchant+hackerrank+solution)

