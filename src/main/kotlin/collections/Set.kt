fun main() {
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    // Output:

    //perbandingan set
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)

    // Output: true

    /*
        Kemudian ada juga fungsi union dan intersect untuk mengetahui gabungan dan irisan dari 2 (dua) buah Set
     */
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    // union: [1, 2, 4, 5, 7]
    // intersect: [1, 5]

    /*
        Mutable Set kita bisa menambah dan menghapus item namun tak bisa mengubah nilai seperti pada List.
     */
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
}