import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите число: ")
    var n = reader.nextInt()
    var s = 0
    var m = 1

    while (n > 0) {
        s += n % 10
        m *= n % 10
        n = n / 10
    }

    println("Сумма: $s")
    println("Произведение: $m")
}