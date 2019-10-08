import java.util.Scanner

class Car() {
    fun ride(km: Int) {
        var N = km
        println("Поехали")
        while (N > 0) {
            println("осталось $N километров")
            N--
        }
        println("приехали")
    }
}
private val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val car = Car()
    car.ride(scan.nextInt())
}