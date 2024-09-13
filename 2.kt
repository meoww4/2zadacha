fun main() {
    println("Введите строку для подсчета количества различных символов:")
    val input = readLine() ?: ""

    if (input.isEmpty()) {
        println("Ошибка: Введена пустая строка.")
        return
    }

    val charCount = input.groupingBy { it }.eachCount().toSortedMap()

    println("Результат:")
    charCount.forEach { (char, count) -> println("$char - $count") }
}
