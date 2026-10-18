# Reverse an Array

**Difficulty:** Easy

Given an integer array `nums`, reverse the array in-place and return it.

**Expected Time Complexity:** `O(n)`

## Function Signature

```java
int[] reverseArray(int[] nums)
```

## Parameters

- `nums` — an integer array.

## Returns

- The reversed array.

## Constraints

```text
0 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
```

## Examples

### Example 1

**Input**
```text
nums = [4, 5, 6, 7]
```

**Output**
```text
[7, 6, 5, 4]
```

**Explanation**

The elements are reversed in-place.

---

### Example 2

**Input**
```text
nums = [4, 5, 6, 7, 8]
```

**Output**
```text
[8, 7, 6, 5, 4]
```

**Explanation**

The first element becomes the last, and the last becomes the first.

---

### Example 3

**Input**
```text
nums = [4]
```

**Output**
```text
[4]
```

**Explanation**

A single-element array remains unchanged after reversal.

---

### Example 4

**Input**
```text
nums = []
```

**Output**
```text
[]
```

**Explanation**

Reversing an empty array results in an empty array.