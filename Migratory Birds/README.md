# [Migratory Birds](https://www.hackerrank.com/challenges/migratory-birds/problem)

## 📌 Problem Description

You are given an array of bird sightings where each element represents a bird **type ID**.  
Your task is to determine the **most frequently sighted** bird type ID.  

If there is a **tie** in frequency, return the **smallest ID** among those.



##  Example

### Sample Input
6
1 4 4 4 5 3

###  Sample Output
4
---
###  Explanation

- Frequency of bird types:
  - Type 1: 1 time
  - Type 3: 1 time
  - Type 4: 3 times ✅
  - Type 5: 1 time

→ Bird type `4` has the **highest count**, so return `4`.


## 📝 Input Format

- First line: an integer `n` — the number of sightings
- Second line: `n` space-separated integers — bird type IDs



## 🔧 Function Description

### `migratoryBirds(arr)`

#### Parameters:
- `int arr[n]`: an array of integers representing bird sightings

#### Returns:
- `int`: the lowest type ID of the most frequently sighted birds

---

## 📚 Additional Resources

- [📺 YouTube: Migratory Birds HackerRank Solution](https://www.youtube.com/results?search_query=migratory+birds+hackerrank+solution)
- [📘 GeeksforGeeks: Count Frequencies of Elements](https://www.geeksforgeeks.org/counting-frequencies-of-array-elements/)




