private open class Ccat {
    open fun hunt () {
        println("Я охочусь на мышей, ведь я кот!")
    }
}

private class homeCat: Ccat(){
    fun hunt(isHunter: Boolean){
        if(isHunter){
            super.hunt()
        } else{
            println("Ты че сдурел? Какие мыши? Иди корми меня, ленивая задница!")
        }

    }
}