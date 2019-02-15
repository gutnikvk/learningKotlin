package fibonacci

fun main() {
    println("Input a non-negative integer")
    val n: Int = readLine()?.toInt() ?: throw IllegalArgumentException("Got no input")
    checkInputNumber(n)
    println(getFibonacciNumber(n))
}

private fun getFibonacciNumber(n: Int): Int {
    return if (n <= 1) n
    else getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2)
}

private fun checkInputNumber(n: Int) {
    if (n<0) throw java.lang.IllegalArgumentException("Got a negative number")
}


