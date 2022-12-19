fun main() {
    fun part1(input: List<String>): Int {
        val caloriesPerElf: MutableMap<Int, Int> = mutableMapOf()
        val index = 0
        val largestSum = 0
        input.forEach {
            if (it.isNullOrEmpty()) {
                ++index
            } else {
                caloriesPerElf[index] += it.toInt()
            }
        }
        
        return caloriesPerElf.maxBy { it.value }.value
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 1)

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
