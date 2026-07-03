# Generate All Permutations

**Difficulty:** Medium

Given a string `s` consisting of distinct characters, return all possible permutations of its characters.

The permutations may be returned in any order.

Solve the problem using recursion.

**Expected Time Complexity:** `O(n × n!)`

## Function Signature

```java
List<String> generatePermutations(String s)
```

## Parameters

- `s` — a string consisting of distinct characters.

## Returns

- A list containing all permutations of `s`.

## Constraints

```text
1 <= s.length() <= 10
s consists of distinct English letters.
```

## Examples

### Example 1

**Input**
```text
s = "ABC"
```

**Output**
```text
["ABC", "ACB", "BAC", "BCA", "CBA", "CAB"]
```

**Explanation**

All `3! = 6` possible arrangements of the characters are generated.

---

### Example 2

**Input**
```text
s = "AB"
```

**Output**
```text
["AB", "BA"]
```

**Explanation**

There are `2! = 2` permutations.

---

### Example 3

**Input**
```text
s = "A"
```

**Output**
```text
["A"]
```

**Explanation**

A single-character string has only one permutation.

---

### Example 4

**Input**
```text
s = "XYZ"
```

**Output**
```text
["XYZ", "XZY", "YXZ", "YZX", "ZYX", "ZXY"]
```

**Explanation**

All `3! = 6` permutations of the string are returned.