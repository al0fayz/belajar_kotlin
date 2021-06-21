fun main() {
    //int
    val intNumber = 100
    //Long
    val longNumber: Long = 100
    //atau
    val longNumber_2 = 100L
    //Short
    val shortNumber: Short = 10

    //Byte
    val byteNumber = 0b11010010
    //Double
    val doubleNumber: Double = 1.3
    //float
    val floatNumber: Float = 0.123456789f //yang terbaca hanya 0.1234567

    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    /*
     output :
            2147483647
            -2147483648
     */

    /*
        untuk merubah type number
        *=========================*

        toByte(): Byte

        toShort(): Short

        toInt(): Int

        toLong(): Long

        toFloat(): Float

        toDouble(): Double

        toChar(): Char
     */
}