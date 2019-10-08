import java.util.Scanner

private val scan = Scanner(System.`in`)

private fun makeCatVoice(e: cat){
    e.voice()
}
private open class cat() {
    open fun voice() {
        println("Meow meow meow!!!")
    }
}
private class HomeCat(val name: String): cat(){
    override fun voice(){
        println("Meoooooow! Feed me, $name!")
    }

}
fun main(args: Array<String>) {
    val usualCat = cat()        // Создаем обычного кота

    val name = scan.next()      // Считываем имя
    val homeCat = HomeCat(name) // Передаём в конструктор

    val num = scan.nextInt()

    repeat(num) {
        makeCatVoice(usualCat)
        makeCatVoice(homeCat)
    }
}