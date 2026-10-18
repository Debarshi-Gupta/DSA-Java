# Longest Consecutive Sequence

**Difficulty:** Medium

## Problem Statement

Given an integer array `nums`, find the length of the longest sequence of consecutive integers.

A consecutive sequence consists of integers that follow one another without gaps, regardless of their order or positions in the original array. The sequence does not need to form a contiguous subarray.

Return the length of the longest consecutive sequence. If the array is empty, return `0`.

## Expected Time Complexity

- **Time:** \(O(n)\) on average, where \(n\) is the length of the array.
- **Space:** \(O(n)\) for storing the elements in a hash set.

## Function Signature

```java
public static int longestConsecutiveSequence(int[] nums)
```

## Parameters

- `nums`: An integer array that may contain positive integers, negative integers, and duplicate values.

## Return Value

An integer representing the length of the longest consecutive sequence. Return `0` if the array is empty.

## Examples

### Example 1

**Input**
```text
nums = [5, 2, 122, 1, 4, 14, 3, 9, 10]
```

**Output**
```text
5
```

**Explanation:** The longest consecutive sequence is `[1, 2, 3, 4, 5]`, which has a length of `5`.

### Example 2

**Input**
```text
nums = [100, 4, 200, 1, 3, 2]
```

**Output**
```text
4
```

**Explanation:** The longest consecutive sequence is `[1, 2, 3, 4]`, which has a length of `4`.

### Example 3

**Input**
```text
nums = [1, 1, 2, 2, 3, 3]
```

**Output**
```text
3
```

**Explanation:** Duplicate values do not increase the sequence length. The longest consecutive sequence is `[1, 2, 3]`.

### Example 4

**Input**
```text
nums = [10, 5, 20]
```

**Output**
```text
1
```

**Explanation:** No two distinct values are consecutive, so the longest consecutive sequence has a length of `1`.

### Example 5

**Input**
```text
nums = []
```

**Output**
```text
0
```

**Explanation:** An empty array contains no consecutive sequence.

## Constraints

- \(0 \leq \text{nums.length} \leq 10^5\)
- \(-10^9 \leq \text{nums}[i] \leq 10^9\)
- The array may contain duplicate elements.
- The consecutive sequence does not need to be contiguous in the original array.
- Aim for \(O(n)\) average time complexity.