# Kotlin removeIf and removeAll Bug

This repository demonstrates an uncommon bug related to the use of `removeIf` and `removeAll` functions in Kotlin when dealing with immutable lists (`listOf`).

The issue arises because `removeIf` and `removeAll` are designed to modify the list in place.  Attempting to use these functions with an immutable list (created using `listOf`) results in a compilation error because immutable lists cannot be modified.

This example highlights the importance of understanding the difference between mutable and immutable lists in Kotlin and choosing the appropriate function for the task.

## How to reproduce

1. Clone this repository.
2. Open `bug.kt` to see the code that reproduces the issue.
3. Open `bugSolution.kt` to see the corrected code.
