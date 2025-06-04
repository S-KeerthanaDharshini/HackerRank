# Between Two Sets
`Arrays` | `Math` | `Easy`

## 📝 Problem Statement
Find all integers `x` where:
1. All elements in array `a` are factors of `x` (x % a[i] == 0)
2. `x` is a factor of all elements in array `b` (b[j] % x == 0)

Return the count of such integers.

## 📊 Sample Input/Output

### Sample Input
```
2 3      # n=2, m=3
2 4      # array a
16 32 96 # array b
```

### Sample Output
```
3
```


## 🔗 Additional Resources
- [LCM and GCD](https://www.geeksforgeeks.org/lcm-and-gcd/)
- [Python reduce()](https://docs.python.org/3/library/functools.html#functools.reduce)

