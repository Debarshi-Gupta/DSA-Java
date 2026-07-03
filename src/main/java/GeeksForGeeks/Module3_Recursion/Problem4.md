# Maximum Rope Cuts

**Difficulty:** Medium

Given a rope of length `n` and three possible cut lengths `a`, `b`, and `c`, determine the maximum number of pieces the rope can be cut into such that every piece has length `a`, `b`, or `c`.

If it is not possible to cut the rope exactly, return `-1`.

Solve the problem using recursion.

**Expected Time Complexity:** `O(3ⁿ)`

## Function Signature

```java
int ropeCuttingProblem(int n, int a, int b, int c)
```

## Parameters

- `n` — the length of the rope.
- `a` — the length of the first allowed cut.
- `b` — the length of the second allowed cut.
- `c` — the length of the third allowed cut.

## Returns

- The maximum number of pieces that can be obtained.
- `-1` if it is impossible to cut the rope exactly.

## Constraints

```text
1 <= n <= 30
1 <= a, b, c <= n
```

## Examples

### Example 1

**Input**
```text
n = 23, a = 11, b = 9, c = 12
```

**Output**
```text
2
```

**Explanation**

The rope can be cut into lengths `11` and `12`, resulting in 2 pieces.

---

### Example 2

**Input**
```text
n = 5, a = 2, b = 5, c = 1
```

**Output**
```text
5
```

**Explanation**

The rope can be cut into five pieces of length `1`.

---

### Example 3

**Input**
```text
n = 7, a = 5, b = 2, c = 2
```

**Output**
```text
2
```

**Explanation**

The rope can be cut into lengths `5` and `2`.

---

### Example 4

**Input**
```text
n = 5, a = 4, b = 2, c = 6
```

**Output**
```text
-1
```

**Explanation**

It is impossible to cut the rope into pieces of lengths `4`, `2`, and `6` such that the entire rope is used.