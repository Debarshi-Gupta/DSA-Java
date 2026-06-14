# Greatest Common Divisor (GCD)

**Difficulty:** Easy

Given two positive integers `a` and `b`, return their Greatest Common Divisor (GCD). The GCD of two numbers is the largest positive integer that divides both numbers without leaving a remainder.

**Expected Time Complexity:** `O(log(min(a, b)))`

## Function Signature

```java
int findGCD(int a, int b)
```

## Parameters

- `a` — a positive integer.
- `b` — a positive integer.

## Returns

- The greatest common divisor of `a` and `b`.

## Constraints

```text
1 <= a, b <= 10^9
```

## Examples

### Example 1

**Input**
```text
a = 4, b = 6
```

**Output**
```text
2
```

**Explanation**

The largest number that divides both 4 and 6 is 2.

---

### Example 2

**Input**
```text
a = 100, b = 200
```

**Output**
```text
100
```

**Explanation**

100 divides both numbers and no larger common divisor exists.

---

### Example 3

**Input**
```text
a = 7, b = 13
```

**Output**
```text
1
```

**Explanation**

7 and 13 are co-prime, so their GCD is 1.

---

### Example 4

**Input**
```text
a = 24, b = 36
```

**Output**
```text
12
```

**Explanation**

12 is the largest positive integer that divides both 24 and 36.