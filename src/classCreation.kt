abstract class Pet(val name: String, val age: Int){
    var fed = false
    var away = false
    abstract fun eat() : String

    fun feed() : String{

        if (away){
            println("вы не можете покормить убежавшее животное $name")
            return "вы не можете покормить убежавшее животное"
        }
        if (fed){
            away = true
            println("ваше животное $name убежало")
            return "ваше животное убежало"
        }
        fed = true
        println("вы покормили $name")
        return "вы покормили животное"
    }
    fun clean() : String{
        fed = false
        println("вы убрали за животным $name")
        return "вы убрали за животным"
    }
}


interface Flyable{
    fun fly()
}
interface Walkable{
    fun walk()
}
interface Swimable{
    fun swim()
}
interface Crawlable{
    fun crawl()
}
interface Voiceable{
    fun voice()
}


class Dog(name: String, age: Int): Pet(name, age), Walkable, Swimable, Voiceable{
    override fun walk() {
        println("walk")
    }
    override fun swim(){
        println("water")
    }
    override fun voice(){
        println("bark")
    }
    override fun eat(): String{
        return "eats dog food"
    }
}

open class Cat(name: String, age: Int): Pet(name, age), Walkable, Swimable, Voiceable, Crawlable{
    override fun walk(){
        println("walk")
    }
    override fun swim(){
        println("water")
    }
    override fun voice(){
        println("Meow meow meow!!!")
    }
    override fun crawl(){
        println("sneak")
    }
    override fun eat(): String{
        return "eats cat food"
    }

}

class Parrot(name: String, age: Int): Pet(name, age), Flyable, Voiceable, Walkable{
    override fun walk(){
        walk()
    }
    override fun voice(){
        println("SKREEEEEEEEEEEEEEEEEEEECH")
    }
    override fun fly(){
        println("fly")
    }
    override fun eat(): String{
        return "eats parrot food"
    }

}

class Snake(name: String, age: Int): Pet(name, age), Voiceable, Crawlable{
    override fun voice(){
        println("hhssssssss")
    }
    override fun crawl(){
        println("sneak")
    }
    override fun eat(): String{
        return "eats snake food"
    }
}

class Fish(name: String, age: Int): Pet(name, age), Swimable{
    override fun swim() {
        println("swim")
    }
    override fun eat(): String{
        return "eats fish food"
    }

}


fun main(){
    var myFish = Fish("Pep", 3)
    var mySnake = Snake("Oro", 27)
    var myParrot = Parrot("Rosh", 4)
    var myCat = Cat("Drem", 10)
    var myDog = Dog("Debora", 7)
}


