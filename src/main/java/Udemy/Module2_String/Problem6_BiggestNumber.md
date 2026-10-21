# Biggest Number String

**Difficulty:** Medium

## Problem Statement

Given an array of non-negative integers `nums`, rearrange the elements and concatenate them to form the **largest possible number**.

You may rearrange the order of the integers, but you cannot rearrange the digits within an individual integer.

To determine the optimal order of two integers `a` and `b`, compare the concatenated strings `ab` and `ba`. Place `a` before `b` if `ab` is lexicographically greater than `ba`.

Return the largest possible concatenated number as a string.

## Expected Time Complexity

- **Time:** \(O(n \log n \cdot k)\), where \(n\) is the number of elements and \(k\) is the maximum number of digits in an element.
- **Space:** \(O(nk)\) for storing the string representations and constructing the result, excluding sorting overhead.

## Function Signature

```java
public static String biggestNumber(int[] nums)
```

## Parameters

- `nums`: An array of non-negative integers to rearrange.

## Return Value

A string representing the largest number that can be formed by concatenating all elements in an optimal order.

## Examples

### Example 1

**Input**
```text
nums = [10, 11, 20, 30, 3]
```

**Output**
```text
"330201110"
```

**Explanation:** Arranging the integers as `[3, 30, 20, 11, 10]` produces `"330201110"`, the largest possible concatenated number.

### Example 2

**Input**
```text
nums = [3, 30, 34, 5, 9]
```

**Output**
```text
"9534330"
```

**Explanation:** The optimal ordering is `[9, 5, 34, 3, 30]`, which produces `"9534330"`.

### Example 3

**Input**
```text
nums = [10, 2]
```

**Output**
```text
"210"
```

**Explanation:** Placing `2` before `10` produces `"210"`, which is greater than `"102"`.

### Example 4

**Input**
```text
nums = [12, 121]
```

**Output**
```text
"12121"
```

**Explanation:** Comparing `"12121"` with `"12112"` shows that placing `12` before `121` produces the larger number.

### Example 5

**Input**
```text
nums = [0, 0, 0]
```

**Output**
```text
"000"
```

**Explanation:** The implementation concatenates all elements as strings, so the output contains all three zeros.

## Constraints

- \(0 \leq \text{nums.length} \leq 10^5\)
- \(0 \leq \text{nums}[i] \leq 10^9\)
- The array may contain duplicate integers.
- The digits within each integer must remain in their original order.
- The result may exceed the range of standard integer data types and must be returned as a string.
- The elements must be arranged to maximize the concatenated result.