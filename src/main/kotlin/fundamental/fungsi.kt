fun main() {
    printUser("Alfa")
}
fun printUser(name : String){
    println("hello $name")

    var penjumlahan = tambah(30, 20)
    println(penjumlahan)
}

//contoh dengan return yg di definisikan
fun tambah(nilaiA: Int, nilaiB: Int): String{
    var hasil = nilaiA + nilaiB
    return "hasil jumlah nilaiA + nilaiB = $hasil"
}