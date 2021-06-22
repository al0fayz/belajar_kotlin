//contoh Extension Functions
fun main() {
    10.printInt()
    println(10.plusThree())
}

fun Int.printInt() {
    print("value $this")
}

/*
   output : value 10
*/

fun Int.plusThree(): Int {
    return this + 3
}

/*
   output : 13
*/