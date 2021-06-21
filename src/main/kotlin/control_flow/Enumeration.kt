fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE
}

//contoh enumeration
enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
/*
    Note:
    objek yang berada di dalam Enum secara implisit bersifat static dan final sehingga tidak bisa d rubah

 */