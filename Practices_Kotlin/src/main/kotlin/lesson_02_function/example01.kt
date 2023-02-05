import java.util.Scanner

infix fun Double.sum(x: Double): Double {
    return this + x;
}

infix fun Double.subtraction(x: Double): Double {
    return this - x;
}

infix fun Double.multiplication(x: Double): Double {
    return this * x;
}

infix fun Double.division(x: Double): Double {
    return this / x;
}


fun main() {
    println("Please ! Enter the two numbers is: ")
    val sc = Scanner(System.`in`)
    val a: Double = sc.nextDouble();
    val b: Double = sc.nextDouble();

    val sum = a sum b;
    val subtraction = a subtraction b;
    val multiplication = a multiplication b;
    val division = a division b;

    println("$a + $b = $sum")
    println("$a - $b = $subtraction")
    println("$a * $b = $multiplication")
    println("$a / $b = $division")
}

