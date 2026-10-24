# Decimal to Binary

**Difficulty:** Easy

## Problem Statement

Given a non-negative decimal integer `num`, convert it into its binary representation.

Return the binary representation as an integer whose decimal digits correspond to the binary digits of `num`.

For example, the decimal number `15` has the binary representation `1111`, so the function returns the integer `1111`.

## Expected Time Complexity

- **Time:** \(O(\log n)\), where \(n\) is the input number, because the number is repeatedly divided by `2`.
- **Space:** \(O(1)\), since only a constant number of variables are used.

## Function Signature

```java
public static int decimalToBinary(int num)
```

## Parameters

- `num`: A non-negative decimal integer to convert to binary.

## Return Value

An integer containing the binary digits of `num` in their original order.

## Examples

### Example 1

**Input**
```text
num = 15
```

**Output**
```text
1111
```

**Explanation:** Repeatedly dividing `15` by `2` produces binary digits `1111`.

### Example 2

**Input**
```text
num = 16
```

**Output**
```text
10000
```

**Explanation:** The binary representation of decimal `16` is `10000`.

### Example 3

**Input**
```text
num = 5
```

**Output**
```text
101
```

**Explanation:** The binary representation of decimal `5` is `101`.

### Example 4

**Input**
```text
num = 0
```

**Output**
```text
0
```

**Explanation:** Zero is represented as `0` in binary.

## Constraints

- \(0 \leq \text{num} \leq 1023\).
- The result must fit within a Java `int` when the binary digits are interpreted as a decimal integer.

**Implementation note:** This implementation stores binary digits in an `int`, so larger inputs can cause integer overflow. For unrestricted non-negative integers, returning a `String` is a safer approach.