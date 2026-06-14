# Find All Divisors

**Difficulty:** Easy

Given a positive integer `n`, return all of its divisors in increasing order.

A divisor of `n` is a positive integer that divides `n` without leaving a remainder.

**Expected Time Complexity:** `O(√n)`

## Function Signature

```java
List<Integer> findDivisors(int n)
```

## Parameters

- `n` — a positive integer.

## Returns

- A list containing all divisors of `n` in increasing order.

## Constraints

```text
1 <= n <= 10^9
```

## Examples

### Example 1

**Input**
```text
n = 25
```

**Output**
```text
[1, 5, 25]
```

**Explanation**

The divisors of 25 are 1, 5, and 25.

---

### Example 2

**Input**
```text
n = 100
```

**Output**
```text
[1, 2, 4, 5, 10, 20, 25, 50, 100]
```

**Explanation**

These are all positive integers that divide 100 exactly.

---

### Example 3

**Input**
```text
n = 12
```

**Output**
```text
[1, 2, 3, 4, 6, 12]
```

**Explanation**

All divisors of 12 are returned in increasing order.

---

### Example 4

**Input**
```text
n = 1
```

**Output**
```text
[1]
```

**Explanation**

1 has exactly one divisor: itself.