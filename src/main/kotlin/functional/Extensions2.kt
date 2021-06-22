//contoh Extension Properties
fun main() {
    println(10.slice)
}

val Int.slice: Int
    get() = this / 2

/*
   output : 5
*/