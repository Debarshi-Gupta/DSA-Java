# Check Odd or Even

**Difficulty:** Easy

## Problem Statement

Given an integer `num`, determine whether it is even or odd using bitwise operations.

Return `true` if the number is even and `false` if it is odd.

**Hint:** The least significant bit of an even integer is `0`, while that of an odd integer is `1`. Use the bitwise AND operator (`&`) with `1` to check this bit.

## Expected Time Complexity

- **Time:** \(O(1)\)
- **Space:** \(O(1)\)

## Function Signature

```java
public static boolean checkEven(int num)
```

## Parameters

- `num`: An integer to check.

## Return Value

- `true` if `num` is even.
- `false` if `num` is odd.

## Examples

### Example 1

**Input**
```text
num = 100
```

**Output**
```text
true
```

**Explanation:** The least significant bit of `100` is `0`, so the number is even.

### Example 2

**Input**
```text
num = 1001
```

**Output**
```text
false
```

**Explanation:** The least significant bit of `1001` is `1`, so the number is odd.

### Example 3

**Input**
```text
num = 0
```

**Output**
```text
true
```

**Explanation:** Zero is even, and its least significant bit is `0`.

### Example 4

**Input**
```text
num = -7
```

**Output**
```text
false
```

**Explanation:** Negative odd integers also have their least significant bit set to `1` in Java's integer representation.

## Constraints

- \(-2^{31} \leq \text{num} \leq 2^{31}-1\)
- `num` can be positive, negative, or zero.