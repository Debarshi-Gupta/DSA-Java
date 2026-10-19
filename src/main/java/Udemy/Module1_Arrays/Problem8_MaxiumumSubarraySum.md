# Maximum Subarray Sum

**Difficulty:** Medium

## Problem Statement

Given an integer array `nums`, find the maximum possible sum of any **non-empty contiguous subarray**.

A subarray consists of consecutive elements from the original array. The subarray may contain positive integers, negative integers, or zero.

Return the maximum subarray sum. If the input array is empty, return `0`.

## Expected Time Complexity

- **Time:** \(O(n)\), where \(n\) is the length of the array.
- **Space:** \(O(1)\) auxiliary space.

## Function Signature

```java
public static int maximumSubarraySum(int[] nums)
```

## Parameters

- `nums`: An integer array that may contain positive integers, negative integers, and zero.

## Return Value

An integer representing the maximum sum of any non-empty contiguous subarray. Return `0` if the array is empty.

## Examples

### Example 1

**Input**
```text
nums = [-1, 2, 3, 4, -2, 6, -8, 3]
```

**Output**
```text
13
```

**Explanation:** The subarray `[2, 3, 4, -2, 6]` has the maximum sum:

`2 + 3 + 4 + (-2) + 6 = 13`

### Example 2

**Input**
```text
nums = [-2, -3, -1, -5]
```

**Output**
```text
-1
```

**Explanation:** All elements are negative, so the maximum subarray consists of the single element `-1`.

### Example 3

**Input**
```text
nums = [5, 4, -1, 7, 8]
```

**Output**
```text
23
```

**Explanation:** The entire array forms the maximum-sum subarray:

`5 + 4 + (-1) + 7 + 8 = 23`

### Example 4

**Input**
```text
nums = [1, 2, 3, 4]
```

**Output**
```text
10
```

**Explanation:** The entire array has the maximum sum of `10`.

### Example 5

**Input**
```text
nums = []
```

**Output**
```text
0
```

**Explanation:** The input array is empty, so the function returns `0`.

## Constraints

- \(0 \leq \text{nums.length} \leq 10^5\)
- `nums` may contain positive integers, negative integers, and zero.
- A subarray must consist of contiguous elements.
- For a non-empty array, the selected subarray must contain at least one element.
- The maximum subarray sum must fit within the 32-bit signed integer range.

## Approach

Use **Kadane's Algorithm** to find the maximum subarray sum in linear time.

At each index, decide whether to start a new subarray at the current element or extend the existing subarray. Track the maximum sum encountered throughout the traversal.