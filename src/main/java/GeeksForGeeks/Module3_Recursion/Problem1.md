# Sum of First N Natural Numbers

**Difficulty:** Easy

Given a non-negative integer `n`, return the sum of the first `n` natural numbers. Solve the problem using recursion without using the arithmetic progression formula.

**Expected Time Complexity:** `O(n)`

## Function Signature

```java
int sumOfNaturalNumbers(int n)
```

## Parameters

- `n` — a non-negative integer.

## Returns

- The sum of the first `n` natural numbers.

## Constraints

```text
0 <= n <= 10^5
```

> **Note:** The solution is expected to use recursion and should not use the formula `n × (n + 1) / 2`.

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

`1 + 2 + 3 = 6`

---

### Example 2

**Input**
```text
n = 0
```

**Output**
```text
0
```

**Explanation**

There are no natural numbers to sum.

---

### Example 3

**Input**
```text
n = 10
```

**Output**
```text
55
```

**Explanation**

`1 + 2 + 3 + ... + 10 = 55`

---

### Example 4

**Input**
```text
n = 1
```

**Output**
```text
1
```

**Explanation**

The sum of the first natural number is 1.