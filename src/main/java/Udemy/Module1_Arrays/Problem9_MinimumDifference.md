# Minimum Difference Between Two Arrays

**Difficulty:** Medium

## Problem Statement

Given two integer arrays, `nums1` and `nums2`, find one element from each array such that the absolute difference between the selected elements is minimized.

Return an integer array containing the selected values in the following order:
- `result[0]`: The selected element from `nums1`.
- `result[1]`: The selected element from `nums2`.

If multiple pairs have the same minimum absolute difference, return any one of them.

Both input arrays are assumed to be non-empty.

## Expected Time Complexity

- **Time:** \(O(n \log n + m \log m)\), where \(n\) and \(m\) are the lengths of `nums1` and `nums2`, respectively.
- **Space:** \(O(1)\) auxiliary space for the two-pointer traversal, excluding sorting implementation overhead.

## Function Signature

```java
public static int[] minimumDifference(int[] nums1, int[] nums2)
```

## Parameters

- `nums1`: The first non-empty integer array.
- `nums2`: The second non-empty integer array.

## Return Value

An integer array of size `2` containing the pair of values, one from each input array, with the minimum absolute difference.

## Examples

### Example 1

**Input**
```text
nums1 = [23, 5, 10, 17, 30]
nums2 = [26, 134, 135, 14, 19]
```

**Output**
```text
[17, 19]
```

**Explanation:** The absolute difference is `|17 - 19| = 2`, which is the minimum possible difference between an element from each array.

### Example 2

**Input**
```text
nums1 = [1, 3, 15, 11, 2]
nums2 = [23, 127, 235, 19, 8]
```

**Output**
```text
[11, 8]
```

**Explanation:** The absolute difference is `|11 - 8| = 3`, which is the minimum possible difference.

### Example 3

**Input**
```text
nums1 = [4, 10, 20]
nums2 = [5, 12, 30]
```

**Output**
```text
[4, 5]
```

**Explanation:** The absolute difference is `|4 - 5| = 1`, the minimum possible difference.

### Example 4

**Input**
```text
nums1 = [1, 5, 9]
nums2 = [2, 6, 10]
```

**Output**
```text
[1, 2]
```

**Explanation:** The absolute difference is `1`. Several pairs achieve this minimum, and any one of them is a valid answer.

### Example 5

**Input**
```text
nums1 = [1, 4, 7]
nums2 = [2, 4, 9]
```

**Output**
```text
[4, 4]
```

**Explanation:** Both arrays contain `4`, so the minimum absolute difference is `0`.

## Constraints

- \(1 \leq \text{nums1.length}, \text{nums2.length} \leq 10^5\)
- Array elements are integers.
- Both arrays may contain duplicate values.
- Elements may be positive, negative, or zero.
- The selected pair must contain exactly one element from each array.
- The goal is to minimize the absolute difference between the selected elements.

## Approach

Sort both arrays in ascending order, then use two pointers to find the closest pair efficiently.

- If `nums1[left]` is smaller, move the pointer in `nums1` forward.
- If `nums2[right]` is smaller, move the pointer in `nums2` forward.
- Track the pair with the minimum absolute difference.
- Stop early if an equal pair is found, since the minimum possible difference is `0`.

**Note:** Sorting modifies both input arrays in place.