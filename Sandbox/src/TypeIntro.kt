const val MAX_POINTS = 5000

fun main(args: Array<String>) {
    val protagonistName = "william"
    val publicanName = "bob"
    var points = 5
    var hasSteed = false
    var gold = 50
    var publicanInventory = mutableListOf<String>("meand", "wine", "LaCroix")

    points += 30
    println("$protagonistName: $points")
    println(protagonistName.reversed())

}