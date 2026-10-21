# Run-Length Encoding

**Difficulty:** Easy

## Problem Statement

Given a non-empty string `s`, compress consecutive occurrences of the same character using **run-length encoding**.

For each group of consecutive identical characters, append the character followed by the number of times it occurs. For example, `"aaabb"` becomes `"a3b2"`.

Return the encoded string only if it is strictly shorter than the original string. Otherwise, return the original string unchanged.

## Expected Time Complexity

- **Time:** \(O(n)\), where \(n\) is the length of the input string.
- **Space:** \(O(n)\) for storing the encoded result.

## Function Signature

```java
public static String runLengthEncoding(String s)
```

## Parameters

- `s`: A non-empty string to compress.

## Return Value

The run-length encoded string if it is strictly shorter than the original; otherwise, the original string.

## Examples

### Example 1

**Input**
```text
s = "bbbaaaadexxxxxx"
```

**Output**
```text
"b3a4d1e1x6"
```

**Explanation:** The consecutive groups are `bbb`, `aaaa`, `d`, `e`, and `xxxxxx`. Their encoded representation is `"b3a4d1e1x6"`, which is shorter than the original string.

### Example 2

**Input**
```text
s = "abc"
```

**Output**
```text
"abc"
```

**Explanation:** The encoded string `"a1b1c1"` is longer than the original, so the original string is returned.

### Example 3

**Input**
```text
s = "aaabbbcc"
```

**Output**
```text
"a3b3c2"
```

**Explanation:** The encoded representation is shorter than the original string, so it is returned.

### Example 4

**Input**
```text
s = "aabb"
```

**Output**
```text
"aabb"
```

**Explanation:** The encoded representation `"a2b2"` has the same length as the original. Since the encoded string must be strictly shorter, the original string is returned.

## Constraints

- \(1 \leq s.length() \leq 10^5\)
- The input string contains characters supported by the implementation.
- Only consecutive occurrences of the same character are grouped.
- Return the original string if encoding does not reduce its length.