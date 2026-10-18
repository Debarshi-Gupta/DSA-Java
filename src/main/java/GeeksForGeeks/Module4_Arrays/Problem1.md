# Find Index of Largest Element

**Difficulty:** Easy

Given an integer array `nums`, return the index of its largest element. If multiple elements have the maximum value, return the index of the first occurrence.

If the array is empty, return `-1`.

**Expected Time Complexity:** `O(n)`

## Function Signature

```java
int findLargestElement(int[] nums)
```

## Parameters

- `nums` — an integer array.

## Returns

- The index of the largest element.
- `-1` if the array is empty.

## Constraints

```text
0 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
```

## Examples

### Example 1

**Input**
```text
nums = [10, 12, 20, 15, 11]
```

**Output**
```text
2
```

**Explanation**

The largest element is `20`, which is at index `2`.

---

### Example 2

**Input**
```text
nums = [6, 9, 9, 8]
```

**Output**
```text
1
```

**Explanation**

The maximum value is `9`, which appears at indices `1` and `2`. The first occurrence is at index `1`.

---

### Example 3

**Input**
```text
nums = []
```

**Output**
```text
-1
```

**Explanation**

The array is empty.

---

### Example 4

**Input**
```text
nums = [-5, -2, -8]
```

**Output**
```text
1
```

**Explanation**

The largest element is `-2`, which is at index `1`.