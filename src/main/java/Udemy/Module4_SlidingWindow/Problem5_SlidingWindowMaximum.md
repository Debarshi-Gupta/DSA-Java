# Sliding Window Maximum

**Difficulty:** Hard

## Problem Statement

Given an integer array `nums` and an integer `k`, find the maximum element in every contiguous sliding window of size `k`.

The sliding window moves one position to the right after each calculation. Return a list containing the maximum element from each window, in their original order.

Use a **monotonic decreasing deque** to efficiently maintain candidate maximum elements for the current window.

## Expected Time Complexity

- **Time:** \(O(n)\), where \(n\) is the length of the array. Each element is added to and removed from the deque at most once.
- **Space:** \(O(k)\) auxiliary space for the deque, excluding the result list.

## Function Signature

```java
public static List<Integer> slidingWindowMaximum(int[] nums, int k)
```

## Parameters

- `nums`: An integer array over which the sliding windows are formed.
- `k`: The size of each sliding window.

## Return Value

A list containing the maximum element from every contiguous subarray of size `k`.

## Examples

### Example 1

**Input**
```text
nums = [1, 2, 3, 1, 4, 5, 2, 3, 6]
k = 3
```

**Output**
```text
[3, 3, 4, 5, 5, 5, 6]
```

**Explanation:** The sliding windows and their maximum elements are:

| Window | Maximum |
|---|---:|
| `[1, 2, 3]` | 3 |
| `[2, 3, 1]` | 3 |
| `[3, 1, 4]` | 4 |
| `[1, 4, 5]` | 5 |
| `[4, 5, 2]` | 5 |
| `[5, 2, 3]` | 5 |
| `[2, 3, 6]` | 6 |

### Example 2

**Input**
```text
nums = [1, 3, -1, -3, 5, 3, 6, 7]
k = 3
```

**Output**
```text
[3, 3, 5, 5, 6, 7]
```

**Explanation:** The maximum elements of the consecutive windows are `3, 3, 5, 5, 6, 7`, respectively.

### Example 3

**Input**
```text
nums = [4, 4, 4, 4]
k = 2
```

**Output**
```text
[4, 4, 4]
```

**Explanation:** Every window contains two elements, both equal to `4`.

### Example 4

**Input**
```text
nums = [7, 2, 5]
k = 1
```

**Output**
```text
[7, 2, 5]
```

**Explanation:** When the window size is `1`, each element is its own window maximum.

## Constraints

- \(1 \leq \text{nums.length} \leq 10^5\)
- \(1 \leq k \leq \text{nums.length}\)
- \(-10^4 \leq \text{nums}[i] \leq 10^4\)
- The sliding window must contain exactly `k` consecutive elements.