fun main() {
    println("Input a non-negative integer")
    val n: Int = readLine()?.toInt() ?: throw IllegalArgumentException("Got no input")
    checkInputNumber(n)
    print(getFibonacciNumber(n))
}

private fun getFibonacciNumber(n: Int): Int {
    var fibonacciRow = emptyArray<Int>()
    for (i in 0..n) {
        if (i<=1) fibonacciRow += i
        else fibonacciRow += fibonacciRow[i-1] + fibonacciRow[i-2]
    }
    return fibonacciRow[n]
}

private fun checkInputNumber(n: Int) {
    if (n<0) throw java.lang.IllegalArgumentException("Got a negative number")
}