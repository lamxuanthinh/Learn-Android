import java.util.Scanner

fun printArray(array: IntArray) {
    print("Array is: ")
    for (item in array) {
        print("$item ")
    }
    println("");
}


fun main() {
    val input = Scanner(System.`in`)
    println("Please! Enter the number on array.")
    val n: Int = input.nextInt()
    val array = IntArray(n)

    for (item in 0 until n) {
        print("array[$item] = ")
        val valueArray: Int = input.nextInt();
        array[item] = valueArray;
    }

    printArray(array)

    var choose: Int;
    do {
        println("==========MENU==========")
        println("1.Sum array.")
        println("2.Multiplication array.")
        println("3.Element max.")
        println("4.Element min.")
        println("5.Average.")
        println("6.Sort.")
        println("0.Exit.")
        println("Please! Choose the number to 0 from 6:")
        choose = input.nextInt()

        when (choose) {
            0 -> println("Good Bye.")
            1 -> {
                var result = array.sum()
                println("Sum array is: $result")
            }

            2 -> {
                var result: Int = 1;
                for (item in array) {
                    result *= item
                }
                println("Multiplication array is: $result")
            }

            3 -> {
                val max: Int = array.maxOrNull() ?: 0
                println("The element max is: $max")
            }

            4 -> {
                val min: Int = array.minOrNull() ?: 0
                println("The element max is: $min")
            }

            5 -> {
                var result = array.sum() / array.size
                println("The average array is: $result")
            }

            6 -> {
                array.sort()
                printArray(array)
            }

            else -> {
                println("Please! Choose the number to 0 from 6:")
            }
        }

    } while (choose != 0)
}