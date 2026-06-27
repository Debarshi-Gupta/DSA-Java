# Check K-th Bit

**Difficulty:** Easy

Given a non-negative integer `n` and a positive integer `k`, determine whether the k-th bit (counting from the right, starting at 1) is set. Return `1` if the k-th bit is set, otherwise return `0`.

**Expected Time Complexity:** `O(1)`

## Function Signature

```java
int checkKthBit(int n, int k)
```

## Parameters

- `n` — a non-negative integer.
- `k` — the 1-based position of the bit from the right.

## Returns

- `1` if the k-th bit is set.
- `0` otherwise.

## Constraints

```text
0 <= n <= 10^9
1 <= k <= 31
```

## Examples

### Example 1

**Input**
```text
n = 5, k = 3
```

**Output**
```text
1
```

**Explanation**

`5` in binary is `101`. The 3rd bit from the right is set.

---

### Example 2

**Input**
```text
n = 13, k = 2
```

**Output**
```text
0
```

**Explanation**

`13` in binary is `1101`. The 2nd bit from the right is not set.

---

### Example 3

**Input**
```text
n = 3, k = 2
```

**Output**
```text
1
```

**Explanation**

`3` in binary is `11`. The 2nd bit from the right is set.

---

### Example 4

**Input**
```text
n = 8, k = 1
```

**Output**
```text
0
```

**Explanation**

`8` in binary is `1000`. The least significant bit is not set.