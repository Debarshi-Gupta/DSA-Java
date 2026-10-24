# Fast Exponentiation

**Difficulty:** Medium

## Problem Statement

Given an integer `num` and a non-negative integer `pow`, calculate \(num^{pow}\) efficiently using **binary exponentiation**, also known as fast exponentiation.

Instead of multiplying `num` by itself `pow` times, use the binary representation of the exponent to reduce the number of multiplications.

Return the calculated power as an integer.

## Expected Time Complexity

- **Time:** \(O(\log pow)\), because the exponent is halved during each iteration.
- **Space:** \(O(1)\), since only a constant number of variables are used.

## Function Signature

```java
public static int fastExponentiation(int num, int pow)
```

## Parameters

- `num`: The integer base.
- `pow`: The non-negative integer exponent.

## Return Value

The integer result of raising `num` to the power `pow`.

## Examples

### Example 1

**Input**
```text
num = 5
pow = 3
```

**Output**
```text
125
```

**Explanation:** \(5^3 = 5 \times 5 \times 5 = 125\).

### Example 2

**Input**
```text
num = 10
pow = 3
```

**Output**
```text
1000
```

**Explanation:** \(10^3 = 10 \times 10 \times 10 = 1000\).

### Example 3

**Input**
```text
num = 0
pow = 100
```

**Output**
```text
0
```

**Explanation:** Zero raised to any positive integer power is zero.

### Example 4

**Input**
```text
num = 7
pow = 0
```

**Output**
```text
1
```

**Explanation:** Any non-zero number raised to the power zero equals one. The implementation also returns `1` for `0^0` by convention.

## Constraints

- `num` is a valid Java `int`.
- \(0 \leq pow \leq 31\).
- The exact mathematical result must fit within the Java `int` range to avoid integer overflow.
- Negative exponents are not supported.