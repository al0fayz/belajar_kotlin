fun main() {
    message()
    printMessage("Hello From Lambda")
}
//contoh lambda
val message = { println("Hello From Lambda") }

//lambda dengan parameter

val printMessage = { message: String -> println(message) }
