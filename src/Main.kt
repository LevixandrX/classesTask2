import kotlin.math.sqrt
data class Point(val x: Double, val y: Double) {
    fun distanceTo(other: Point): Double {
        return sqrt((other.x - x) * (other.x - x) + (other.y - y) * (other.y - y))
    }
}

fun main() {
    println("Программа для вычисления расстояния между двумя точками на координатной плоскости.")

        fun readCoordinate(prompt: String): Double {
            while (true) {
                print(prompt)
                val input = readLine()
                if (input.isNullOrBlank()) {
                    println("Ошибка ввода: Ввод не может быть пустым.")
                    continue
                }

                val number = input.toDoubleOrNull()
                if (number != null) return number

                println("Ошибка ввода: Пожалуйста, введите корректное число.")
            }
        }

    println("Введите координаты первой точки:")
    val point1 = Point(readCoordinate("X1: "), readCoordinate("Y1: "))

    println("Введите координаты второй точки:")
    val point2 = Point(readCoordinate("X2: "), readCoordinate("Y2: "))

    val distance = point1.distanceTo(point2)
    println("Расстояние между точками: $distance")
}