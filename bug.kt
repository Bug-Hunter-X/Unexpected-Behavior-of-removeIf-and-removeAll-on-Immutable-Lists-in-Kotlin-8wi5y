```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val list2 = mutableListOf<Int>(1,2,3,4,5)
    list2.removeAll { it % 2 == 0 }
    println(list2) // Output: [1,3,5]

    val list3 = listOf(1,2,3,4,5)
    // list3.removeIf { it % 2 == 0 } // This will not compile because listOf is immutable
    // list3.removeAll { it % 2 == 0 } // This will not compile because listOf is immutable
}
```