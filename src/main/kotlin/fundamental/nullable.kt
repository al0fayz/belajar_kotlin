fun main() {
    var a:Int = 10
    /*
        variable boleh null
        ini bisa di sebut dengan Safe calls operator (?.)
     */
    var nama:String? = null
    /*
        Elvis Operator (?:)
        Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.
     */
    print(nama?.length ?: a)

    var text :String? = null
    //check nilai null
    if (text != null){
        val textLength = text.length // ready to go
    }
}