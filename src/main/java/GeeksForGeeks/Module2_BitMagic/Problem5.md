# Find the Two Odd Occurring Elements

**Difficulty:** Medium

Given an integer array where exactly two distinct elements occur an odd number of times and every other element occurs an even number of times, return the two odd occurring elements.

The returned elements may be in any order.

**Expected Time Complexity:** `O(n)`

## Function Signature

```java
int[] findTwoOddOccurringElement(int[] nums)
```

## Parameters

- `nums` — an integer array containing exactly two elements with odd frequencies.

## Returns

- An array containing the two elements that occur an odd number of times.

## Constraints

```text
2 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
```

## Examples

### Example 1

**Input**
```text
nums = [3, 4, 3, 4, 5, 4, 4, 6, 7, 7]
```

**Output**
```text
[5, 6]
```

**Explanation**

The frequencies are:

- 5 → 1 time
- 6 → 1 time

All other elements occur an even number of times.

---

### Example 2

**Input**
```text
nums = [1, 2, 3, 2, 3, 4]
```

**Output**
```text
[1, 4]
```

**Explanation**

Both `1` and `4` occur once, while every other element occurs twice.

---

### Example 3

**Input**
```text
nums = [10, 20, 10, 30, 20, 40]
```

**Output**
```text
[30, 40]
```

**Explanation**

`30` and `40` each occur once. The remaining elements occur an even number of times.

---

### Example 4

**Input**
```text
nums = [5, 5, 8, 9, 9, 11]
```

**Output**
```text
[8, 11]
```

**Explanation**

`8` and `11` each occur once, while `5` and `9` each occur twice.