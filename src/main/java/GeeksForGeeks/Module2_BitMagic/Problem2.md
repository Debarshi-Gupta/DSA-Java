# Count Set Bits

**Difficulty:** Easy

Given a non-negative integer `n`, return the number of set bits (bits with value `1`) in its binary representation.

**Expected Time Complexity:** `O(number of set bits)`

## Function Signature

```java
int countSetBits(int n)
```

## Parameters

- `n` — a non-negative integer.

## Returns

- The number of set bits in the binary representation of `n`.

## Constraints

```text
0 <= n <= 10^9
```

## Examples

### Example 1

**Input**
```text
n = 5
```

**Output**
```text
2
```

**Explanation**

`5` in binary is `101`, which contains 2 set bits.

---

### Example 2

**Input**
```text
n = 15
```

**Output**
```text
4
```

**Explanation**

`15` in binary is `1111`, which contains 4 set bits.

---

### Example 3

**Input**
```text
n = 100
```

**Output**
```text
3
```

**Explanation**

`100` in binary is `1100100`, which contains 3 set bits.

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

The binary representation of `0` contains no set bits.