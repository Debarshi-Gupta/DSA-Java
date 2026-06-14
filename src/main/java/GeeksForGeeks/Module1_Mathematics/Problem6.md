# Least Common Multiple (LCM)

**Difficulty:** Easy

Given two positive integers `a` and `b`, return their Least Common Multiple (LCM). The LCM of two numbers is the smallest positive integer that is divisible by both numbers.

**Expected Time Complexity:** `O(log(min(a, b)))`

## Function Signature

```java
int findLCM(int a, int b)
```

## Parameters

- `a` — a positive integer.
- `b` — a positive integer.

## Returns

- The least common multiple of `a` and `b`.

## Constraints

```text
1 <= a, b <= 10^4
```

> Note: The constraints ensure that the resulting LCM fits within a 32-bit signed integer.

## Examples

### Example 1

**Input**
```text
a = 4, b = 6
```

**Output**
```text
12
```

**Explanation**

12 is the smallest positive integer divisible by both 4 and 6.

---

### Example 2

**Input**
```text
a = 5, b = 7
```

**Output**
```text
35
```

**Explanation**

Since 5 and 7 are co-prime, their LCM is `5 × 7 = 35`.

---

### Example 3

**Input**
```text
a = 10, b = 15
```

**Output**
```text
30
```

**Explanation**

30 is the smallest positive integer divisible by both 10 and 15.

---

### Example 4

**Input**
```text
a = 100, b = 200
```

**Output**
```text
200
```

**Explanation**

200 is divisible by both 100 and 200, and no smaller positive multiple satisfies the condition.