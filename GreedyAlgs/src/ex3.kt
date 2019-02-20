fun main() {
    var inputNumber = readLine()!!.toInt()
    val answer = mutableListOf<Int>()
    loop@ for (i in 1..inputNumber) {
        when {
            inputNumber - i > i -> {
                answer.add(i)
                inputNumber -= i
            }
            inputNumber - i == 0 -> {
                answer.add(i)
                break@loop
            }
            else -> { }
        }
    }
    println(answer.count())
    var outputString = ""
    for (number in answer) {
        outputString += " $number"
    }
    println(outputString.trim())
}