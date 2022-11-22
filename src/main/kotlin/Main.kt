import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите число: ")
    var n = reader.nextInt()
    var s = 0
    var m = 1

    if (n == 0){
        m = 0
    }

    while (n > 0) {
        val r = n % 10
        s += r
        m *= r
        n = n / 10
    }

    println("Сумма: $s")
    println("Произведение: $m")
}