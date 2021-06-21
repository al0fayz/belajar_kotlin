fun main() {
    val value = 20

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    //panggil when_is
    when_is()
    when_in()
}

/*
   output: value cannot be reached
*/

//contoh when menggunakan is
fun when_is(){
    val anyType : Any = 100L
    when(anyType) {
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }
}
/*
   output : the value has a Long type
*/

//contoh when dengan in
fun when_in() {
    val value =  27
    val ranges = 10..50

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
}
/*
   output : value is in the range
*/