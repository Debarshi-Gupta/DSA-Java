# String Normalisation

**Difficulty:** Easy

## Problem Statement

Given a string `s` containing letters, digits, whitespace, punctuation, and other characters, normalize every contiguous sequence of letters as follows:

- Convert the first letter of each sequence to uppercase.
- Convert all remaining letters in the sequence to lowercase.
- Preserve all non-letter characters exactly as they appear, including spaces, punctuation, and digits.

Return the normalized string.

## Expected Time Complexity

- **Time:** \(O(n)\), where \(n\) is the length of the input string.
- **Space:** \(O(n)\) for storing the resulting string.

## Function Signature

```java
public static String stringNormalisation(String s)
```

## Parameters

- `s`: The input string to normalize.

## Return Value

A normalized string in which each contiguous sequence of letters follows the specified capitalization rules, while all non-letter characters remain unchanged.

## Examples

### Example 1

**Input**
```text
s = "This is SO MUCH FUN! I want to scream!!"
```

**Output**
```text
"This Is So Much Fun! I Want To Scream!!"
```

**Explanation:** Each sequence of letters begins with an uppercase letter, followed by lowercase letters. Spaces and punctuation are preserved.

### Example 2

**Input**
```text
s = "hELLO, wORLD!"
```

**Output**
```text
"Hello, World!"
```

**Explanation:** The letter sequences `"hELLO"` and `"wORLD"` are normalized independently. The comma, space, and exclamation mark remain unchanged.

### Example 3

**Input**
```text
s = "JAVA123 sPRING-BOOT"
```

**Output**
```text
"Java123 Spring-Boot"
```

**Explanation:** Letters are normalized in contiguous sequences. Digits and hyphens remain unchanged.

### Example 4

**Input**
```text
s = "aBC   dEF"
```

**Output**
```text
"Abc   Def"
```

**Explanation:** Each letter sequence is normalized independently, and all three consecutive spaces are preserved.

## Constraints

- \(1 \leq s.length() \leq 10^5\)
- The input may contain letters, digits, whitespace, punctuation, and other characters.
- A word is defined as a contiguous sequence of letters.
- All non-letter characters must be preserved exactly as they appear in the input.