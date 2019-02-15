package gcd

import java.lang.Integer.max

fun main() {
    val (a, b) = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
    var gcd = 1
    for (d in 1..max(a, b)) {
        if (a % d == 0 && b % d == 0) gcd = d
    }
    print(gcd)
}