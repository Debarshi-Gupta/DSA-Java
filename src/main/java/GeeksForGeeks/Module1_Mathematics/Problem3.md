# Factorial of a Number

**Difficulty:** Easy

Given a non-negative integer `n`, return its factorial. The factorial of `n` is the product of all positive integers less than or equal to `n`.

**Expected Time Complexity:** `O(n)`

## Function Signature

```java
int factorial(int n)
```

## Parameters

- `n` — a non-negative integer.

## Returns

- The factorial of `n`.

## Constraints

```text
0 <= n <= 12
```

> Note: The constraint ensures the result fits within a 32-bit signed integer.

## Examples

### Example 1

**Input**
```text
n = 3
```

**Output**
```text
6
```

**Explanation**

`3! = 3 × 2 × 1 = 6`

---

### Example 2

**Input**
```text
n = 6
```

**Output**
```text
720
```

**Explanation**

`6! = 6 × 5 × 4 × 3 × 2 × 1 = 720`

---

### Example 3

**Input**
```text
n = 10
```

**Output**
```text
3628800
```

**Explanation**

`10! = 10 × 9 × 8 × 7 × 6 × 5 × 4 × 3 × 2 × 1 = 3628800`

---

### Example 4

**Input**
```text
n = 0
```

**Output**
```text
1
```

**Explanation**

By definition, `0! = 1`.