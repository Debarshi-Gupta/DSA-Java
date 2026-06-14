# Prime Factorization

**Difficulty:** Easy

Given a positive integer `n`, return all of its prime factors in non-decreasing order. If a prime factor occurs multiple times, include it multiple times in the result.

**Expected Time Complexity:** `O(√n)`

## Function Signature

```java
List<Integer> primeFactors(int n)
```

## Parameters

- `n` — a positive integer.

## Returns

- A list containing the prime factors of `n` in non-decreasing order.

## Constraints

```text
1 <= n <= 10^9
```

## Examples

### Example 1

**Input**
```text
n = 450
```

**Output**
```text
[2, 3, 3, 5, 5]
```

**Explanation**

`450 = 2 × 3 × 3 × 5 × 5`

---

### Example 2

**Input**
```text
n = 84
```

**Output**
```text
[2, 2, 3, 7]
```

**Explanation**

`84 = 2 × 2 × 3 × 7`

---

### Example 3

**Input**
```text
n = 13
```

**Output**
```text
[13]
```

**Explanation**

13 is a prime number, so its only prime factor is itself.

---

### Example 4

**Input**
```text
n = 1
```

**Output**
```text
[]
```

**Explanation**

1 has no prime factors.