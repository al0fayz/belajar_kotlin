fun main() {
    //listOf bersifut immutable artinya tidak bisa di rubah
    val anyList = listOf('a', "Kotlin", 3, true)
    println(anyList[3])

    //contoh list yg bisa di rubah
    val listMutable = mutableListOf('a', "Kotlin", 3, true)
    listMutable.add('d') // menambah item di akhir list
    listMutable.add(1, "love") // menambah item pada indeks ke-1
    listMutable[3] = false // mengubah nilai item pada indeks ke-3
    listMutable.removeAt(1) // menghapus item User() berdasarkan index atau posisi nilai di dalam Array

}