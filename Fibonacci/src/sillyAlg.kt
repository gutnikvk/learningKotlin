fun main() {
    println("Input a non-negative integer")
    val n: Int = readLine()?.toInt() ?: throw IllegalArgumentException("Got no input")
    println(getFibonacciNumber(n))
}

fun getFibonacciNumber(n: Int): Int {
    return if (n<=1) {
        n
    } else {
        getFibonacciNumber(n-1) + getFibonacciNumber(n-2)
    }
}