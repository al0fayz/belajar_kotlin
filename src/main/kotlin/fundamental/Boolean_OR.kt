fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isClose = now < officeOpen || now > officeClosed

    print("Office is closed : $isClose")
    /*
        Output : Office is closed : true
     */
}