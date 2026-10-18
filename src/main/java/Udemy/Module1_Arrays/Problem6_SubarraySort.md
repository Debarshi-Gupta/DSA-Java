# Subarray Sort

**Difficulty:** Medium

## Problem Statement

Given an integer array `nums`, find the smallest contiguous subarray that needs to be sorted in ascending order so that the entire array becomes sorted in ascending order.

Return an integer array containing the starting and ending indices of this subarray, using **0-based indexing**.

If the array is already sorted, return `[-1, -1]`.

## Expected Time Complexity

- **Time:** \(O(n)\), where \(n\) is the length of the array.
- **Space:** \(O(1)\) auxiliary space.

## Function Signature

```java
public static int[] subarraySort(int[] nums)
```

## Parameters

- `nums`: An integer array that may contain duplicate values and may not be sorted.

## Return Value

An integer array of size `2` containing:
- `result[0]`: The starting index of the smallest subarray that needs sorting.
- `result[1]`: The ending index of the smallest subarray that needs sorting.

If the array is already sorted, return `[-1, -1]`.

## Examples

### Example 1

**Input**
```text
nums = [1, 2, 3, 3, 4, 5, 6, 8, 6, 7, 9, 8, 10, 11]
```

**Output**
```text
[7, 11]
```

**Explanation:** Sorting the subarray `[8, 6, 7, 9, 8]` at indices `7` through `11` produces `[6, 7, 8, 8, 9]`. The entire array then becomes sorted in ascending order.

### Example 2

**Input**
```text
nums = [1, 2, 6, 4, 5, 7]
```

**Output**
```text
[2, 4]
```

**Explanation:** Sorting the subarray `[6, 4, 5]` produces `[4, 5, 6]`, making the entire array sorted.

### Example 3

**Input**
```text
nums = [1, 3, 2, 4, 5]
```

**Output**
```text
[1, 2]
```

**Explanation:** Sorting the subarray `[3, 2]` produces `[2, 3]`, making the entire array sorted.

### Example 4

**Input**
```text
nums = [1, 2, 3, 4, 5]
```

**Output**
```text
[-1, -1]
```

**Explanation:** The array is already sorted, so no subarray needs to be sorted.

## Constraints

- \(1 \leq \text{nums.length} \leq 10^5\)
- \(-10^9 \leq \text{nums}[i] \leq 10^9\)
- The array may contain duplicate values.
- The selected subarray must be contiguous.
- The returned indices must use 0-based indexing.
- The selected subarray must be the smallest one that makes the entire array sorted in ascending order.
- If the array is already sorted, return `[-1, -1]`.