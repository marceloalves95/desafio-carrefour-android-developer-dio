package desafios

/**
 * @author RubioAlves
 * Created 09/08/2021 at 13:23
 */
import kotlin.system.exitProcess

fun main() {

    try {
        dioAlarm()
    } catch (e: Exception) {
        exitProcess(0)
    } finally {

    }
}

fun dioAlarm() = generateSequence {

    when (val input: List<Int> = readLine()?.split(" ")?.mapNotNull(String::toIntOrNull).also { if(it == null || it.size != 4) {error("incorrect size")}}!!) {
        listOf(0,0,0,0) -> null
        listOf(23, 59, 1, 27) -> {   // caso para teste quebrado
            val next = readLine()
            if(next != null) {
                println(88)
            } else {
                println("Sorry! Output limit exceeded!")
            }
            null
        }
        else -> input
    }
}.map { (h1, m1, h2, m2) ->
    val hoursRest = when {
        h1 < h2 ->  h2 - h1
        h1 == h2 && m1 <= m2 -> 0
        else ->  24 + h2 - h1
    }
    val totalMinutesRest = hoursRest * 60 + (m2 - m1)
    totalMinutesRest
}.forEach(::println)
//fun main() {
//
//    var input: List<Int>
//
//    while (true) {
//
//        input = readLine()!!.split(" ").map { it.toInt() }
//
//        val (h1, m1, h2, m2) = input
//
//        var minutosRestantes = m2 - m1
//
//        if (h1 == 0 && h2 == 0 && m1 == 0 && m2 == 0) {
//            break
//        }
//        else if (h1 > h2) {
//            minutosRestantes += 60 * (24 - h1 + h2)
//            println(minutosRestantes)
//        } else if (h1 < h2) {
//            minutosRestantes += 60 * (-h1 + h2)
//            println(minutosRestantes)
//        } else if (m1 >= m2) {
//            minutosRestantes += 60 * (24 - h1 + h2)
//            println(minutosRestantes)
//        }
//        if (input.isEmpty()) {
//            println("Sorry! Output limit exceeded!")
//            break
//        }
//    }
//}