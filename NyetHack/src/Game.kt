fun main(args: Array<String>) {
    var healthPoints = 80
    val name = "Ricardo"
    val isBlessed = true
    val isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if(auraVisible)"GREEN" else "NONE"

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
        100 -> "is in excellent health"
        in 90..99 -> "isn't doing too bad"
        in 75..89 -> if (isBlessed) "has minor wounds, but will recover quickly" else "has minor wounds"
        in 50..74 -> if (isBlessed) "has moderate wounds, but will recover quickly" else "has moderate wounds"
        in 25..49 -> "is severely wounded"
        in 15..24 -> "is even severely wounded"
        else -> "is going to die soon"
    }

    println("(Aura:$auraColor" +
            "(Blessed:${if(isBlessed)"YES" else "NO"})\n$healthStatus")

}