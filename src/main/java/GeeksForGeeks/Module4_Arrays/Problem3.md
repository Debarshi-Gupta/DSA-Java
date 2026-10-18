# Check if Array is Sorted

**Difficulty:** Easy

Given an integer array `nums`, determine whether it is sorted in non-decreasing order. Return `true` if it is sorted, otherwise return `false`.

**Expected Time Complexity:** `O(n)`

## Function Signature

```java
boolean checkSortedArray(int[] nums)
```

## Parameters

- `nums` — an integer array.

## Returns

- `true` if the array is sorted in non-decreasing order.
- `false` otherwise.

## Constraints

```text
0 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
```

## Examples

### Example 1

**Input**
```text
nums = [2, 4, 6, 8, 11]
```

**Output**
```text
true
```

**Explanation**

Every element is greater than or equal to the previous element.

---

### Example 2

**Input**
```text
nums = [2, 4, 6, 5, 11]
```

**Output**
```text
false
```

**Explanation**

The element `5` is smaller than the previous element `6`, so the array is not sorted.

---

### Example 3

**Input**
```text
nums = [2]
```

**Output**
```text
true
```

**Explanation**

A single-element array is always sorted.

---

### Example 4

**Input**
```text
nums = []
```

**Output**
```text
true
```

**Explanation**

An empty array is considered sorted.