# Three Sum

**Difficulty:** Medium

## Problem Statement

Given an integer array `nums` and an integer `target`, find all unique triplets of distinct elements whose sum equals `target`.

Return a list of triplets, where each triplet contains three integers from different array positions. The order of elements within each triplet must be non-decreasing, and duplicate triplets must not be included in the result.

If no valid triplets exist, return an empty list.

## Expected Time Complexity

- **Time:** \(O(n^2)\), where \(n\) is the length of the array.
- **Space:** \(O(1)\) auxiliary space for the two-pointer search, excluding the space required for sorting and storing the result. Sorting may require implementation-dependent auxiliary space.

## Function Signature

```java
public static List<List<Integer>> threeSum(int[] nums, int target)
```

## Parameters

- `nums`: An integer array containing the elements to search.
- `target`: The target sum for each triplet.

## Return Value

A list of unique triplets whose elements sum to `target`. Return an empty list if no valid triplets exist.

## Examples

### Example 1

**Input**
```text
nums = [3, 7, 1, 8, 2, -2, 0]
target = 6
```

**Output**
```text
[[-2, 0, 8], [-2, 1, 7], [1, 2, 3]]
```

**Explanation:** Each triplet contains three distinct elements whose sum equals `6`. Duplicate triplets are not included.

### Example 2

**Input**
```text
nums = [1, 2, 3, 4, 5]
target = 9
```

**Output**
```text
[[1, 3, 5], [2, 3, 4]]
```

**Explanation:** Both triplets sum to `9`.

### Example 3

**Input**
```text
nums = [1, 1, 1, 2, 2, 3]
target = 4
```

**Output**
```text
[[1, 1, 2]]
```

**Explanation:** Although duplicate values exist in the array, each unique triplet is returned only once.

### Example 4

**Input**
```text
nums = [1, 2, 4, 8]
target = 20
```

**Output**
```text
[]
```

**Explanation:** No combination of three distinct elements sums to `20`, so an empty list is returned.

## Constraints

- \(3 \leq \text{nums.length} \leq 10^4\)
- \(-10^9 \leq \text{nums}[i] \leq 10^9\)
- \(-3 \times 10^9 \leq \text{target} \leq 3 \times 10^9\)
- Each triplet must use three distinct array positions.
- The result must not contain duplicate triplets.
- The elements within each triplet must be sorted in non-decreasing order.
- The array may contain duplicate values, positive integers, negative integers, and zero.
- If no valid triplets exist, return an empty list.