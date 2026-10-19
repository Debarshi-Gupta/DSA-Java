# Product of Array Except Self

**Difficulty:** Medium

## Problem Statement

Given an integer array `nums`, return an array `result` such that `result[i]` is equal to the product of all elements of `nums` except `nums[i]`.

**You must solve the problem without using the division operator.**

The solution should run in linear time complexity, \(O(n)\).

## Expected Time Complexity

- **Time:** \(O(n)\), where \(n\) is the length of the array.
- **Space:** \(O(n)\) auxiliary space for storing prefix products, suffix products, and the result.

## Function Signature

```java
public static int[] productExceptSelf(int[] nums)
```

## Parameters

- `nums`: An integer array containing the elements whose products are to be calculated.

## Return Value

An integer array `result` of the same length as `nums`, where each element contains the product of all array elements except the element at the corresponding index.

## Examples

### Example 1

**Input**
```text
nums = [1, 2, 3, 4, 5]
```

**Output**
```text
[120, 60, 40, 30, 24]
```

**Explanation:**

- `result[0] = 2 × 3 × 4 × 5 = 120`
- `result[1] = 1 × 3 × 4 × 5 = 60`
- `result[2] = 1 × 2 × 4 × 5 = 40`
- `result[3] = 1 × 2 × 3 × 5 = 30`
- `result[4] = 1 × 2 × 3 × 4 = 24`

### Example 2

**Input**
```text
nums = [2, 3, 4]
```

**Output**
```text
[12, 8, 6]
```

**Explanation:** Each output element is the product of the other two elements.

### Example 3

**Input**
```text
nums = [1, 2, 0, 4]
```

**Output**
```text
[0, 0, 8, 0]
```

**Explanation:** Since the array contains one zero, the products for all positions except the zero's position are `0`. At index `2`, the product is `1 × 2 × 4 = 8`.

### Example 4

**Input**
```text
nums = [-1, 2, -3, 4]
```

**Output**
```text
[-24, 12, -8, 6]
```

**Explanation:** The product of all elements except the element at each index gives the corresponding output value.

## Constraints

- \(2 \leq \text{nums.length} \leq 10^5\)
- \(-30 \leq \text{nums}[i] \leq 30\)
- The product for each output element fits within the 32-bit signed integer range.
- The division operator must not be used.
- Aim for \(O(n)\) time complexity.

## Approach

Use **prefix products** and **suffix products** to calculate the product of all elements except the current element.

- **Prefix product:** The product of all elements before the current index.
- **Suffix product:** The product of all elements after the current index.
- **Result:** Multiply the prefix product and suffix product for each index.

Handle the first and last indices separately because they have no elements before or after them, respectively.