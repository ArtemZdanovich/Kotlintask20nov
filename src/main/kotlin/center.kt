
    fun main() {
        var numbers: MutableList<Double> = mutableListOf(5.0, 6.0, 7.0, 8.0, 9.0)

        println(center(numbers))
    }
    fun center(mutlist: MutableList<Double>): MutableList<Double> {
        val newList = when {
            mutlist.isEmpty() -> mutlist
            else -> {
                val averageSum = mutlist.average()
                mutlist.replaceAll { it - averageSum}

                mutlist
            }
        }
        return newList
    }



