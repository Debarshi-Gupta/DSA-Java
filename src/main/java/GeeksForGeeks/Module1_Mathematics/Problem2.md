# Palindrome Number

**Difficulty:** Easy

Given a non-negative integer `n`, determine whether it reads the same forward and backward. Return `true` if it is a palindrome, otherwise return `false`.

**Expected Time Complexity:** `O(log₁₀(n))`

## Function Signature

```java
boolean checkPalindrome(int n)
```

## Parameters

- `n` — a non-negative integer.

## Returns

- `true` if `n` is a palindrome.
- `false` otherwise.

## Constraints

```text
0 <= n <= 10^18
```

## Examples

### Example 1

**Input**
```text
n = 78987
```

**Output**
```text
true
```

**Explanation**

Reading `78987` from left to right or right to left gives the same number.

---

### Example 2

**Input**
```text
n = 5665
```

**Output**
```text
true
```

**Explanation**

`5665` is the same when reversed.

---

### Example 3

**Input**
```text
n = 123
```

**Output**
```text
false
```

**Explanation**

The reverse of `123` is `321`, which is different from the original number.

---

### Example 4

**Input**
```text
n = 0
```

**Output**
```text
true
```

**Explanation**

A single-digit number is always a palindrome.