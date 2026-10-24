# Replace Bits in a Range

**Difficulty:** Medium

## Problem Statement

Given two non-negative integers `num1` and `num2`, and two bit positions `i` and `j`, replace the bits of `num1` in the inclusive range `[i, j]` with the bits of `num2`, starting from bit position `i`.

Bit positions are zero-indexed, starting from the least significant bit (the rightmost bit).

All bits of `num1` outside the specified range must remain unchanged.

## Expected Time Complexity

- **Time:** \(O(1)\)
- **Space:** \(O(1)\)

## Function Signatures

```java
public static int replaceBitsInRage(int num1, int num2, int i, int j)

public static int clearBitsInRange(int num, int i, int j)
```

## Parameters

- `num1`: The integer whose specified bits will be replaced.
- `num2`: The integer whose bits will be inserted into `num1`.
- `i`: The starting bit position of the range, inclusive.
- `j`: The ending bit position of the range, inclusive.
- `num`: The integer whose bits in the specified range must be cleared; used by `clearBitsInRange`.

## Return Value

- `replaceBitsInRage` returns `num1` with bits in the range `[i, j]` replaced by the corresponding bits of `num2`.
- `clearBitsInRange` returns the integer obtained by clearing all bits in the range `[i, j]`.

## Examples

### Example 1 — Replace Bits

**Input**
```text
num1 = 15
num2 = 2
i = 1
j = 3
```

**Output**
```text
5
```

**Explanation:** The binary representation of `num1` is `1111`. Clearing bits `1` through `3` produces `0001`. Shifting `num2` (`0010`) left by `1` position produces `0100`. Combining them using bitwise OR gives `0101`, which equals `5`.

### Example 2 — Replace Bits

**Input**
```text
num1 = 31
num2 = 1
i = 1
j = 3
```

**Output**
```text
19
```

**Explanation:** Clearing bits `1` through `3` of `11111` leaves `10001`. Inserting `1` at bit position `1` produces `10011`, which equals `19`.

### Example 3 — Clear Bits in a Range

**Input**
```text
num = 15
i = 1
j = 3
```

**Output**
```text
1
```

**Explanation:** The binary representation of `15` is `1111`. Clearing bits `1`, `2`, and `3` leaves `0001`, which equals `1`.

### Example 4 — Clear Bits in a Range

**Input**
```text
num = 31
i = 2
j = 3
```

**Output**
```text
19
```

**Explanation:** The binary representation of `31` is `11111`. Clearing bits `2` and `3` produces `10011`, which equals `19`.

## Constraints

- `num1`, `num2`, and `num` are non-negative Java integers.
- \(0 \leq i \leq j \leq 30\).
- `num2` must fit within the specified range of \(j-i+1\) bits.
- Bit positions are zero-indexed, starting from the least significant bit.
- Bits of `num1` outside the range `[i, j]` must remain unchanged.