# Check Power of 2

**Difficulty:** Easy

## Problem Statement

Given an integer `num`, determine whether it is a power of two using bitwise operations.

A positive integer is a power of two if it can be expressed as \(2^k\), where \(k\) is a non-negative integer.

Return `true` if `num` is a power of two; otherwise, return `false`.

**Hint:** A positive power of two has exactly one set bit in its binary representation. The expression `num & (num - 1)` clears the rightmost set bit.

## Expected Time Complexity

- **Time:** \(O(1)\)
- **Space:** \(O(1)\)

## Function Signature

```java
public static boolean checkPowerOf2(int num)
```

## Parameters

- `num`: The integer to check.

## Return Value

- `true` if `num` is a positive power of two.
- `false` otherwise.

## Examples

### Example 1

**Input**
```text
num = 128
```

**Output**
```text
true
```

**Explanation:** The binary representation of `128` is `10000000`, which contains exactly one set bit. Therefore, it is a power of two.

### Example 2

**Input**
```text
num = 144
```

**Output**
```text
false
```

**Explanation:** The binary representation of `144` is `10010000`, which contains more than one set bit. Therefore, it is not a power of two.

### Example 3

**Input**
```text
num = 1
```

**Output**
```text
true
```

**Explanation:** Since \(1 = 2^0\), the number `1` is a power of two.

### Example 4

**Input**
```text
num = 0
```

**Output**
```text
false
```

**Explanation:** Zero is not a power of two.

## Constraints

- `num` is a valid Java `int`.
- \(1 \leq \text{num} \leq 2^{31}-1\).

**Implementation note:** To correctly handle zero and negative integers as well, the method should check `num > 0` in addition to `(num & (num - 1)) == 0`.