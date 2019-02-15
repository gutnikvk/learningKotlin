package gcd

fun main() {
    val (a, b) = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
    print(gcd(a, b))
}

private fun gcd(a: Int, b: Int): Int {
    return if (a == 0) b
    else if (b == 0) a
    else if (a >= b) gcd(a % b, b)
    else gcd(a, b % a)
}