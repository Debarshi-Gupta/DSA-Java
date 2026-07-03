# Count Subsets with Given Sum

**Difficulty:** Medium

Given an integer array `nums` and an integer `target`, return the number of subsets whose elements sum to `target`.

Solve the problem using recursion.

**Expected Time Complexity:** `O(2ⁿ)`

## Function Signature

```java
int subsetSum(int[] nums, int target)
```

## Parameters

- `nums` — an integer array.
- `target` — the desired subset sum.

## Returns

- The number of subsets whose sum equals `target`.

## Constraints

```text
0 <= nums.length <= 30
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
```

## Examples

### Example 1

**Input**
```text
nums = [10, 5, 2, 3, 6]
target = 8
```

**Output**
```text
2
```

**Explanation**

The subsets with sum `8` are:

- `[5, 3]`
- `[2, 6]`

Hence, the answer is `2`.

---

### Example 2

**Input**
```text
nums = [10, 20, 15]
target = 0
```

**Output**
```text
1
```

**Explanation**

Only the empty subset has a sum of `0`.

---

### Example 3

**Input**
```text
nums = [1, 2, 3]
target = 3
```

**Output**
```text
2
```

**Explanation**

The subsets are:

- `[3]`
- `[1, 2]`

---

### Example 4

**Input**
```text
nums = [5, 5, 5]
target = 10
```

**Output**
```text
3
```

**Explanation**

There are three distinct subsets (based on element indices) that sum to `10`.