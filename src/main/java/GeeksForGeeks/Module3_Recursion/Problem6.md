# Tower of Hanoi

**Difficulty:** Medium

Given `n` disks placed on the source rod, print the sequence of moves required to transfer all disks to the destination rod using an auxiliary rod.

The following rules must always be followed:

- Only one disk can be moved at a time.
- A larger disk cannot be placed on top of a smaller disk.
- Every move transfers the topmost disk from one rod to another.

Solve the problem using recursion.

**Expected Time Complexity:** `O(2ⁿ)`

## Function Signature

```java
List<String> towerOfHanoi(int n, char source, char auxiliary, char destination)
```

## Parameters

- `n` — the number of disks.
- `source` — the source rod.
- `auxiliary` — the auxiliary rod.
- `destination` — the destination rod.

## Returns

- A list of strings representing the sequence of moves required to solve the puzzle.

## Constraints

```text
1 <= n <= 20
```

## Examples

### Example 1

**Input**
```text
n = 3
source = 'A'
auxiliary = 'B'
destination = 'C'
```

**Output**
```text
[
  "Move Disk 1 From A To C",
  "Move Disk 2 From A To B",
  "Move Disk 1 From C To B",
  "Move Disk 3 From A To C",
  "Move Disk 1 From B To A",
  "Move Disk 2 From B To C",
  "Move Disk 1 From A To C"
]
```

**Explanation**

The minimum number of moves required is `2³ - 1 = 7`.

---

### Example 2

**Input**
```text
n = 1
source = 'A'
auxiliary = 'B'
destination = 'C'
```

**Output**
```text
[
  "Move Disk 1 From A To C"
]
```

**Explanation**

A single disk can be moved directly to the destination.

---

### Example 3

**Input**
```text
n = 2
source = 'X'
auxiliary = 'Y'
destination = 'Z'
```

**Output**
```text
[
  "Move Disk 1 From X To Y",
  "Move Disk 2 From X To Z",
  "Move Disk 1 From Y To Z"
]
```

**Explanation**

The puzzle is solved in `2² - 1 = 3` moves.