# Count Subarrays with Target Sum

**Difficulty:** Medium

## Problem Statement

Given an integer array `nums` (which may contain positive numbers, negative numbers, and zeros) and an integer `target`, count the total number of **contiguous subarrays whose sum equals `target`**.

Return the total count of such subarrays.

Use **prefix sums and a HashMap** to efficiently track the frequency of previously encountered prefix sums.

## Expected Time Complexity

- **Time:** \(O(n)\) on average, where \(n\) is the length of the array. Each element is processed once, with constant-time average HashMap operations.
- **Space:** \(O(n)\) in the worst case for storing prefix sums and their frequencies.

## Function Signature

```java
public static int countSubarraysWithTargetSum(int[] nums, int target)
```

## Parameters

- `nums`: An integer array that may contain positive numbers, negative numbers, and zeros.
- `target`: The required sum of each contiguous subarray.

## Return Value

An integer representing the total number of contiguous subarrays whose sum equals `target`. Return `0` if no matching subarray exists.

## Examples

### Example 1

**Input**
```text
nums = [10, 2, -2, -20, 10]
target = -10
```

**Output**
```text
3
```

**Explanation:** The following three subarrays have a sum of `-10`:

- `[10, 2, -2, -20]` → sum = `-10`
- `[2, -2, -20, 10]` → sum = `-10`
- `[-20, 10]` → sum = `-10`

### Example 2

**Input**
```text
nums = [1, 1, 1]
target = 2
```

**Output**
```text
2
```

**Explanation:** The matching subarrays are `[1, 1]` at indices `[0, 1]` and `[1, 2]`.

### Example 3

**Input**
```text
nums = [1, -1, 0]
target = 0
```

**Output**
```text
3
```

**Explanation:** The matching subarrays are:

- `[1, -1]`
- `[1, -1, 0]`
- `[0]`

### Example 4

**Input**
```text
nums = [1, 2, 3]
target = 7
```

**Output**
```text
0
```

**Explanation:** No contiguous subarray has a sum equal to `7`.

### Example 5

**Input**
```text
nums = [0, 0, 0]
target = 0
```

**Output**
```text
6
```

**Explanation:** Every non-empty contiguous subarray has a sum of `0`. There are six such subarrays.

## Constraints

- \(0 \leq \text{nums.length} \leq 10^5\)
- \(-10^9 \leq \text{nums}[i] \leq 10^9\)
- `target` is a valid Java `int`.
- The cumulative prefix sums must fit within the Java `int` range.
- The total number of matching subarrays must fit within the Java `int` range.
- Only contiguous, non-empty subarrays are considered.