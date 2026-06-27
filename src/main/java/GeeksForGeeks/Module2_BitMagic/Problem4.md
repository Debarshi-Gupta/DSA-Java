# Find the Odd Occurring Element

**Difficulty:** Easy

Given an integer array where every element occurs an even number of times except one element that occurs an odd number of times, return the element with the odd frequency.

**Expected Time Complexity:** `O(n)`

## Function Signature

```java
int findOneOddOccurringElement(int[] nums)
```

## Parameters

- `nums` — an integer array containing exactly one element with an odd frequency.

## Returns

- The element that occurs an odd number of times.

## Constraints

```text
1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
```

## Examples

### Example 1

**Input**
```text
nums = [7, 4, 7, 4, 8, 4, 8]
```

**Output**
```text
4
```

**Explanation**

The frequencies are:

- 7 → 2 times
- 4 → 3 times
- 8 → 2 times

Only `4` occurs an odd number of times.

---

### Example 2

**Input**
```text
nums = [1, 2, 3, 2, 3, 1, 3]
```

**Output**
```text
3
```

**Explanation**

`3` occurs 3 times, while all other elements occur an even number of times.

---

### Example 3

**Input**
```text
nums = [5]
```

**Output**
```text
5
```

**Explanation**

The single element occurs once, which is odd.

---

### Example 4

**Input**
```text
nums = [10, 20, 10, 20, 10]
```

**Output**
```text
10
```

**Explanation**

`10` occurs 3 times, while `20` occurs 2 times.