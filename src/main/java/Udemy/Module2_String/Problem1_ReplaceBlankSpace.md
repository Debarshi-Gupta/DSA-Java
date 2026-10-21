# Replace Blank Spaces in a String

**Difficulty:** Easy

## Problem Statement

Given a string `s` and a string `token`, replace every space character (`' '`) in `s` with the specified `token`.

Return the modified string. All non-space characters must remain unchanged.

## Expected Time Complexity

- **Time:** \(O(n)\), where \(n\) is the length of the input string, excluding implementation-specific regular expression overhead.
- **Space:** \(O(n + k \cdot m)\), where \(k\) is the number of spaces in the input string and \(m\) is the length of `token`, to construct the resulting string.

## Function Signature

```java
public static String replaceBlankSpace(String s, String token)
```

## Parameters

- `s`: The input string in which spaces must be replaced.
- `token`: The string that replaces each space character.

## Return Value

A new string in which every space character in `s` is replaced by `token`.

## Examples

### Example 1

**Input**
```text
s = "He is the best coder."
token = "%20"
```

**Output**
```text
"He%20is%20the%20best%20coder."
```

**Explanation:** Each of the four spaces is replaced with `%20`.

### Example 2

**Input**
```text
s = "hello world"
token = "-"
```

**Output**
```text
"hello-world"
```

**Explanation:** The space between `hello` and `world` is replaced with `-`.

### Example 3

**Input**
```text
s = "a  b"
token = "_"
```

**Output**
```text
"a__b"
```

**Explanation:** Both consecutive spaces are replaced individually with `_`.

### Example 4

**Input**
```text
s = "hello"
token = "%20"
```

**Output**
```text
"hello"
```

**Explanation:** Since the string contains no spaces, it remains unchanged.

### Example 5

**Input**
```text
s = " a "
token = "*"
```

**Output**
```text
"*a*"
```

**Explanation:** Both the leading and trailing spaces are replaced with `*`.

## Constraints

- `s` may contain letters, digits, punctuation, and space characters.
- `token` is a string used to replace each space.
- Every occurrence of a space character (`' '`) must be replaced.
- Consecutive spaces must be replaced individually.
- Leading and trailing spaces must also be replaced.
- Other whitespace characters, such as tabs and newlines, are not treated as spaces unless explicitly specified.