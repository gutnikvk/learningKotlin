data class Segment(
    val left: Int,
    val right: Int
)

fun main() {
    val n = readLine()!!.toInt()
    var segments = mutableListOf<Segment>()
    for (i in 1..n) {
        val (left, right) = readLine()!!
            .trim()
            .split(" ")
            .map { it.toInt() }
        segments.add(Segment(left, right))
    }
    segments.sortBy { it.right }
    val dots = mutableListOf<Int>()
    while (segments.isNotEmpty()) {
        val newDot = segments[0].right
        dots.add(newDot)
        segments = segments
            .filterNot { newDot in it.left..it.right }
            .toMutableList()
    }
    println(dots.count())
    var outputString = ""
    dots.forEach { dot -> outputString += "$dot " }
    print(outputString.trim())
}