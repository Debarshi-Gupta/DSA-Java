# Power of Two

**Difficulty:** Easy

Given a positive integer `n`, determine whether it is a power of 2. Return `true` if there exists an integer `x` such that `n = 2ˣ`, otherwise return `false`.

**Expected Time Complexity:** `O(1)`

## Function Signature

```java
boolean checkIfPowerOf2(int n)
```

## Parameters

- `n` — a non-negative integer.

## Returns

- `true` if `n` is a power of 2.
- `false` otherwise.

## Constraints

```text
0 <= n <= 10^9
```

## Examples

### Example 1

**Input**
```text
n = 4
```

**Output**
```text
true
```

**Explanation**

`4 = 2²`, so it is a power of 2.

---

### Example 2

**Input**
```text
n = 64
```

**Output**
```text
true
```

**Explanation**

`64 = 2⁶`, so it is a power of 2.

---

### Example 3

**Input**
```text
n = 77
```

**Output**
```text
false
```

**Explanation**

77 cannot be expressed as `2ˣ` for any integer `x`.

---

### Example 4

**Input**
```text
n = 0
```

**Output**
```text
false
```

**Explanation**

0 is not a power of 2.