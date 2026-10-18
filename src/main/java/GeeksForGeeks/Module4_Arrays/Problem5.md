# Remove Duplicates from Sorted Array

**Difficulty:** Easy

Given a sorted integer array `nums`, remove the duplicates in-place such that each unique element appears only once. Return the number of unique elements.

The relative order of the unique elements must be preserved.

**Expected Time Complexity:** `O(n)`

## Function Signature

```java
int removeDuplicateFromSortedArray(int[] nums)
```

## Parameters

- `nums` — a sorted integer array.

## Returns

- The number of unique elements after removing duplicates in-place.

## Constraints

```text
0 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
nums is sorted in non-decreasing order.
```

## Examples

### Example 1

**Input**
```text
nums = [10, 20, 20, 30, 40, 40, 40]
```

**Output**
```text
4
```

**Modified Array**
```text
[10, 20, 30, 40]
```

**Explanation**

After removing duplicates, the first 4 elements of the array are the unique values.

---

### Example 2

**Input**
```text
nums = [10, 10, 10]
```

**Output**
```text
1
```

**Modified Array**
```text
[10]
```

**Explanation**

Only one distinct element remains.

---

### Example 3

**Input**
```text
nums = [10]
```

**Output**
```text
1
```

**Modified Array**
```text
[10]
```

**Explanation**

A single-element array already contains only unique elements.

---

### Example 4

**Input**
```text
nums = []
```

**Output**
```text
0
```

**Modified Array**
```text
[]
```

**Explanation**

The array is empty, so there are no unique elements.