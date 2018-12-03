fun main(args: Array<String>) {
    var healthPoints = 80
    var karma = 16
    val name = "Ricardo"
    val isBlessed = false
    val isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = when(karma){
        in 0..5 -> "RED"
        in 6..10 -> "ORANGE"
        in 11..15 -> "PURPLE"
        else -> "GREEN"
    }

//    val healthStatus = if(healthPoints == 100){
//        "$name is in perfect health"
//    }else if(healthPoints in 90..99){
//        if(isBlessed){
//            "$name is a little hurt but will recover quickly"
//        }else{
//            "$name is a little hurt"
//        }
//    }else if(healthPoints in 75..89){
//        if(isBlessed){
//            "$name is kind of hurt, but will heal quickly"
//        }else{
//            "$name is kind of hurt"
//        }
//    }else if (healthPoints in 50..74){
//        "$name is really starting to hurt now"
//    }else if (healthPoints in 15..49){
//        "${name.toUpperCase()} NEEDS TO HEAL"
//    }else{
//        "$name will die soon"
//
//    }

    //the code below is the same as all the code commented out above
    val healthStatus = when(healthPoints){
        100 -> "$name is in excellent health"
        in 90..99 -> "$name isn't doing too bad"
        in 75..89 -> if (isBlessed) "$name has minor wounds, but will recover quickly" else "$name has minor wounds"
        in 50..74 -> if (isBlessed) "$name has moderate wounds, but will recover quickly" else "$name has moderate wounds"
        in 25..49 -> "$name is severely wounded"
        in 15..24 -> "$name is even severely wounded"
        else -> "$name is going to die soon"
    }

    val statusFormatString = "(HP: $healthPoints)(Aura: $auraColor)(Blessed: ${if(isBlessed)"YES" else "NO"}) -> $healthStatus"
    println(statusFormatString)
//    println("(Aura:$auraColor)" +
//            "(Blessed:${if(isBlessed)"YES" else "NO"})\n$healthStatus")

}