fun main() {
    var cth = contoh(2, 5)
    println(cth)
}
fun contoh(nilaiA: Int, nilaiB: Int, nilaiC: Int = 10):String{
    val hasil = nilaiA + nilaiB + nilaiC
    return "jumlah = $hasil"
}