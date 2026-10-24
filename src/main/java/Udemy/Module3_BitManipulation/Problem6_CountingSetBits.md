# Counting Set Bits

**Difficulty:** Easy

## Problem Statement

Given a non-negative integer `num`, count the number of set bits (`1`s) in its binary representation.

Use bitwise operations to count the set bits efficiently. Return the total count.

**Hint:** The expression `num & (num - 1)` clears the rightmost set bit of `num`. Repeatedly applying this operation until `num` becomes `0` allows you to count the set bits.

## Expected Time Complexity

- **Time:** \(O(k)\), where \(k\) is the number of set bits. In the worst case, this is \(O(\log n)\) for a positive integer \(n\).
- **Space:** \(O(1)\)

## Function Signature

```java
public static int countSetBits(int num)
```

## Parameters

- `num`: The non-negative integer whose set bits must be counted.

## Return Value

An integer representing the number of set bits in `num`.

## Examples

### Example 1

**Input**
```text
num = 16
```

**Output**
```text
1
```

**Explanation:** The binary representation of `16` is `10000`, which contains one set bit.

### Example 2

**Input**
```text
num = 15
```

**Output**
```text
4
```

**Explanation:** The binary representation of `15` is `1111`, which contains four set bits.

### Example 3

**Input**
```text
num = 6
```

**Output**
```text
2
```

**Explanation:** The binary representation of `6` is `110`, which contains two set bits.

### Example 4

**Input**
```text
num = 0
```

**Output**
```text
0
```

**Explanation:** The binary representation of `0` contains no set bits.

## Constraints

- \(0 \leq \text{num} \leq 2^{31}-1\)
- `num` is a non-negative Java integer.