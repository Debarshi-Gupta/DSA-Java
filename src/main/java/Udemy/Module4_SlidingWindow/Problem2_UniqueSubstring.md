# Longest Unique Substring

**Difficulty:** Medium

## Problem Statement

Given a non-empty string `s`, find the **longest contiguous substring that contains no repeated characters**.

Return the substring itself. If multiple substrings have the same maximum length, return the one that appears earliest in the original string.

Use the sliding window technique and a set to track characters in the current window efficiently.

## Expected Time Complexity

- **Time:** \(O(n)\), where \(n\) is the length of the input string.
- **Space:** \(O(\min(n, C))\) auxiliary space, where \(C\) is the size of the character set.

## Function Signature

```java
public static String findUniqueSubstring(String s)
```

## Parameters

- `s`: A non-empty string in which to find the longest substring without repeated characters.

## Return Value

The longest contiguous substring containing only unique characters. If multiple longest substrings exist, return the earliest one.

## Examples

### Example 1

**Input**
```text
s = "prateekbhaiya"
```

**Output**
```text
"ekbhaiy"
```

**Explanation:** The substring `"ekbhaiy"` contains no repeated characters and has length `7`. No longer valid substring exists.

### Example 2

**Input**
```text
s = "abcabcbb"
```

**Output**
```text
"abc"
```

**Explanation:** The substring `"abc"` contains three unique characters. It is the earliest substring among those with the maximum length.

### Example 3

**Input**
```text
s = "bbbbb"
```

**Output**
```text
"b"
```

**Explanation:** Every character is identical, so the longest substring without repeated characters has length `1`.

### Example 4

**Input**
```text
s = "abcdef"
```

**Output**
```text
"abcdef"
```

**Explanation:** All characters are unique, so the entire string is the longest valid substring.

### Example 5

**Input**
```text
s = "abca"
```

**Output**
```text
"abc"
```

**Explanation:** The substring `"abc"` contains no repeated characters and has the maximum length of `3`. The later substring `"bca"` has the same length, but `"abc"` appears earlier.

## Constraints

- \(1 \leq s.length() \leq 10^5\)
- The input contains characters supported by Java's `char` type.
- The substring must be contiguous.
- No character may appear more than once in the selected substring.
- If multiple longest substrings exist, return the earliest one.