# Power of a Number

**Difficulty:** Easy

Given two integers `x` and `n`, compute `xⁿ` and return the result.

Implement the solution using exponentiation by squaring.

**Expected Time Complexity:** `O(log n)`

## Function Signature

```java
int calculatePower(int x, int n)
```

## Parameters

- `x` — the base.
- `n` — the exponent.

## Returns

- The value of `xⁿ`.

## Constraints

```text
0 <= x <= 10^4
0 <= n <= 30
```

> Note: The constraints ensure that the result fits within a 32-bit signed integer.

## Examples

### Example 1

**Input**
```text
x = 5, n = 2
```

**Output**
```text
25
```

**Explanation**

`5² = 25`

---

### Example 2

**Input**
```text
x = 3, n = 4
```

**Output**
```text
81
```

**Explanation**

`3⁴ = 81`

---

### Example 3

**Input**
```text
x = 2, n = 10
```

**Output**
```text
1024
```

**Explanation**

`2¹⁰ = 1024`

---

### Example 4

**Input**
```text
x = 7, n = 0
```

**Output**
```text
1
```

**Explanation**

Any non-zero number raised to the power 0 equals 1.