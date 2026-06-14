# Count Trailing Zeros in Factorial

**Difficulty:** Easy

Given a non-negative integer `n`, return the number of trailing zeros in `n!`.

**Expected Time Complexity:** `O(log₅(n))`

## Function Signature

```java
int countTrailingZerosInFactorial(int n)
```

## Parameters

- `n` — a non-negative integer.

## Returns

- The number of trailing zeros in `n!`.

## Constraints

```text
0 <= n <= 10^9
```

## Examples

### Example 1

**Input**
```text
n = 10
```

**Output**
```text
2
```

**Explanation**

`10! = 3628800`, which ends with 2 zeros.

---

### Example 2

**Input**
```text
n = 5
```

**Output**
```text
1
```

**Explanation**

`5! = 120`, which ends with 1 zero.

---

### Example 3

**Input**
```text
n = 25
```

**Output**
```text
6
```

**Explanation**

`25!` contains 6 trailing zeros because it has six factors of 5.

---

### Example 4

**Input**
```text
n = 3
```

**Output**
```text
0
```

**Explanation**

`3! = 6`, which has no trailing zeros.