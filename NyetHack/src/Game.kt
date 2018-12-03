fun main(args: Array<String>) {
    var healthPoints = 80
    val name = "Ricardo"
    val isBlessed = true
    val isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if(auraVisible)"GREEN" else "NONE"

    val healthStatus = if(healthPoints == 100){
        "$name is in perfect health"
    }else if(healthPoints in 90..99){
        if(isBlessed){
            "$name is a little hurt but will recover quickly"
        }else{
            "$name is a little hurt"
        }
    }else if(healthPoints in 75..89){
        if(isBlessed){
            "$name is kind of hurt, but will heal quickly"
        }else{
            "$name is kind of hurt"
        }
    }else if (healthPoints in 50..74){
        "$name is really starting to hurt now"
    }else if (healthPoints >= 15){
        "${name.toUpperCase()} NEEDS TO HEAL"
    }else{
        "$name will die soon"

    }

    println("$auraColor\n$healthStatus")

}