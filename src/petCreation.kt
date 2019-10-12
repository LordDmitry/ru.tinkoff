class pet(var age: Int = 0, var name: String = "w", var sex: String? = null)


fun main(){
   var mypet1 = pet().also {
       it.age = 5
       it.name = "firstPet"
       it.sex = null
   }
    var mypet2 = pet().apply {
        age = 6
        name = "secondPet"
        sex = null
    }

    var mypet3 = with(pet(), {
        this.age = 7
        this.name = "thirdPet"
        this.sex = "male"
        return@with this
    })

    var mypet4 = pet().let {
        it.age = 8
        it.name = "fourthPet"
        it.sex = "female"
        return@let it
    }

    println(mypet3.name)
    println(mypet4.name)
}