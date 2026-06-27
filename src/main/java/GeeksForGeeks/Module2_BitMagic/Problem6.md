# Generate Power Set

**Difficulty:** Medium

Given a string `s` consisting of distinct characters, return all possible subsets (the power set) of its characters.

The subsets may be returned in any order. The empty subset should also be included.

**Expected Time Complexity:** `O(n × 2ⁿ)`

## Function Signature

```java
List<String> findPowerSet(String s)
```

## Parameters

- `s` — a string consisting of distinct characters.

## Returns

- A list containing all possible subsets of `s`.

## Constraints

```text
0 <= s.length() <= 20
s consists of distinct English letters.
```

## Examples

### Example 1

**Input**
```text
s = "abc"
```

**Output**
```text
["", "a", "b", "ab", "c", "ac", "bc", "abc"]
```

**Explanation**

The string has \(2^3 = 8\) subsets.

---

### Example 2

**Input**
```text
s = "ab"
```

**Output**
```text
["", "a", "b", "ab"]
```

**Explanation**

The string has \(2^2 = 4\) subsets.

---

### Example 3

**Input**
```text
s = "x"
```

**Output**
```text
["", "x"]
```

**Explanation**

A single character has two subsets: the empty subset and the character itself.

---

### Example 4

**Input**
```text
s = ""
```

**Output**
```text
[""]
```

**Explanation**

The empty string has exactly one subset: the empty subset.