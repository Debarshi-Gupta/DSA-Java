# Two Sum

**Difficulty:** Easy

## Problem Statement

Given an integer array `nums` and an integer `target`, find two distinct elements in the array whose sum equals `target`.

Return the **values** of the two elements in the order they are encountered: the previously visited element first, followed by the current element.

You may assume that **exactly one valid pair always exists**.

## Expected Time Complexity

- **Time:** \(O(n)\) on average, where \(n\) is the length of the array.
- **Space:** \(O(n)\) for storing previously visited elements in a hash set.

## Function Signature

```java
public static int[] twoSum(int[] nums, int target)
```

## Parameters

- `nums`: An integer array containing the elements to search.
- `target`: The target sum.

## Return Value

An integer array containing the values of the two distinct elements whose sum equals `target`. The previously encountered element must appear first.

## Examples

### Example 1

**Input**
```text
nums = [3, 7, 1, 8, 2, -2]
target = 6
```

**Output**
```text
[8, -2]
```

**Explanation:** The elements `8` and `-2` are distinct and sum to `6`.

### Example 2

**Input**
```text
nums = [2, 7, 11, 15]
target = 9
```

**Output**
```text
[2, 7]
```

**Explanation:** The elements `2` and `7` sum to `9`.

### Example 3

**Input**
```text
nums = [3, 2, 4]
target = 6
```

**Output**
```text
[2, 4]
```

**Explanation:** The elements `2` and `4` sum to `6`.

### Example 4

**Input**
```text
nums = [-3, 4, 3, 90]
target = 0
```

**Output**
```text
[-3, 3]
```

**Explanation:** The distinct elements `-3` and `3` sum to `0`.

## Constraints

- \(2 \leq \text{nums.length} \leq 10^4\)
- \(-10^9 \leq \text{nums}[i] \leq 10^9\)
- \(-2 \times 10^9 \leq \text{target} \leq 2 \times 10^9\)
- Exactly one valid pair exists.
- The two elements must come from distinct array positions.
- The solution must return the element values, not their indices.