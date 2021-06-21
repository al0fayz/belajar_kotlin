fun main() {
    val rangeInt = 1..10 //default step 1
    //Jarak antara dua nilai yang dicakup, ditentukan oleh step
    println(rangeInt.step)

    contoh_rubah_step()
    contoh_rangeTo()
}
/*
   output: 1
*/

//jika kita ingin merubah nilai step
fun contoh_rubah_step() {
    val rangeData = 1..10 step 3
    rangeData.forEach(){
        print("$it")
    }
    println("\n"+rangeData.step)
}

//contoh rangeTo
fun contoh_rangeTo(){
    var alfabet = 'A'.rangeTo('Z')
    alfabet.forEach(){
        print("$it")
    }
    if('D' in alfabet){
        println("\n D is availlable")
    }
}
//contoh downTo
fun contoh_downTo() {
    var nilai = 10.downTo(1)
    nilai.forEach(){
        print("$it")
    }
}