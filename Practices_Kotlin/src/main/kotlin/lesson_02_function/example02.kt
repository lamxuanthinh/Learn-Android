import java.util.Scanner

fun sumPoint(a: Double, b: Double, c: Double) {
    val result = a + b + c
    println("The sum point three subjects is : $result")
}

fun averagePoint(a: Double, b: Double, c: Double) {
    val result = (a + b + c) / 3
    println("The sum point three subjects is : $result")
}

fun ratePoint(a: Double, b: Double, c: Double) {
    val result = (a + b + c) / 3
    when {
        result >= 8.5 -> println("Excellent")
        8.0 <= result && result < 8.5 -> println("Good!")
        7.0 <= result && result < 7.9 -> println("Average!")
        6.5 <= result && result < 6.9 -> println("Below Average!")
        5.5 <= result && result < 6.4 -> println("Weak!")
        5.0 <= result && result < 5.4 -> println("Bad!")
    }
}


fun main() {
    val input = Scanner(System.`in`)
    println("Please! Enter the point subject three is :")
    val a: Double = input.nextDouble()
    val b: Double = input.nextDouble()
    val c: Double = input.nextDouble()
    var choose: Int;

    do {
        println("==========MENU==========")
        println("1.The sum point three subjects.")
        println("2.The average point three subjects.")
        println("3.The rate.")
        println("0.Exit.")
        choose = input.nextInt()
        when (choose) {
            0 -> println("Good Bye!")
            1 -> sumPoint(a, b, c)
            2 -> averagePoint(a, b, c)
            3 -> ratePoint(a, b, c)
            else -> {
                println("Please! Choose to 1 from 3.")
            }
        }

    } while (choose != 0)

}