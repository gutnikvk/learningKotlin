import java.text.DecimalFormat

data class Item(
    val cost: Double,
    val weight: Double
)

data class Bag(
    var items: Map<Item, Double>,
    var capacity: Double,
    var totalCost: Double
)

fun main() {
    val (itemsQuantity, capacity) = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
    var items = mutableListOf<Item>()
    var bag = Bag(
        items = emptyMap(),
        capacity = capacity.toDouble(),
        totalCost = 0.0
    )
    for (i in 1..itemsQuantity) {
        val (cost, weight) = readLine()!!
            .trim()
            .split(" ")
            .map { it.toDouble() }
        items.add(Item(cost, weight))
    }
    items.sortByDescending { it.cost / it.weight }
    while (bag.capacity > 0 && items.isNotEmpty()) {
        val item = items.first()
        if ((bag.capacity / item.weight).toInt() >= 1) {
            bag.items += Pair(item, 1.0)
            bag.capacity -= item.weight
            bag.totalCost += item.cost
            items.remove(item)
        } else {
            val proportion = (bag.capacity / item.weight)
            bag.items += Pair(item, proportion)
            bag.capacity -= item.weight * proportion
            bag.totalCost += item.cost * proportion
            items.remove(item)
        }
    }
    val outputString = DecimalFormat("#.000").format(bag.totalCost)
    println(outputString)
}