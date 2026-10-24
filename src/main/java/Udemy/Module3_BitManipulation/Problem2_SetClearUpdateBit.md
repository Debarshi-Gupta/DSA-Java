# Set, Clear, and Update Bit

**Difficulty:** Easy

## Problem Statement

Given an integer `num` and a bit position `index`, perform bit manipulation operations using bitwise operators.

Implement the following functions:

1. **Set Bit:** Set the bit at position `index` to `1`, leaving all other bits unchanged.
2. **Clear Bit:** Set the bit at position `index` to `0`, leaving all other bits unchanged.
3. **Update Bit:** Set the bit at position `index` to the specified value `bit`, which must be either `0` or `1`, leaving all other bits unchanged.

Bit positions are zero-indexed, starting from the least significant bit (the rightmost bit).

## Expected Time Complexity

Each operation takes **\(O(1)\) time** and **\(O(1)\) auxiliary space**.

## Function Signatures

```java
public static int setBit(int num, int index)

public static int clearBit(int num, int index)

public static int updateBit(int num, int index, int bit)
```

## Parameters

- `num`: The integer whose bits will be modified.
- `index`: The zero-based position of the bit to modify.
- `bit`: The value (`0` or `1`) to assign to the specified bit; required only for `updateBit`.

## Return Value

Each function returns the resulting integer after performing the requested bit manipulation.

## Examples

### Example 1 — Set Bit

**Input**
```text
num = 5
index = 1
```

**Output**
```text
7
```

**Explanation:** The binary representation of `5` is `0101`. Setting bit `1` produces `0111`, which equals `7`.

### Example 2 — Clear Bit

**Input**
```text
num = 5
index = 2
```

**Output**
```text
1
```

**Explanation:** The binary representation of `5` is `0101`. Clearing bit `2` produces `0001`, which equals `1`.

### Example 3 — Update Bit

**Input**
```text
num = 5
index = 0
bit = 0
```

**Output**
```text
4
```

**Explanation:** The binary representation of `5` is `0101`. Updating bit `0` to `0` produces `0100`, which equals `4`.

### Example 4 — Update Bit to One

**Input**
```text
num = 5
index = 1
bit = 1
```

**Output**
```text
7
```

**Explanation:** Bit `1` is set to `1`, producing `0111`, which equals `7`.

## Constraints

- `num` is a valid Java `int`.
- \(0 \leq \text{index} < 32\).
- For `updateBit`, `bit` is either `0` or `1`.
- All bit positions are zero-indexed, with position `0` representing the least significant bit.