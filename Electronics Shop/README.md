# [Electronic Shop](https://www.hackerrank.com/challenges/electronics-shop/problem)

## 📌 Problem Description

A person wants to determine the **most expensive** combination of a computer keyboard and USB drive that can be purchased with a given **budget**.

You are given:
- A list of prices for keyboards
- A list of prices for USB drives
- A total budget `b`

Your task is to find the **maximum amount of money** that can be spent on **one keyboard and one USB drive** without exceeding the budget.  
If it is **not possible** to buy both items, return `-1`.

---

## Example

b = 60
keyboards = [40, 50, 60]
drives = [5, 8, 12]


Valid combinations:
- 40 (keyboard) + 12 (drive) = 52
- 50 (keyboard) + 8 (drive) = 58 

###  Output:
58

---

## 🔧 Function Description

### `getMoneySpent(keyboards, drives, b)`

#### Parameters:
- `int keyboards[n]`: prices of keyboard models
- `int drives[m]`: prices of USB drives
- `int b`: total budget

#### Returns:
- `int`: maximum money spent on both items, or `-1` if not possible

---

## 📝 Input Format

- First line: Three space-separated integers `b`, `n`, and `m`  
  (Budget, number of keyboard models, number of USB models)
- Second line: `n` space-separated integers (keyboard prices)
- Third line: `m` space-separated integers (USB drive prices)




## Sample Input 0
10 2 3
3 1
5 2 8

## Sample Output 0
9

####  Explanation:
- Best option: 1 (keyboard) + 8 (drive) = 9



## Sample Input 1

5 1 1
4
5

## Sample Output 1
-1

#### 🔍 Explanation:
- Cannot buy both items under the budget of 5


## 📚 Additional Resources

- [📺 YouTube: Electronics Shop HackerRank Explanation](https://www.youtube.com/results?search_query=electronics+shop+hackerrank+solution)
- [📘 GeeksforGeeks: Buy Maximum Items with Given Budget](https://www.geeksforgeeks.org/maximum-number-of-items-that-can-be-bought-with-a-given-budget/)
- [📊 Brute-force vs Greedy: Codeforces Discussion](https://codeforces.com/blog/entry/18169)
