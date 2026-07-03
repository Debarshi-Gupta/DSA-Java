# Josephus Problem

**Difficulty:** Medium

There are `n` people standing in a circle, numbered from `0` to `n - 1`. Starting from person `0`, every `k`-th remaining person is eliminated until only one person remains.

Return the index of the last remaining person.

Solve the problem using recursion.

**Expected Time Complexity:** `O(n)`

## Function Signature

```java
int josephusProblem(int n, int k)
```

## Parameters

- `n` — the number of people in the circle.
- `k` — every `k`-th person is eliminated.

## Returns

- The index (0-based) of the last remaining person.

## Constraints

```text
1 <= n <= 10^5
1 <= k <= 10^9
```

## Examples

### Example 1

**Input**
```text
n = 7, k = 3
```

**Output**
```text
3
```

**Explanation**

The elimination order is `2, 5, 1, 6, 4, 0`, leaving person `3` as the survivor.

---

### Example 2

**Input**
```text
n = 5, k = 2
```

**Output**
```text
2
```

**Explanation**

The elimination order is `1, 3, 0, 4`, leaving person `2`.

---

### Example 3

**Input**
```text
n = 1, k = 5
```

**Output**
```text
0
```

**Explanation**

Only one person is present, so they survive.

---

### Example 4

**Input**
```text
n = 6, k = 1
```

**Output**
```text
5
```

**Explanation**

Each round eliminates the current person. The last remaining person is at index `5`.