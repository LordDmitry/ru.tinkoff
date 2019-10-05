interface Flyable{
    abstract fun fly()
}
interface Walkable{
    abstract fun walk()
}
interface Swimable{
    abstract fun swim()
}
interface Crawlable{
    abstract fun crawl()
}
interface Voiceable{
    abstract fun voice()
}


class Dog(name: String, age: Int): Walkable, Swimable, Voiceable{
    override fun walk(){
        println("walk")
    }
    override fun swim(){
        println("water")
    }
    override fun voice(){
        println("bark")
    }
}

class Cat(name: String, age: Int): Walkable, Swimable, Voiceable, Crawlable{
    override fun walk(){
        println("walk")
    }
    override fun swim(){
        println("water")
    }
    override fun voice(){
        println("meow")
    }
    override fun crawl(){
        println("sneak")
    }
}

class Parrot(name: String, age: Int): Flyable, Voiceable, Walkable{
    override fun walk(){
        walk()
    }
    override fun voice(){
        println("SKREEEEEEEEEEEEEEEEEEEECH")
    }
    override fun fly(){
        print("fly")
    }
}

class Snake(name: String, age: Int): Voiceable, Crawlable{
    override fun voice(){
        println("hhssssssss")
    }
    override fun crawl(){
        println("sneak")
    }
}

class Fish(name: String, age: Int): Swimable{
    override fun swim() {
        println("swim")
    }
}


fun main(){
    var myFish = Fish("Pep", 3)
    var mySnake = Snake("Oro", 27)
    var myParrot = Parrot("Rosh", 4)
    var myCat = Cat("Drem", 10)
    var myDog = Dog("Debora", 7)
}


