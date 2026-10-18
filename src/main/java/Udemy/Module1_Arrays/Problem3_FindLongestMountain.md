# Longest Mountain in an Array

**Difficulty:** Medium

## Problem Statement

Given an integer array `nums`, find the length of the **longest mountain subarray**.

A mountain is a contiguous subarray that satisfies the following conditions:

1. It contains at least three elements.
2. The elements strictly increase until reaching a peak.
3. After the peak, the elements strictly decrease.
4. The peak cannot be the first or last element of the subarray.

Return the length of the longest mountain. If no valid mountain exists, return `0`.

## Expected Time Complexity

- **Time:** \(O(n)\), where \(n\) is the length of the array.
- **Space:** \(O(1)\) auxiliary space.

## Function Signature

```java
public static int findLongestMountain(int[] nums)
```

## Parameters

- `nums`: An integer array in which to find the longest mountain subarray.

## Return Value

An integer representing the length of the longest mountain subarray. Return `0` if the array contains no valid mountain.

## Examples

### Example 1

**Input**
```text
nums = [5, 6, 1, 2, 3, 4, 5, 4, 3, 2, 0, 1, 2, 3, -2, 4]
```

**Output**
```text
9
```

**Explanation:** The longest mountain is `[1, 2, 3, 4, 5, 4, 3, 2, 0]`, which contains 9 elements.

### Example 2

**Input**
```text
nums = [2, 1, 4, 7, 3, 2, 5]
```

**Output**
```text
5
```

**Explanation:** The longest mountain is `[1, 4, 7, 3, 2]`, with peak `7` and length `5`.

### Example 3

**Input**
```text
nums = [2, 2, 2]
```

**Output**
```text
0
```

**Explanation:** The array contains no strictly increasing and then strictly decreasing subarray.

### Example 4

**Input**
```text
nums = [1, 2, 3, 4, 5]
```

**Output**
```text
0
```

**Explanation:** The array is strictly increasing but never decreases after a peak, so no valid mountain exists.

## Constraints

- \(3 \leq \text{nums.length} \leq 10^4\)
- \(-10^9 \leq \text{nums}[i] \leq 10^9\)
- The mountain must be a contiguous subarray.
- Both the increasing and decreasing portions must contain at least one step.
- Adjacent elements in either portion must be strictly increasing or strictly decreasing, respectively.
- If no valid mountain exists, return `0`.