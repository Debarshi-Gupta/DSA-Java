# String Key Sort

**Difficulty:** Medium

## Problem Statement

Given an array of strings `str`, where each string contains multiple space-separated values, sort the rows based on a specified column.

The sorting behavior is determined by three parameters:

- `column`: The 1-based index of the column used for sorting.
- `reverse`: If `false`, sort in ascending order; if `true`, sort in descending order.
- `sortingMethod`: Specifies whether the selected column values should be compared numerically or lexicographically.

The sorting methods are:

- **NUMERIC:** Interpret the selected column values as integers and compare their numerical values.
- **LEXICOGRAPHIC:** Compare the selected column values as strings in lexicographical order.

Return a list of lists containing the split values, with the rows sorted according to the specified criteria.

## Expected Time Complexity

- **Time:** \(O(L+n\log n\cdot k)\), where \(n\) is the number of rows, \(L\) is the total number of characters across all input strings, and \(k\) is the cost of comparing the selected column values.
- **Space:** \(O(L)\) for storing the split rows.

## Function Signature

```java
public static List<List<String>> stringKeySort(
    String[] str,
    int column,
    boolean reverse,
    SortingMethod sortingMethod
)
```

## Parameters

- `str`: An array of strings containing space-separated values.
- `column`: The 1-based column index used for sorting.
- `reverse`: A boolean indicating the sorting order: `false` for ascending and `true` for descending.
- `sortingMethod`: The comparison method, either `NUMERIC` or `LEXICOGRAPHIC`.

## Return Value

A list of lists containing the split input strings, sorted according to the selected column, comparison method, and sorting order.

## Examples

### Example 1

**Input**
```text
str = ["87 022", "10, 12", "129 13"]
column = 2
reverse = false
sortingMethod = NUMERIC
```

**Output**
```text
[["10,", "12"], ["129", "13"], ["87", "022"]]
```

**Explanation:** The second-column values are interpreted as integers: `12`, `13`, and `022` (numerically `22`). Sorting in ascending numerical order produces the output shown above.

### Example 2

**Input**
```text
str = ["87 022", "10, 12", "129 13"]
column = 2
reverse = true
sortingMethod = LEXICOGRAPHIC
```

**Output**
```text
[["129", "13"], ["10,", "12"], ["87", "022"]]
```

**Explanation:** The second-column values are compared as strings in descending lexicographical order: `"13"`, `"12"`, `"022"`.

### Example 3

**Input**
```text
str = ["apple 30", "banana 10", "cherry 20"]
column = 2
reverse = false
sortingMethod = NUMERIC
```

**Output**
```text
[["banana", "10"], ["cherry", "20"], ["apple", "30"]]
```

**Explanation:** The second-column values are sorted in ascending numerical order: `10`, `20`, and `30`.

### Example 4

**Input**
```text
str = ["cat", "apple", "banana"]
column = 1
reverse = true
sortingMethod = LEXICOGRAPHIC
```

**Output**
```text
[["cat"], ["banana"], ["apple"]]
```

**Explanation:** The strings are sorted in descending lexicographical order.

### Example 5

**Input**
```text
str = ["item 5", "item 15", "item 2"]
column = 2
reverse = true
sortingMethod = NUMERIC
```

**Output**
```text
[["item", "15"], ["item", "5"], ["item", "2"]]
```

**Explanation:** The second-column values are interpreted as integers and sorted in descending numerical order: `15`, `5`, and `2`.

## Constraints

- `str` may contain zero or more rows.
- Each row contains space-separated values.
- `1 <= column <= number of columns in each row`.
- All rows must contain the specified column.
- In `NUMERIC` mode, each selected column value must be a valid integer.
- In `LEXICOGRAPHIC` mode, selected values are compared as strings.
- `reverse = false` specifies ascending order.
- `reverse = true` specifies descending order.
- The original row values must be preserved in the returned result.