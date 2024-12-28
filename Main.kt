fun String.myLet(action: (String) -> Unit) {
    action(this)
}

class City(val name: String) {
    var population: Int = 0

    fun printInfo() {
        println("Город: $name, Население: $population")
    }
}

fun main() {
    "Привет, мир!".myLet { str ->
        println("Строка: $str, Длина: ${str.length}")
    }

    val city = City("Москва").apply {
        population = 12500000
    }
    city.printInfo()


    val numbers = intArrayOf(1, 2, 3, 4, 5)

    with(numbers) {
        println("Массив: ${this.joinToString()}")
        println("Количество элементов: ${this.size}")
        println("Сумма элементов: ${this.sum()}")
    }
}