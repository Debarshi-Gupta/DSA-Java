# Find Index of Second Largest Element

**Difficulty:** Easy

Given an integer array `nums`, return the index of the second largest **distinct** element. If multiple occurrences of the second largest element exist, return the index of its first occurrence.

If the array contains fewer than two distinct elements, return `-1`.

**Expected Time Complexity:** `O(n)`

## Function Signature

```java
int findSecondLargestElement(int[] nums)
```

## Parameters

- `nums` — an integer array.

## Returns

- The index of the second largest distinct element.
- `-1` if no such element exists.

## Constraints

```text
1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
```

## Examples

### Example 1

**Input**
```text
nums = [10, 4, 7, 8, 2]
```

**Output**
```text
3
```

**Explanation**

The largest element is `10` (index `0`) and the second largest distinct element is `8` (index `3`).

---

### Example 2

**Input**
```text
nums = [10]
```

**Output**
```text
-1
```

**Explanation**

The array contains fewer than two distinct elements.

---

### Example 3

**Input**
```text
nums = [10, 10, 10]
```

**Output**
```text
-1
```

**Explanation**

There is no second largest distinct element.

---

### Example 4

**Input**
```text
nums = [5, 2, 5, 4]
```

**Output**
```text
3
```

**Explanation**

The largest distinct element is `5`, and the second largest distinct element is `4`, which is at index `3`.