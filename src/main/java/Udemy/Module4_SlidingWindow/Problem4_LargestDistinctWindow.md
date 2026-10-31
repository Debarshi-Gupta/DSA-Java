# Largest Distinct Window

**Difficulty:** Medium

## Problem Statement

Given a non-empty string `s`, find the **longest contiguous substring containing no repeated characters**.

Return the substring itself. If multiple substrings have the same maximum length, return the one that appears earliest in the original string.

Use the sliding window technique and a set to efficiently track the characters present in the current window.

## Expected Time Complexity

- **Time:** \(O(n)\) on average, where \(n\) is the length of the input string. Each character is added to and removed from the set at most once.
- **Space:** \(O(\min(n, C))\), where \(C\) is the number of distinct characters supported by the input character set.

## Function Signature

```java
public static String largestDistinctWindow(String s)
```

## Parameters

- `s`: A non-empty string in which to find the longest substring containing only distinct characters.

## Return Value

The longest contiguous substring containing no repeated characters. If multiple substrings have the same maximum length, return the earliest one.

## Examples

### Example 1

**Input**
```text
s = "aabcbcdbcaaad"
```

**Output**
```text
"dbca"
```

**Explanation:** The substring `"dbca"` contains four distinct characters and has the maximum length among all valid substrings.

### Example 2

**Input**
```text
s = "aaaa"
```

**Output**
```text
"a"
```

**Explanation:** Every character is identical, so the longest substring without repeated characters has length `1`.

### Example 3

**Input**
```text
s = "abcabcbb"
```

**Output**
```text
"abc"
```

**Explanation:** `"abc"`, `"bca"`, and `"cab"` are all valid substrings of maximum length. Since `"abc"` appears earliest, it is returned.

### Example 4

**Input**
```text
s = "abcdef"
```

**Output**
```text
"abcdef"
```

**Explanation:** All characters are distinct, so the entire string is the longest valid substring.

## Constraints

- \(1 \leq s.length() \leq 10^5\)
- The input string contains characters supported by Java's `char` type.
- The substring must be contiguous.
- No character may appear more than once in the selected substring.
- If multiple longest substrings exist, return the earliest one.