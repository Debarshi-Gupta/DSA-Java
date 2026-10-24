# Clear Last K Bits

**Difficulty:** Easy

## Problem Statement

Given an integer `num` and a non-negative integer `k`, clear the last `k` bits of `num` using bitwise operations.

Clearing a bit means setting it to `0`. All bits at positions `k` and above must remain unchanged.

Bit positions are zero-indexed, starting from the least significant bit (the rightmost bit).

## Expected Time Complexity

- **Time:** \(O(1)\)
- **Space:** \(O(1)\)

## Function Signature

```java
public static int clearLastKBits(int num, int k)
```

## Parameters

- `num`: The integer whose last bits will be cleared.
- `k`: The number of least significant bits to clear.

## Return Value

The integer obtained after setting the last `k` bits of `num` to `0`.

## Examples

### Example 1

**Input**
```text
num = 15
k = 3
```

**Output**
```text
8
```

**Explanation:** The binary representation of `15` is `1111`. Clearing the last three bits produces `1000`, which equals `8`.

### Example 2

**Input**
```text
num = 7
k = 2
```

**Output**
```text
4
```

**Explanation:** The binary representation of `7` is `0111`. Clearing the last two bits produces `0100`, which equals `4`.

### Example 3

**Input**
```text
num = 10
k = 1
```

**Output**
```text
10
```

**Explanation:** The binary representation of `10` is `1010`. Its last bit is already `0`, so the number remains unchanged.

### Example 4

**Input**
```text
num = 15
k = 0
```

**Output**
```text
15
```

**Explanation:** Clearing zero bits leaves the number unchanged.

## Constraints

- `num` is a valid Java `int`.
- \(0 \leq k < 32\).
- Bit positions are zero-indexed, starting from the least significant bit.