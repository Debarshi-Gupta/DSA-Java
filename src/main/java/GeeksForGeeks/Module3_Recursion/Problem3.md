# Sum of Digits

**Difficulty:** Easy

Given a non-negative integer `n`, return the sum of its digits.

Solve the problem using recursion.

**Expected Time Complexity:** `O(log₁₀(n))`

## Function Signature

```java
int sumOfDigits(int n)
```

## Parameters

- `n` — a non-negative integer.

## Returns

- The sum of the digits of `n`.

## Constraints

```text
0 <= n <= 10^18
```

## Examples

### Example 1

**Input**
```text
n = 313
```

**Output**
```text
7
```

**Explanation**

The sum of the digits is `3 + 1 + 3 = 7`.

---

### Example 2

**Input**
```text
n = 5
```

**Output**
```text
5
```

**Explanation**

The number contains a single digit.

---

### Example 3

**Input**
```text
n = 100
```

**Output**
```text
1
```

**Explanation**

The sum of the digits is `1 + 0 + 0 = 1`.

---

### Example 4

**Input**
```text
n = 0
```

**Output**
```text
0
```

**Explanation**

The sum of the digits of `0` is `0`.