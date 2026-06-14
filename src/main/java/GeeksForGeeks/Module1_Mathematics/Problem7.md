# Check Prime Number

**Difficulty:** Easy

Given a positive integer `n`, determine whether it is a prime number. Return `true` if `n` is prime, otherwise return `false`.

A prime number is a natural number greater than 1 that has exactly two positive divisors: 1 and itself.

**Expected Time Complexity:** `O(√n)`

## Function Signature

```java
boolean checkPrime(int n)
```

## Parameters

- `n` — a positive integer.

## Returns

- `true` if `n` is prime.
- `false` otherwise.

## Constraints

```text
1 <= n <= 10^9
```

## Examples

### Example 1

**Input**
```text
n = 2
```

**Output**
```text
true
```

**Explanation**

2 has exactly two divisors: 1 and 2.

---

### Example 2

**Input**
```text
n = 17
```

**Output**
```text
true
```

**Explanation**

17 is divisible only by 1 and 17.

---

### Example 3

**Input**
```text
n = 25
```

**Output**
```text
false
```

**Explanation**

25 is divisible by 5, so it is not prime.

---

### Example 4

**Input**
```text
n = 1
```

**Output**
```text
false
```

**Explanation**

1 is not considered a prime number.