class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

    println(user)
    println(dataUser)

    //equals
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)

    println(user.equals(user2))
    println(user.equals(user3))
    println(user.equals(user3))

    //menyalin data user
    val dataUser4 = dataUser.copy()

    println(dataUser4)

    //mengambil data dan menampilkan data
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
}