# Count Digits

**Difficulty:** Easy

Given a positive integer `n`, return the number of digits present in it.

**Expected Time Complexity:** `O(log₁₀(n))`

## Function Signature

```java
int countDigits(int n)
```

## Parameters

- `n` — a positive integer.

## Returns

- The number of digits in `n`.

## Constraints

```text
1 <= n <= 10^18
```

## Examples

### Example 1

**Input**
```text
n = 9235
```

**Output**
```text
4
```

**Explanation**

The number `9235` contains 4 digits.

---

### Example 2

**Input**
```text
n = 7
```

**Output**
```text
1
```

**Explanation**

The number `7` contains 1 digit.

---

### Example 3

**Input**
```text
n = 100000
```

**Output**
```text
6
```

**Explanation**

The number `100000` contains 6 digits.