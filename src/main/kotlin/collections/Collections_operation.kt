fun main() {
    filter()
    map()
    find()
    first()
    sum()
    sort()
}
//1. filter() dan filterNot()
fun filter(){
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }

    println(evenList)
    // evenList: [2, 4, 6, 8, 10]

    val notEvenList = numberList.filterNot { it % 2 == 0 }

    println(notEvenList)
    // notEvenList: [1, 3, 5, 7, 9]
}
//2. map()
fun map(){
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val multipliedBy5 = numberList.map { it * 5 }

    println(multipliedBy5)
    // multipliedBy5: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]

    //3. count()
    print(numberList.count())
    print(numberList.count { it % 3 == 0 })
}

//4. find(), firstOrNull(), & lastOrNull()
fun find() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }

    // firstOddNumber: 1
    // firstOrNullNumber: null
}
//5. first() & last()
fun first() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val moreThan10 = numberList.first { it > 1 }
    print(moreThan10)
}
//6. sum()
fun sum(){
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val total = numberList.sum()

    // total: 55
}
//7. sorted()
fun sort(){
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    // ascendingSort: [i, k, l, n, o, t]

    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)

    // descendingSort: [t, o, n, l, k, i]
}