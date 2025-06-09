# [Designer PDF Viewer](https://www.hackerrank.com/challenges/designer-pdf-viewer/problem)
`Arrays` | `Strings` | `Easy`

## 📝 Problem Statement
Given:
1. An array of 26 integers representing heights of lowercase letters (a-z)
2. A word consisting of lowercase letters

Calculate the highlighted rectangle area when the word is selected in a PDF viewer, where:
- Each character's width is 1mm
- The rectangle height equals the tallest character in the word
- Area = height × length (number of characters)

## 📊 Sample Input/Output

### Sample Input
```
1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5  // heights
abc                                                   // word
```

### Sample Output
```
9  // area (3 tallest letters × 3 characters)
```

## 🔗 Additional Resources (Java-specific)
- [Java List Interface](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)
- [Java String.toCharArray()](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#toCharArray--)
- [Java Math.max()](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#max-int-int-)
