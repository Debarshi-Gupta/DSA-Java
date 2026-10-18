# Trapping Rain Water

**Difficulty:** Hard

## Problem Statement

Given an array of non-negative integers `nums`, where each element represents the height of a vertical bar with a width of `1`, calculate how much rainwater can be trapped between the bars after it rains.

Water can be trapped at an index only when there are taller or equally tall boundaries on both sides. The amount of water trapped at any index depends on the shorter of the maximum heights to its left and right.

Return the total amount of trapped rainwater.

## Expected Time Complexity

- **Time:** \(O(n)\), where \(n\) is the length of the array.
- **Space:** \(O(1)\) auxiliary space.

## Function Signature

```java
public static int trappingRainWater(int[] nums)
```

## Parameters

- `nums`: An integer array representing the heights of vertical bars.

## Return Value

An integer representing the total amount of rainwater that can be trapped. Return `0` if no water can be trapped.

## Examples

### Example 1

**Input**
```text
nums = [2, 1, 5, 3, 1, 0, 4]
```

**Output**
```text
9
```

**Explanation:** The bars trap a total of `9` units of rainwater.

### Example 2

**Input**
```text
nums = [3, 0, 2, 0, 4]
```

**Output**
```text
7
```

**Explanation:** The trapped water at the interior positions is `3 + 1 + 3 = 7` units.

### Example 3

**Input**
```text
nums = [3, 2, 1, 0]
```

**Output**
```text
0
```

**Explanation:** The bars are arranged in decreasing order, so no rainwater can be trapped.

### Example 4

**Input**
```text
nums = [4, 2, 0, 3, 2, 5]
```

**Output**
```text
9
```

**Explanation:** The elevation boundaries trap a total of `9` units of rainwater.

### Example 5

**Input**
```text
nums = [1, 2, 3, 4]
```

**Output**
```text
0
```

**Explanation:** The bars are arranged in increasing order, so no rainwater can be trapped.

## Constraints

- \(0 \leq \text{nums.length} \leq 2 \times 10^4\)
- \(0 \leq \text{nums}[i] \leq 10^5\)
- Each bar has a width of `1`.
- All bar heights are non-negative integers.
- The solution should use \(O(n)\) time and \(O(1)\) auxiliary space.