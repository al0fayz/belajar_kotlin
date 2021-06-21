//bisa di rubah
//var identifier: Type = initialization

//tidak bisa di rubah nilainya
//val identifier: Type = initialization

fun main() {
    var nama:String = "Alfa"
    val jenis_kelamin:Char = 'L'
    println("nama saya = $nama dan jenis kelamin saya $jenis_kelamin")

    //untuk char kita bisa melakukan increment
    var character : Char = 'A'

    for(char in nama){
        println(character++)
    }
}