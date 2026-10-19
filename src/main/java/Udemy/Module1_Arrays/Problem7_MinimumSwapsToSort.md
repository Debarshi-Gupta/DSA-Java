# Minimum Swaps to Sort

**Difficulty:** Medium

## Problem Statement

Given an array of **distinct integers** `nums`, find the minimum number of swaps required to sort the array in ascending order.

In one swap, you can exchange the elements at any two indices in the array.

Return the minimum number of swaps needed to sort the array.

## Expected Time Complexity

- **Time:** \(O(n \log n)\), where \(n\) is the length of the array.
- **Space:** \(O(n)\) for storing the original array copy and the element-to-index mappings.

## Function Signature

```java
public static int minimumSwapsToSort(int[] nums)
```

## Parameters

- `nums`: An array of distinct integers in any order.

## Return Value

An integer representing the minimum number of swaps required to sort the array in ascending order.

## Examples

### Example 1

**Input**
```text
nums = [10, 19, 6, 3, 5]
```

**Output**
```text
2
```

**Explanation:** The array can be sorted in two swaps:

1. Swap `10` and `3`: `[3, 19, 6, 10, 5]`
2. Swap `19` and `5`: `[3, 5, 6, 10, 19]`

Therefore, the minimum number of swaps is `2`.

### Example 2

**Input**
```text
nums = [10, 11, 5, 4, 3, 2, 1]
```

**Output**
```text
4
```

**Explanation:** The array can be sorted in four swaps:

1. Swap `10` and `1`: `[1, 11, 5, 4, 3, 2, 10]`
2. Swap `11` and `2`: `[1, 2, 5, 4, 3, 11, 10]`
3. Swap `5` and `3`: `[1, 2, 3, 4, 5, 11, 10]`
4. Swap `11` and `10`: `[1, 2, 3, 4, 5, 10, 11]`

Therefore, the minimum number of swaps is `4`.

### Example 3

**Input**
```text
nums = [1, 2, 3, 4, 5]
```

**Output**
```text
0
```

**Explanation:** The array is already sorted, so no swaps are required.

### Example 4

**Input**
```text
nums = [4, 3, 2, 1]
```

**Output**
```text
2
```

**Explanation:** Swap `4` with `1`, then swap `3` with `2` to obtain `[1, 2, 3, 4]`.

## Constraints

- \(1 \leq \text{nums.length} \leq 10^5\)
- All elements are distinct integers.
- The array may be initially sorted, reverse-sorted, or in any arbitrary order.
- Each swap may exchange elements at any two indices.
- The goal is to minimize the total number of swaps required to sort the array in ascending order.