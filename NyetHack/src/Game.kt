    val name = "Ricardo"


fun main(args: Array<String>) {
    var healthPoints = 80
    val isBlessed = true
    val isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = auraColor(isBlessed,healthPoints,isImmortal)

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    printPlayerStatys(auraColor,isBlessed, name, healthStatus)

    castFireball()
//    println("(Aura:$auraColor" +
//            "(Blessed:${if(isBlessed)"YES" else "NO"})\n$name $healthStatus")

}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean)=
    when (healthPoints) {
        100 -> "is in excellent health"
        in 90..99 -> "isn't doing too bad"
        in 75..89 -> if (isBlessed) "has minor wounds, but will recover quickly" else "has minor wounds"
        in 50..74 -> if (isBlessed) "has moderate wounds, but will recover quickly" else "has moderate wounds"
        in 25..49 -> "is severely wounded"
        in 15..24 -> "is even severely wounded"
        else -> "is going to die soon"
    }

    private fun printPlayerStatys(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String){
    println("(Aura:$auraColor" + "(Blessed:${if(isBlessed)"YES" else "NO"})\n$name $healthStatus")
}

    private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean):String{
        val auaraVisible = isBlessed && healthPoints > 50 || isImmortal
        val auraColor = if(auaraVisible)"GREEN" else "NONE"
        return auraColor
    }

    private fun castFireball(numFireballs: Int = 2)=
        println("x$numFireballs ${if(numFireballs > 1) "balls" else "ball"} of fire springs into existence.")




