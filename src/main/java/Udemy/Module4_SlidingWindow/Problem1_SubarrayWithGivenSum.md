# Subarrays with Given Sum

**Difficulty:** Medium

## Problem Statement

Given an array of positive integers `nums` and a target integer `target`, find all contiguous subarrays whose elements sum to `target`.

Return a list of pairs representing the **starting and ending indices (inclusive)** of each matching subarray. The indices must be zero-based.

Use the sliding window technique to find the matching subarrays efficiently.

## Expected Time Complexity

- **Time:** \(O(n + k)\), where \(n\) is the array length and \(k\) is the number of matching subarrays. Each array element is added to and removed from the sliding window at most once.
- **Space:** \(O(k)\) for storing the resulting index pairs, excluding the output and using \(O(1)\) auxiliary space for the sliding window itself.

## Function Signature

```java
public static List<List<Integer>> subarrayWithGivenSum(int[] nums, int target)
```

## Parameters

- `nums`: An array of positive integers.
- `target`: The sum that each matching subarray must equal.

## Return Value

A list of pairs, where each pair contains the starting and ending indices of a contiguous subarray whose sum equals `target`. Return an empty list if no matching subarray exists.

## Examples

### Example 1

**Input**
```text
nums = [1, 3, 2, 1, 4, 1, 3, 2, 1, 1, 2]
target = 8
```

**Output**
```text
[[2, 5], [4, 6], [5, 9]]
```

**Explanation:**

- Indices `[2, 5]`: Subarray `[2, 1, 4, 1]`, sum = `8`.
- Indices `[4, 6]`: Subarray `[4, 1, 3]`, sum = `8`.
- Indices `[5, 9]`: Subarray `[1, 3, 2, 1, 1]`, sum = `8`.

### Example 2

**Input**
```text
nums = [1, 2, 3, 4, 5]
target = 9
```

**Output**
```text
[[1, 3], [3, 4]]
```

**Explanation:** The subarray `[2, 3, 4]` and `[4, 5] have a sum of `9`.

### Example 3

**Input**
```text
nums = [1, 2, 3]
target = 10
```

**Output**
```text
[]
```

**Explanation:** No contiguous subarray sums to `10`.

### Example 4

**Input**
```text
nums = [5, 2, 3]
target = 5
```

**Output**
```text
[[0, 0]]
```

**Explanation:** The single-element subarray `[5]` has the required sum.

## Constraints

- \(1 \leq \text{nums.length} \leq 10^5\)
- \(1 \leq \text{nums}[i] \leq 10^9\)
- \(1 \leq \text{target} \leq 10^{14}\)
- Subarray indices are zero-based and inclusive.
- Only contiguous subarrays are considered.
- Every matching subarray must be included in the result.